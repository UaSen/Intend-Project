package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ///create text view object
    TextView view1;
    TextView view2;
    TextView view3;

    //create button objects
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        view1 = findViewById(R.id.setNo1);
        view2 = findViewById(R.id.setNo2);
        view3 = findViewById(R.id.viewValue);

        //create intent object
        Intent intent = getIntent();

        //store passing values from main activity
        final int no1 = intent.getIntExtra("NO1", 0);
        final int no2 = intent.getIntExtra("NO2", 0);


        view1.setText(String.valueOf(no1));
        view2.setText(String.valueOf(no2));

        btn1 = findViewById(R.id.plus);
        btn2 = findViewById(R.id.substract);
        btn3 = findViewById(R.id.multiply);
        btn4 = findViewById(R.id.divition);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //addition calculate
                int value = no1 + no2;
                view3.setText(String.valueOf(no1) + " + " + String.valueOf(no2) + " = " + String.valueOf(value));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //subtraction calculation
                int value = no1 - no2;
                view3.setText(String.valueOf(no1) + " - " + String.valueOf(no2) + " = " + String.valueOf(value));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //multiply calculation
                int value = no1 * no2;
                view3.setText(String.valueOf(no1) + " * " + String.valueOf(no2) + " = " + String.valueOf(value));

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //divition calculation
                int value = no1 / no2;
                view3.setText(String.valueOf(no1) + " /" + String.valueOf(no2) + " = " + String.valueOf(value));

            }
        });

    }

}