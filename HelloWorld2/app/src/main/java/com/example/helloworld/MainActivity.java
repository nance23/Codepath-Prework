package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // change text color of the label
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_700));
            }
        });

        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // light yellow -- #f1df9d
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_yellow));
            }
        });
    }
}