package com.example.chriswolberg.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orders extends AppCompatActivity {

    //declaring buttons
    private Button fleetButton , engageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        fleetButton = (Button) findViewById(R.id.fleetButton);
        engageButton = (Button) findViewById(R.id.ordersButton);

        Button fleetButton = (Button) findViewById(R.id.fleetButton);
        Button engageButton = (Button) findViewById(R.id.engageButton);

        //setting listeners for buttons
        fleetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(orders.this, fleet.class));
            }
        });



        engageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(orders.this, c1.class));
            }
        });
    }
}
