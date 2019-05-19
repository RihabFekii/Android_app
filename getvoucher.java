package com.example.asus.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class getvoucher extends AppCompatActivity {

    Random r ;
    int output ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getvoucher);


        r = new Random(1000000);
        Button BtnBeginPres = findViewById(R.id.btnBeginPres);
        final TextView voucher= findViewById(R.id.voucher_output);
        Button get_voucher = findViewById(R.id.btn_getvoucher);

        get_voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                output = r.nextInt(10000000);
                    voucher.setText("" + output);

            }
        });

        BtnBeginPres.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(getvoucher.this, PresOptionsActivity.class);
                startActivity(k);
            }
        });


    }
}
