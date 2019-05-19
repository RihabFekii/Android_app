package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionQuestionsActivity extends AppCompatActivity {

    Button AskQuestion , Myquestions ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_questions);

        AskQuestion = (Button) findViewById(R.id.askquestion);
        Myquestions = (Button) findViewById(R.id.myquestions);

        AskQuestion.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(OptionQuestionsActivity.this, AskQuestionActivity.class);
                startActivity(k);
            }
        });

        Myquestions.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(OptionQuestionsActivity.this, MyQuestionsActivity.class);
                startActivity(k);
            }
        });
    }
}
