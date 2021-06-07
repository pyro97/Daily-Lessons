package pyroapp.myapplication.ui.tab;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import pyroapp.myapplication.data.db.TinyDB;
import pyroapp.myapplication.data.db.model.Subject;
import pyroapp.myapplication.ui.common.CustomAdapter;

public class FragmentTabPresenter implements FragmentTabContract.Presenter {

    private Context context;
    private TinyDB tinyDB;
    private CustomAdapter customAdapter;
    private String selectedDay;
    private FragmentTabContract.View view;

    FragmentTabPresenter(Context context, TinyDB db, CustomAdapter customAdapter, String selectedDay, FragmentTabContract.View view) {
        this.context = context;
        this.tinyDB = db;
        this.customAdapter = customAdapter;
        this.selectedDay = selectedDay;
        this.view = view;
    }

    @Override
    public ArrayList<Object> getAllElements() {
        return tinyDB.getListObject(selectedDay, Subject.class);
    }

    @Override
    public Object getElementByIndex(int position) {
        return tinyDB.getListObject(selectedDay, Subject.class).get(position);
    }

    @Override
    public void addElement(Subject subject) {
        ArrayList<Object> elements = getAllElements();
        elements.add(subject);
        tinyDB.putListObject(selectedDay, elements);
        updateAdapter();

    }

    @Override
    public void editListElements(ArrayList<Object> elements) {
        tinyDB.putListObject(selectedDay, elements);
        updateAdapter();

    }

    @Override
    public void selectAction(int position) {
        view.showActionDialog(position);
    }

    @Override
    public void updateAdapter() {
        customAdapter.clear();
        ArrayList<Object> elements = new ArrayList<>();
        elements.addAll(getAllElements());
        Collections.sort(elements, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Subject subject = (Subject) o1;
                Subject subject2 = (Subject) o2;
                try{
                    int sub1 = Integer.parseInt(subject.getTime());
                    int sub2 = Integer.parseInt(subject2.getTime());
                    if(sub1 > sub2){
                        return 1;
                    } else if(sub1 == sub2){
                        return 0;
                    } else return -1;
                } catch (NumberFormatException ex){
                    return -1;
                }

            }
        });
        tinyDB.putListObject(selectedDay, elements);
        for (int j = 0; j < elements.size(); j++) {
            Subject subject = (Subject) elements.get(j);
            customAdapter.add(subject);
        }
        customAdapter.notifyDataSetChanged();
    }
}
