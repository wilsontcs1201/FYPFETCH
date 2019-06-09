package com.example.fypfetch;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private ImageView customerbtn;
    private ImageView Driverbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        customerbtn = (ImageView) findViewById(R.id.customerbtm);

        customerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
        Driverbtn = (ImageView) findViewById(R.id.driverbtm);
        Driverbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity1();
            }
        });


    }
    private void launchActivity() {

        Intent intent = new Intent(this, customerpage.class);
        startActivity(intent);
    }

    private void launchActivity1() {

        Intent intent = new Intent(this, driverpage.class);
        startActivity(intent);
    }
}
