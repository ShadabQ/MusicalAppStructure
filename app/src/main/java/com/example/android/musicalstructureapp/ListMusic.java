package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListMusic extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_music);

        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};
       /* ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_list_music, mobileArray);*/

        ListView listView = (ListView) findViewById(R.id.list_music);
        //listView.setAdapter(adapter);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, mobileArray);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
    }
}
