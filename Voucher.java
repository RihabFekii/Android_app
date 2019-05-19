package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Voucher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);

        Button voucher = findViewById(R.id.submit_voucher);

        voucher.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(Voucher.this, Login_Audiance.class);
                startActivity(k);
            }
        });
    }
}
