package pyroapp.myapplication.ui.main;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import pyroapp.myapplication.ui.tab.FragmentTab;
import pyroapp.myapplication.R;
import pyroapp.myapplication.utils.Constants;
import pyroapp.myapplication.utils.WeekDaysEnum;


public class MainActivity extends AppCompatActivity {

    /**
     * The {@link PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private InterstitialAd mInterstitialAd;
    private ScheduledExecutorService scheduler;
    private boolean isVisible;
    public static final int initialDelay = 30, period = 45;
    private MainPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        mPresenter.initializeBanner();
        mInterstitialAd = mPresenter.initializeInterstital();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        String weekDay;
        SimpleDateFormat dayFormat = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.US);

        Calendar calendar = Calendar.getInstance();
        weekDay = dayFormat.format(calendar.getTime());

        switch (WeekDaysEnum.valueOf(weekDay)){
            case MONDAY:
                mViewPager.setCurrentItem(0);
                break;
            case TUESDAY:
                mViewPager.setCurrentItem(1);
                break;
            case WEDNESDAY:
                mViewPager.setCurrentItem(2);
                break;
            case THURSDAY:
                mViewPager.setCurrentItem(3);
                break;
            case FRIDAY:
                mViewPager.setCurrentItem(4);
                break;
            case SATURDAY:
                mViewPager.setCurrentItem(5);
                break;
        }
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    @Override
    protected void onStart() {
        super.onStart();
        isVisible = true;
        if (scheduler == null) {
            scheduler = Executors.newSingleThreadScheduledExecutor();
            scheduler.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            if (mInterstitialAd.isLoaded() && isVisible) {
                                mInterstitialAd.show();
                            }
                            mInterstitialAd = mPresenter.initializeInterstital();
                        }
                    });
                }
            }, initialDelay, period, TimeUnit.SECONDS);

        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        scheduler.shutdownNow();
        scheduler = null;
        isVisible = false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle args = new Bundle();
            switch (position) {
                case 0:
                    FragmentTab t1 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.MONDAY));
                    t1.setArguments(args);
                    return t1;
                case 1:
                    FragmentTab t2 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.TUESDAY));
                    t2.setArguments(args);
                    return t2;
                case 2:
                    FragmentTab t3 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.WEDNESDAY));
                    t3.setArguments(args);
                    return t3;
                case 3:
                    FragmentTab t4 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.THURSDAY));
                    t4.setArguments(args);
                    return t4;
                case 4:
                    FragmentTab t5 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.FRIDAY));
                    t5.setArguments(args);
                    return t5;
                case 5:
                    FragmentTab t6 = new FragmentTab();
                    args.putString(Constants.KEY_DAY, String.valueOf(WeekDaysEnum.SATURDAY));
                    t6.setArguments(args);
                    return t6;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 6;
        }

    }
}
