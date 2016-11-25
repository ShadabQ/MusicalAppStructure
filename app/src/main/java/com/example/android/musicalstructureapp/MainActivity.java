package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.addMore);
        button.setOnClickListener(buttonListener);

        View card1  =   (View) findViewById(R.id.card1);
        card1.setOnClickListener(cardListener);
        View card2  =   (View) findViewById(R.id.card2);
        card2.setOnClickListener(cardListener);
        View card3  =   (View) findViewById(R.id.card3);
        card3.setOnClickListener(cardListener);
        View card4  =   (View) findViewById(R.id.card4);
        card4.setOnClickListener(cardListener);
        View card5  =   (View) findViewById(R.id.card5);
        card5.setOnClickListener(cardListener);
    }


    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            // Yes we will handle click here but which button clicked??? We don't know

            Intent addMusic = new Intent(MainActivity.this, AddMusic.class);
            startActivity(addMusic);
        }
    };


    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener cardListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            // Yes we will handle click here but which button clicked??? We don't know

            Intent listMusic = new Intent(MainActivity.this, ListMusic.class);
            startActivity(listMusic);
        }
    };
}
