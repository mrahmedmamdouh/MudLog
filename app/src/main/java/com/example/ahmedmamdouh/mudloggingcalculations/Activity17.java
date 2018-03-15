package com.example.ahmedmamdouh.mudloggingcalculations;

/**
 * Created by Ahmed Mamdouh on 16/09/2016.
 */

public class Activity17 extends android.support.v7.app.AppCompatActivity    {
android.widget.EditText mEditText1;
android.widget.Button mButton;
android.widget.TextView mTextView;
android.widget.TextView mTextView1;

@Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(com.example.ahmedmamdouh.mudloggingcalculations.R.layout.layout17);

    //Bind the EditText views

    mEditText1= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.value);
    mTextView= (android.widget.TextView)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.value2);
    mTextView1= (android.widget.TextView)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.value3);


    mButton =  (android.widget.Button)findViewById(R.id.button11);
    mButton.setOnClickListener(new android.view.View.OnClickListener() {

        @Override
        public void onClick(android.view.View v) {
            //When the button is clicked, call the calucate method.
            calculate();
        }
    });

}

public void calculate(){
    //get entered texts from the edittexts,and convert to integers.
    Double value1 = Double.parseDouble(mEditText1.getText().toString());
    //do the calculation
    Double calculatedValue = (34.49*value1);
    //set the value to the textview, to display on screen.
    mTextView.setText(calculatedValue.toString());

    Double answer= calculatedValue / 1000;
    mTextView1.setText(answer.toString());

}

}
