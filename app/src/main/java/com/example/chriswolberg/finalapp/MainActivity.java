package com.example.chriswolberg.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declaring buttons
    private Button fleetButton , ordersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fleetButton = (Button) findViewById(R.id.fleetButton);
        ordersButton = (Button) findViewById(R.id.ordersButton);

        Button fleetButton = (Button) findViewById(R.id.fleetButton);
        Button ordersButton = (Button) findViewById(R.id.ordersButton);

        //setting listeners for buttons

        fleetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, fleet.class));
            }
        });



        ordersButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, orders.class));
            }
        });



    }



}
