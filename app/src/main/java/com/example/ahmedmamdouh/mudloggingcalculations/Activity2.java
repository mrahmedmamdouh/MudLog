package com.example.ahmedmamdouh.mudloggingcalculations;

/**
 * Created by Ahmed Mamdouh on 13/09/2016.
 */

public class Activity2 extends android.support.v7.app.AppCompatActivity implements android.view.View.OnClickListener {

android.widget.Button button;
android.widget.Button button2;
android.widget.Button button3;
android.widget.Button button4;
android.widget.Button button5;
android.widget.Button button6;
android.widget.Button button7;
android.widget.Button button8;
android.widget.Button button9;
android.widget.Button button10;


@Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout2);

    android.widget.Button button= (android.widget.Button) findViewById(R.id.button);
    button.setOnClickListener(this);
    android.widget.Button button2= (android.widget.Button) findViewById(R.id.button2);
    button2.setOnClickListener(this);
    android.widget.Button button3= (android.widget.Button) findViewById(R.id.button3);
    button3.setOnClickListener(this);
    android.widget.Button button4= (android.widget.Button) findViewById(R.id.button4);
    button4.setOnClickListener(this);
    android.widget.Button button5= (android.widget.Button) findViewById(R.id.button5);
    button5.setOnClickListener(this);
    android.widget.Button button6= (android.widget.Button) findViewById(R.id.button6);
    button6.setOnClickListener(this);
    android.widget.Button button7= (android.widget.Button) findViewById(R.id.button7);
    button7.setOnClickListener(this);
    android.widget.Button button8= (android.widget.Button) findViewById(R.id.button8);
    button8.setOnClickListener(this);
    android.widget.Button button9= (android.widget.Button) findViewById(R.id.button9);
    button9.setOnClickListener(this);
    android.widget.Button button10= (android.widget.Button) findViewById(R.id.button10);
    button10.setOnClickListener(this);


}
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity7.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }

    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button2:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity8.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button3:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity9.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button4:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity10.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button5:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity11.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button6:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity12.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button7:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity13.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button8:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity14.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button9:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity15.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }
    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.button10:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity16.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }

}

}
