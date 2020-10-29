package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView testlist;
    String[] friends = {"Amit","Hema","Muskan","Priyanka","Abhay"};
    String[] catchlines = {"It's Showtime","Honesty is the best policy","Hey you guys","We are best friends","I know Nothing"};
    int[] images = {R.drawable.icon ,R.drawable.icon,R.drawable.icon ,R.drawable.icon,R.drawable.icon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testlist = findViewById(R.id.test);
        ProgramAdapter programAdapter = new ProgramAdapter(this,friends,images,catchlines);
        testlist.setAdapter(programAdapter);
    }
}