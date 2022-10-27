package com.example.mmmm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView nametext  = findViewById(R.id.id3);
        TextView agetext = findViewById(R.id.id4);
        TextView device = findViewById(R.id.id5);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("n");
        String age = bundle.getString("a");
        String Device = bundle.getString("d");

        nametext.setText(name);
        agetext.setText(age);
        device.setText(Device);
    }
}