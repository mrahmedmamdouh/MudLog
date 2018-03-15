package com.example.ahmedmamdouh.mudloggingcalculations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

android.widget.Button metal_volume_calc;
android.widget.Button steel_volume_calc;
android.widget.Button cement_calc;
android.widget.Button conversion;
android.widget.Button string_weight;



@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(com.example.ahmedmamdouh.mudloggingcalculations.R.layout.activity_main);



   android.widget.Button metal_volume_calc= (android.widget.Button) findViewById(R.id.metal_volume_calc);
    metal_volume_calc.setOnClickListener(this);
    android.widget.Button steel_volume_calc= (android.widget.Button) findViewById(R.id.steel_volume_calc);
    steel_volume_calc.setOnClickListener(this);
    android.widget.Button bhp_calc= (android.widget.Button) findViewById(R.id.conversion);
    bhp_calc.setOnClickListener(this);
    android.widget.Button string_weight= (android.widget.Button) findViewById(R.id.string_weight);
    string_weight.setOnClickListener(this);
}
public void onClick(View v) {
    switch (v.getId()) {
        case R.id.metal_volume_calc:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity2.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }

    switch (v.getId()) {
        case R.id.steel_volume_calc:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity3.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }

    switch (v.getId()) {
        case com.example.ahmedmamdouh.mudloggingcalculations.R.id.conversion:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity4.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }



    switch (v.getId()) {
        case R.id.string_weight:
            android.content.Intent intent = new android.content.Intent(this, com.example.ahmedmamdouh.mudloggingcalculations.Activity5.class);
            startActivity(intent);
            // TODO Call second activity
            break;
        default:
            break;
    }

}
}


