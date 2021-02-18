package pyroapp.myapplication.ui.tab;

import java.util.ArrayList;

import pyroapp.myapplication.data.db.model.Subject;

public class FragmentTabContract {

    public interface View {
        void showActionDialog(int position);
    }

    public interface Presenter {
        ArrayList<Object> getAllElements();

        void addElement(Subject subject);

        void updateAdapter();

        void editListElements(ArrayList<Object> elements);

        void selectAction(int position);

        Object getElementByIndex(int position);

    }
}
