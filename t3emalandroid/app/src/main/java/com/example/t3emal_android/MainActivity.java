package com.example.t3emal_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nametext = findViewById(R.id.d1);
        EditText agetext = findViewById(R.id.d2);
        EditText Devicetype = findViewById(R.id.d3);
        Button enter = findViewById(R.id.button);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, age, Device;
                name = nametext.getText().toString();
                age = agetext.getText().toString();
                Device = Devicetype.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("n", name);
                intent.putExtra("a", age);
                intent.putExtra("d", Device);
                startActivity(intent);
            }
        });

    }
}