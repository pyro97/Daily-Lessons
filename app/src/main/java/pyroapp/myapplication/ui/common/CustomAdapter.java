package pyroapp.myapplication.ui.common;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import pyroapp.myapplication.ui.tab.FragmentTabPresenter;
import pyroapp.myapplication.R;
import pyroapp.myapplication.data.db.model.Subject;
import pyroapp.myapplication.utils.Utils;

public class CustomAdapter extends ArrayAdapter<Subject> {
    private int resource;
    private LayoutInflater inflater;
    private Subject row;
    private Context context;
    private Button time;
    private TextView classroom, subject;
    private FragmentTabPresenter presenter;

    public CustomAdapter(Context context, int resource, List<Subject> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(final int position, View v, ViewGroup parent) {
        if (v == null) {
            v = inflater.inflate(R.layout.list_element, null);
        }
        row = getItem(position);
        time = v.findViewById(R.id.time);
        classroom = v.findViewById(R.id.classroom);
        subject = v.findViewById(R.id.subject);

        time.setText(row.getTime());
        time.setBackgroundColor(Utils.getColor(position));
        subject.setText(row.getSubjectName());
        classroom.setText(row.getClassroom());
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.selectAction(position);
            }
        });
        return v;
    }

    public void setPresenter(FragmentTabPresenter t) {
        presenter = t;
    }
}
