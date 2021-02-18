package pyroapp.myapplication.ui.main;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import pyroapp.myapplication.utils.Constants;

public class MainPresenter implements MainContract {
    private Context context;

    MainPresenter(Context context){
        this.context = context;
    }

    @Override
    public void initializeBanner() {
        MobileAds.initialize(this.context, Constants.BANNER);
    }

    @Override
    public InterstitialAd initializeInterstital() {
        MobileAds.initialize(this.context, Constants.BANNER);
        InterstitialAd mInterstitialAd = new InterstitialAd(this.context);
        mInterstitialAd.setAdUnitId(Constants.INTERSTITIAL);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        return mInterstitialAd;
    }
}
