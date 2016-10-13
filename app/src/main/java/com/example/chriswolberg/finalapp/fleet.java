package com.example.chriswolberg.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fleet extends AppCompatActivity {


    //declaring button variable
    private Button ordersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet);

        ordersButton = (Button) findViewById(R.id.ordersButton);
        Button ordersButton = (Button) findViewById(R.id.ordersButton);


        //setting listener for button

        ordersButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(fleet.this, orders.class));
            }
        });
    }
}
