package com.example.demotodolist2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ToDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Obtain the Layout Inflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Inflate the view for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        //"Inflate" the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        //Obtain the Current To Do item information based on the position
        ToDoItem currentToDo = ToDoList.get(position);

        //Set the values to TextView to display the Title and Date
        tvTitle.setText(currentToDo.getTitle());
        tvDate.setText(currentToDo.toString());

        return rowView;
    }

}
