package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PresenterAudience extends AppCompatActivity {
    Button Presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presenter_audiance);

        // get the element (button , input text , image .....)
        Button Presenter = findViewById(R.id.presenter);


        //presenter
        Presenter.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(PresenterAudience.this, Login.class);
                startActivity(k);
            }
                });

        ///audiance
        Button Audiance = findViewById(R.id.Audiance);

        Audiance.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(PresenterAudience.this, Voucher.class);
                startActivity(k);
            }
        });
}
}


