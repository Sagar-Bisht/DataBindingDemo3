package com.example.databindingdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview = findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        recview.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        MyAdapter myAdapter = new MyAdapter(getStudent());
        recview.setAdapter(myAdapter);
    }
    public List<Student> getStudent(){
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("Sagar","android"));
        sList.add(new Student("akash","java"));
        sList.add(new Student("sandy","php"));
        sList.add(new Student("vishal","python"));
        sList.add(new Student("rohit","BCA"));
        sList.add(new Student("mohit","android"));
        sList.add(new Student("sohit","java"));
        sList.add(new Student("raman","android"));
        sList.add(new Student("sagar","android"));
        sList.add(new Student("sarak","c++"));
        sList.add(new Student("Sagar","android"));
        sList.add(new Student("akash","java"));
        sList.add(new Student("sandy","php"));
        sList.add(new Student("vishal","python"));
        sList.add(new Student("rohit","BCA"));
        sList.add(new Student("mohit","android"));
        sList.add(new Student("sohit","java"));
        sList.add(new Student("raman","android"));
        sList.add(new Student("sagar","android"));
        sList.add(new Student("sarak","c++"));
        sList.add(new Student("Sagar","android"));
        sList.add(new Student("akash","java"));
        sList.add(new Student("sandy","php"));
        sList.add(new Student("vishal","python"));
        sList.add(new Student("rohit","BCA"));
        sList.add(new Student("mohit","android"));
        sList.add(new Student("sohit","java"));
        sList.add(new Student("raman","android"));
        sList.add(new Student("sagar","android"));
        sList.add(new Student("sarak","c++"));
        return sList ;
    }
}