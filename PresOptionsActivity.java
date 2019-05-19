package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PresOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button Quest , Fb;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pres_options);

        Quest = (Button) findViewById(R.id.ques);
        Fb = (Button) findViewById(R.id.fb);

        Quest.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(PresOptionsActivity.this, SeeQuestPresActivity.class);
                startActivity(k);
            }
        });

        Fb.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(PresOptionsActivity.this, seeVoteActivity.class);
                startActivity(k);
            }
        });
    }
}
