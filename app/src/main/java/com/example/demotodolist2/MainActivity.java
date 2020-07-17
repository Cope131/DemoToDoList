package com.example.demotodolist2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    CustomAdapter customAdapter;
    ArrayList<ToDoItem> ToDoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        lvToDo = findViewById(R.id.listViewToDo);

        //initialize adapter
        customAdapter = new CustomAdapter(this, R.layout.row, ToDoList);

        //bridging
        lvToDo.setAdapter(customAdapter);

        //add items
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 0, 8);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 1, 8);

        ToDoList.add(new ToDoItem("Go for movie", date1));
        ToDoList.add(new ToDoItem("Go for haircut", date2));

    }

}