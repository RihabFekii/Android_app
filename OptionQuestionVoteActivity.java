package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OptionQuestionVoteActivity extends AppCompatActivity {

    ImageButton Qa , Vote ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_question_vote);

        Qa = (ImageButton) findViewById(R.id.imageView2) ;
        Vote = (ImageButton) findViewById(R.id.imageView3) ;

        Qa.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(OptionQuestionVoteActivity.this, OptionQuestionsActivity.class);
                startActivity(k);
            }
        });

        Vote.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(OptionQuestionVoteActivity.this, VoteActivity.class);
                startActivity(k);
            }
        });
    }
}
