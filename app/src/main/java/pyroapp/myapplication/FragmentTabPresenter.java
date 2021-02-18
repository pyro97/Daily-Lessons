package pyroapp.myapplication;

import android.content.Context;

import java.util.ArrayList;

public class FragmentTabPresenter implements FragmentTabContract.Presenter{

    private Context context;
    private TinyDB tinyDB;
    private CustomAdapter customAdapter;
    private String selectedDay;
    private FragmentTabContract.View view;

    FragmentTabPresenter(Context context, TinyDB db, CustomAdapter customAdapter, String selectedDay, FragmentTabContract.View view){
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
        tinyDB.putListObject(selectedDay,elements);
        customAdapter.add(subject);
        customAdapter.notifyDataSetChanged();

    }

    @Override
    public void editListElements(ArrayList<Object> elements) {
        tinyDB.putListObject(selectedDay,elements);
        customAdapter.clear();
        for(int j=0;j<elements.size();j++){
            Subject subject= (Subject) elements.get(j);
            customAdapter.add(subject);
        }
        customAdapter.notifyDataSetChanged();

    }

    @Override
    public void selectAction(int position) {
        view.showActionDialog(position);
    }

    @Override
    public void updateAdapter(){
        ArrayList<Object> elements = new ArrayList<>();
        elements.addAll(getAllElements());
        for(int j=0;j<elements.size();j++){
            Subject subject= (Subject) elements.get(j);
            customAdapter.add(subject);
        }
        customAdapter.notifyDataSetChanged();
    }
}
