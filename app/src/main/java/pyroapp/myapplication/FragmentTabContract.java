package pyroapp.myapplication;

import java.util.ArrayList;

public class FragmentTabContract {

    public interface View{
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
