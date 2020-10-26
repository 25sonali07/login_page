package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editTextName);
        password=(EditText)findViewById(R.id.editTextTextPassword3);
        submit=(Button)findViewById(R.id.button4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!name.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"You have Authentication Successfully",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(MainActivity.this,"Authentication failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}