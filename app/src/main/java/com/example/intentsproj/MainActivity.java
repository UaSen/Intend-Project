package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    //create button object
    Button button;

//  Toast toast;

    //create text view object
    TextView txt1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonOk);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                txt1 = findViewById(R.id.getNo1);
                int no1 = Integer.parseInt(txt1.getText().toString());

                txt2 = findViewById(R.id.getNo2);
                int no2 = Integer.parseInt(txt2.getText().toString());

                //passing values to second activity
                intent.putExtra("NO1", no1);
                intent.putExtra("NO2", no2);

                startActivity(intent);

//
//                Context contexts = getApplicationContext();
//                CharSequence message = "You just clicked the OK button";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(contexts, message, duration);
//                toast.show();



                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the custom toast.xml file
                View layout = li.inflate(R.layout.custome_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();


            }
       });

            }


}