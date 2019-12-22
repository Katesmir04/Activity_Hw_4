package com.example.dz_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            String name = arguments.get("name").toString();
            String number = arguments.getString("numb");
            textView.setText("Name: " + number + "\nNumber: " + name);
        }

        setContentView(textView);
    }
}
