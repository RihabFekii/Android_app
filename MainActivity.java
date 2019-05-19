package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // bind this activity with the activity_main.xml view
        setContentView(R.layout.activity_main);


        // get the element (button , input text , image .....)
        View btn = findViewById(R.id.btn_bgn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, PresenterAudience.class);
                startActivity(k);
            }
        });
    }
}
