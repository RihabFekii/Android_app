package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Audiance extends AppCompatActivity {
    Button BtnLoginAud ;
    EditText EditTextNameA , EditTextMailA , EditTextPasswordA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__audiance);

        BtnLoginAud = (Button) findViewById(R.id.btnLoginAud);
        EditTextPasswordA = (EditText) findViewById(R.id.editTextPasswordA);
        EditTextNameA = (EditText) findViewById(R.id.editTextNameA);
        EditTextMailA = (EditText) findViewById(R.id.editTextMailA);

        BtnLoginAud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextEmail = EditTextMailA.getText().toString();
                String editTextName = EditTextNameA.getText().toString();
                String editTextPassword = EditTextPasswordA.getText().toString();



                if (TextUtils.isEmpty(editTextEmail)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(editTextName)) {
                    Toast.makeText(getApplicationContext(), "Enter you Full Name!", Toast.LENGTH_SHORT).show();
                    return;
                }


                if (TextUtils.isEmpty(editTextPassword)) {
                    Toast.makeText(getApplicationContext(), "Enter the password!", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });

        BtnLoginAud.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(Login_Audiance.this, OptionQuestionVoteActivity.class);
                startActivity(k);
            }
        });


    }

}
