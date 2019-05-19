package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AskQuestionActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);

        Button BtnSendQuest = findViewById(R.id.btnSendQues);

        BtnSendQuest.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(AskQuestionActivity.this, OptionQuestionsActivity.class);
                startActivity(k);
            }
        });
    }


}
