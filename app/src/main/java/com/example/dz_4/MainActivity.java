package com.example.dz_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText nameT;
    EditText number;
    Button button;
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView1);

    }

    @Override
    public void onClick(View v) {
        nameT = (EditText) findViewById(R.id.editText);
        String name = nameT.getText().toString();
        number = (EditText) findViewById(R.id.editText2);
       
        String numb = number.getText().toString();

        Intent intent = new Intent(this, ActivityTwo.class);

        intent.putExtra("name", name);
        intent.putExtra("numb", numb);
        startActivity(intent);

    }


}
