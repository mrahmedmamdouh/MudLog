package com.example.ahmedmamdouh.mudloggingcalculations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;
import android.support.v7.appcompat.R;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by Ahmed Mamdouh on 13/09/2016.
 */

public class Activity5 extends android.support.v7.app.AppCompatActivity {

    android.widget.EditText mEditText1;
    android.widget.EditText mEditText2;
    android.widget.EditText mEditText3;
    android.widget.EditText mEditText4;
    android.widget.EditText mEditText5;
    android.widget.Button mButton;
    android.widget.TextView mTextView;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.ahmedmamdouh.mudloggingcalculations.R.layout.layout5);

        mEditText1= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.editText);
        mEditText1.setText("0");
        mEditText2= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.editText2);
        mEditText2.setText("0");
        mEditText3= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.editText3);
        mEditText3.setText("0");
        mEditText4= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.editText4);
        mEditText4.setText("0");
        mEditText5= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.editText5);
        mEditText5.setText("0");
        mTextView= (android.widget.TextView)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.textView19);


        Button mButton = (Button) findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.button15);

        mButton.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(android.view.View v) {
                //When the button is clicked, call the calucate method.
                calculate();
            }
        });}

        public void calculate(){
            //get entered texts from the edittexts,and convert to integers.
            Double value1 = Double.parseDouble(mEditText1.getText().toString());
            Double value2 = Double.parseDouble(mEditText2.getText().toString());
            Double value3 = Double.parseDouble(mEditText3.getText().toString());
            Double value4 = Double.parseDouble(mEditText4.getText().toString());
            Double value5 = Double.parseDouble(mEditText5.getText().toString());
            //do the calculation
            Double x = (value2*1.48*14)/1000;
            Double y= (value3*19.5*1.48)/1000;
            Double z= (value4*25.6*1.48)/1000;
            Double q= (13+x+y+z);
            Double s=(value5/7.86);

            Double K= (1-s);
            Double l=(K*q);

            Double calculatedValue= (l+(value1));
            //set the value to the textview, to display on screen.
            mTextView.setText(calculatedValue.toString());



    }



}
