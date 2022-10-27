package com.example.mmmm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nametext;
    private EditText agetext;
    private  EditText Devicetype;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         nametext = findViewById(R.id.d1);
         agetext = findViewById(R.id.d2);
         Devicetype = findViewById(R.id.d3);
         enter = findViewById(R.id.button);

        nametext.addTextChangedListener(loginTextWatcher);
        agetext.addTextChangedListener(loginTextWatcher);
        Devicetype.addTextChangedListener(loginTextWatcher);




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
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String usernameInput = nametext.getText().toString().trim();
            String ageInput = agetext.getText().toString().trim();
            String DevicetypeInput = Devicetype.getText().toString().trim();

            enter.setEnabled(!usernameInput.isEmpty() && !ageInput.isEmpty() && !DevicetypeInput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
