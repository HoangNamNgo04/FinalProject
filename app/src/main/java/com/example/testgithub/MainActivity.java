package com.example.testgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEvent();
        addControl();
    }

    void addControl()
    {
        
        button = (Button) findViewById(R.id.button);
    }
    void addEvent()
    {
        //yugukyfkuyf
    }

}