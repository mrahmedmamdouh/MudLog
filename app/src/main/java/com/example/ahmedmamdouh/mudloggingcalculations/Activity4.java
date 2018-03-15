package com.example.ahmedmamdouh.mudloggingcalculations;

import android.app.Activity;
import android.media.session.PlaybackState;
import android.support.annotation.Dimension;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import static android.R.id.input;
import static android.R.id.list;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.array.length_array;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.id.input2;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.id.list_item;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.id.spinner1;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.id.spinner2;
import static com.example.ahmedmamdouh.mudloggingcalculations.R.id.text1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ahmed Mamdouh on 13/09/2016.
 */

public class Activity4 extends android.support.v7.app.AppCompatActivity {


    EditText et1;
    TextView tv1;
    Spinner spinner1, spinner2;

    double v1, v2, res;
    double result,result1, result2, result3, result4, result5;
    Object value;
    Spinner fromSpinner, toSpinner,fromSpinner1, toSpinner1,fromSpinner2, toSpinner2,fromSpinner3, toSpinner3,fromSpinner4, toSpinner4,fromSpinner5, toSpinner5;
    EditText fromEditText, toEditText,fromEditText1, toEditText1,fromEditText2, toEditText2,fromEditText3, toEditText3,fromEditText4, toEditText4,fromEditText5, toEditText5;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);

        fromSpinner = (Spinner) findViewById(R.id.spinner1);
        toSpinner = (Spinner) findViewById(R.id.spinner2);
        fromEditText = (EditText) findViewById(R.id.input1);
        fromEditText.setText("0");
        toEditText = (EditText) findViewById(R.id.input2);
        fromSpinner1 = (Spinner) findViewById(R.id.spinner3);
        toSpinner1 = (Spinner) findViewById(R.id.spinner4);
        fromEditText1 = (EditText) findViewById(R.id.input3);
        fromEditText1.setText("0");
        toEditText1 = (EditText) findViewById(R.id.input4);
        fromSpinner2 = (Spinner) findViewById(R.id.spinner5);
        toSpinner2 = (Spinner) findViewById(R.id.spinner6);
        fromEditText2 = (EditText) findViewById(R.id.input5);
        fromEditText2.setText("0");
        toEditText2 = (EditText) findViewById(R.id.input6);
        fromSpinner3 = (Spinner) findViewById(R.id.spinner7);
        toSpinner3 = (Spinner) findViewById(R.id.spinner8);
        fromEditText3 = (EditText) findViewById(R.id.input7);
        fromEditText3.setText("0");
        toEditText3 = (EditText) findViewById(R.id.input8);
        fromSpinner4 = (Spinner) findViewById(R.id.spinner9);
        toSpinner4 = (Spinner) findViewById(R.id.spinner10);
        fromEditText4 = (EditText) findViewById(R.id.input9);
        fromEditText4.setText("0");
        toEditText4 = (EditText) findViewById(R.id.input10);
        fromSpinner5 = (Spinner) findViewById(R.id.spinner11);
        toSpinner5 = (Spinner) findViewById(R.id.spinner12);
        fromEditText5 = (EditText) findViewById(R.id.input11);
        fromEditText5.setText("0");
        toEditText5 = (EditText) findViewById(R.id.input12);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{"ft","in", "Km", "m", "cm", "mm"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        String[] items1 = new String[]{"ft","in", "Km", "m", "cm", "mm"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items1);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter);





        Button btnAdd = (Button) findViewById(R.id.button1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {




            }});









        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }






        });


        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        String[] items3 = new String[]{"bbl","ft3", "gal", "gal (US)", "in3", "m3","lit", "cm3", "ml"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items3);
// Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        String[] items4 = new String[]{"bbl","ft3", "gal", "gal (US)", "in3", "m3","lit", "cm3", "ml"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items4);
// Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner4.setAdapter(adapter4);





        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }});



        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        String[] items5 = new String[]{"bbl/hr","ft3/min","ft3/hr", "gal(US)/min","m3/hr", "m3/min","lit/min","lit/hr"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items5);
// Specify the layout to use when the list of choices appears
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        String[] items6 = new String[]{"bbl/hr","ft3/min","ft3/hr", "gal(US)/min", "m3/hr", "m3/min","lit/min","lit/hr"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items6);
// Specify the layout to use when the list of choices appears
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner6.setAdapter(adapter6);





        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }});






        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }






        });




        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
        String[] items7 = new String[]{"psi","bar","mbar","Kg/cm2", "kPa", "Pa"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items7);
// Specify the layout to use when the list of choices appears
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner7.setAdapter(adapter7);

        Spinner spinner8 = (Spinner) findViewById(R.id.spinner8);
        String[] items8 = new String[]{"psi","bar","mbar","Kg/cm2", "kPa", "Pa"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items8);
// Specify the layout to use when the list of choices appears
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner8.setAdapter(adapter8);





        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }});






        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }






        });


        Spinner spinner9 = (Spinner) findViewById(R.id.spinner9);
        String[] items9 = new String[]{"gr/cm3","gr/ml","gr/lit","gr/gal","Kg/m3", "lb/in3","lb/ft3","lb/gal","lb/bbl", "SG"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items9);
// Specify the layout to use when the list of choices appears
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner9.setAdapter(adapter9);

        Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);
        String[] items10 = new String[]{"gr/cm3","gr/ml","gr/lit","gr/gal","Kg/m3", "lb/in3","lb/ft3","lb/gal","lb/bbl", "SG"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items10);
// Specify the layout to use when the list of choices appears
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner10.setAdapter(adapter10);





        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }});






        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }






        });


        Spinner spinner11 = (Spinner) findViewById(R.id.spinner11);
        String[] items11 = new String[]{"Metric Ton","lb","Kg","gr", "Slug"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items11);
// Specify the layout to use when the list of choices appears
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner11.setAdapter(adapter11);

        Spinner spinner12 = (Spinner) findViewById(R.id.spinner12);
        String[] items12 = new String[]{"Metric Ton","lb","Kg","gr", "Slug"};
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items12);
// Specify the layout to use when the list of choices appears
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner12.setAdapter(adapter12);





        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }});






        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                value = parent.getItemAtPosition(position);


            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {



            }






        });


    }
    public void convert(View view) {






        // Get the string from the Spinners and number from the EditText
        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());


        String fromString1 = (String) fromSpinner1.getSelectedItem();
        String toString1 = (String) toSpinner1.getSelectedItem();
        double input1 = Double.valueOf(fromEditText1.getText().toString());

        String fromString2 = (String) fromSpinner2.getSelectedItem();
        String toString2 = (String) toSpinner2.getSelectedItem();
        double input2 = Double.valueOf(fromEditText2.getText().toString());

        String fromString3 = (String) fromSpinner3.getSelectedItem();
        String toString3 = (String) toSpinner3.getSelectedItem();
        double input3 = Double.valueOf(fromEditText3.getText().toString());

        String fromString4 = (String) fromSpinner4.getSelectedItem();
        String toString4 = (String) toSpinner4.getSelectedItem();
        double input4 = Double.valueOf(fromEditText4.getText().toString());

        String fromString5 = (String) fromSpinner5.getSelectedItem();
        String toString5 = (String) toSpinner5.getSelectedItem();
        double input5 = Double.valueOf(fromEditText5.getText().toString());







        if (fromString == toString){

            result =   input * 1.0;

        }
        else if (fromString == "in" && toString== "ft"){
            result = input * 0.0833333;}
        else if (fromString == "in" && toString== "Km"){
            result = input * 0.0000254;}
        else if (fromString == "in" && toString== "m"){
            result = input * 0.0254;}
        else if (fromString == "in" && toString== "cm"){
            result = input * 2.54;}
        else if (fromString == "in" && toString== "mm"){
            result = input * 25.4;}

        else if (fromString == "ft" && toString== "in"){
            result = input * 12;}
        else if (fromString == "ft" && toString== "Km"){
            result = input * 0.0003048;}
        else if (fromString == "ft" && toString== "m"){
            result = input * 0.3048;}
        else if (fromString == "ft" && toString== "cm"){
            result = input * 30.48;}
        else if (fromString == "ft" && toString== "mm"){
            result = input * 304.8;}

        else if (fromString == "Km" && toString== "ft"){
            result = input * 3280.839895;}
        else if (fromString == "Km" && toString== "in"){
            result = input * 39370.07874;}
        else if (fromString == "Km" && toString== "m"){
            result = input * 1000;}
        else if (fromString == "Km" && toString== "cm"){
            result = input * 100000;}
        else if (fromString == "Km" && toString== "mm"){
            result = input * 1000000;}


        else if (fromString == "m" && toString== "ft"){
            result = input * 3.280839895;}
        else if (fromString == "m" && toString== "in"){
            result = input * 39.37007874;}
        else if (fromString == "m" && toString== "Km"){
            result = input * 0.001;}
        else if (fromString == "m" && toString== "cm"){
            result = input * 100;}
        else if (fromString == "m" && toString== "mm"){
            result = input * 1000;}

        else if (fromString == "cm" && toString== "ft"){
            result = input * 0.032808399;}
        else if (fromString == "cm" && toString== "in"){
            result = input * 0.393700787;}
        else if (fromString == "cm" && toString== "Km"){
            result = input * 0.00001;}
        else if (fromString == "cm" && toString== "m"){
            result = input * 0.01;}
        else if (fromString == "cm" && toString== "mm"){
            result = input * 10;}

        else if (fromString == "mm" && toString== "ft"){
            result = input * 0.00328084;}
        else if (fromString == "mm" && toString== "in"){
            result = input * 0.039370079;}
        else if (fromString == "mm" && toString== "Km"){
            result = input * 0.000001;}
        else if (fromString == "mm" && toString== "m"){
            result = input * 0.001;}
        else if (fromString == "mm" && toString== "cm"){
            result = input * 0.1;}

        toEditText.setText(String.valueOf(result));



        if (fromString1 == toString1){

            result1 =   input1 * 1.0;

        }
        else if (fromString1 == "bbl" && toString1== "ft3"){
            result1 = input1 * 5.6145835;}
        else if (fromString1 == "bbl" && toString1== "gal"){
            result1 = input1 * 34.972303;}
        else if (fromString1 == "bbl" && toString1== "gal(US)"){
            result1 = input1 * 41.999999;}
        else if (fromString1 == "bbl" && toString1== "in3"){
            result1 = input1 * 9702.0004;}
        else if (fromString1 == "bbl" && toString1== "m3"){
            result1 = input1 * 0.1589873;}
        else if (fromString1 == "bbl" && toString1== "lit"){
            result1 = input1 * 158.98732;}
        else if (fromString1 == "bbl" && toString1== "cm3"){
            result1 = input1 * 158987.32;}
        else if (fromString1 == "bbl" && toString1== "ml"){
            result1 = input1 * 158987.32;}

        else if (fromString1 == "ft3" && toString1== "bbl"){
            result1 = input1 * 0.1781076;}
        else if (fromString1 == "ft3" && toString1== "gal"){
            result1 = input1 * 6.228833;}
        else if (fromString1 == "ft3" && toString1== "gal(US)"){
            result1 = input1 * 7.480519;}
        else if (fromString1 == "ft3" && toString1== "in3"){
            result1 = input1 * 1728;}
        else if (fromString1 == "ft3" && toString1== "m3"){
            result1 = input1 * 0.0283169;}
        else if (fromString1 == "ft3" && toString1== "lit"){
            result1 = input1 * 28.31685;}
        else if (fromString1 == "ft3" && toString1== "cm3"){
            result1 = input1 * 28316.85;}
        else if (fromString1 == "ft3" && toString1== "ml"){
            result1 = input1 * 28316.85;}

        else if (fromString1 == "gal" && toString1== "bbl"){
            result1 = input1 * 0.0285941;}
        else if (fromString1 == "gal" && toString1== "ft3"){
            result1 = input1 * 0.1605437;}
        else if (fromString1 == "gal" && toString1== "gal(US)"){
            result1 = input1 * 1.2009503;}
        else if (fromString1 == "gal" && toString1== "in3"){
            result1 = input1 * 277.41954;}
        else if (fromString1 == "gal" && toString1== "m3"){
            result1 = input1 * 0.0045461;}
        else if (fromString1 == "gal" && toString1== "lit"){
            result1 = input1 * 4.5460923;}
        else if (fromString1 == "gal" && toString1== "cm3"){
            result1 = input1 * 4546.0923;}
        else if (fromString1 == "gal" && toString1== "ml"){
            result1 = input1 * 4546.0923;}

        else if (fromString1 == "gal(US)" && toString1== "bbl"){
            result1 = input1 * 0.0238095;}
        else if (fromString1 == "gal(US)" && toString1== "ft3"){
            result1 = input1 * 0.1336806;}
        else if (fromString1 == "gal(US)" && toString1== "gal"){
            result1 = input1 * 0.8326739;}
        else if (fromString1 == "gal(US)" && toString1== "in3"){
            result1 = input1 * 231.00001;}
        else if (fromString1 == "gal(US)" && toString1== "m3"){
            result1 = input1 * 0.0037854;}
        else if (fromString1 == "gal(US)" && toString1== "lit"){
            result1 = input1 * 3.7854125;}
        else if (fromString1 == "gal(US)" && toString1== "cm3"){
            result1 = input1 * 3785.4125;}
        else if (fromString1 == "gal(US)" && toString1== "ml"){
            result1 = input1 * 3785.4125;}

        else if (fromString1 == "in3" && toString1== "bbl"){
            result1 = input1 * 0.000103072;}
        else if (fromString1 == "in3" && toString1== "ft3"){
            result1 = input1 * 0.000578704
            ;}
        else if (fromString1 == "in3" && toString1== "gal"){
            result1 = input1 * 0.003604649
            ;}
        else if (fromString1 == "in3" && toString1== "gal(US)"){
            result1 = input1 * 0.004329004
            ;}
        else if (fromString1 == "in3" && toString1== "m3"){
            result1 = input1 * 1.63871E-05
            ;}
        else if (fromString1 == "in3" && toString1== "lit"){
            result1 = input1 * 0.016387066
            ;}
        else if (fromString1 == "in3" && toString1== "cm3"){
            result1 = input1 * 16.38706597
            ;}
        else if (fromString1 == "in3" && toString1== "ml"){
            result1 = input1 * 16.38706597
            ;}

        else if (fromString1 == "m3" && toString1== "bbl"){
            result1 = input1 * 6.289809778
            ;}
        else if (fromString1 == "m3" && toString1== "ft3"){
            result1 = input1 * 35.31466247
            ;}
        else if (fromString1 == "m3" && toString1== "gal"){
            result1 = input1 * 219.969135
            ;}
        else if (fromString1 == "m3" && toString1== "gal(US)"){
            result1 = input1 * 264.1720036
            ;}
        else if (fromString1 == "m3" && toString1== "in3"){
            result1 = input1 * 61023.73675
            ;}
        else if (fromString1 == "m3" && toString1== "lit"){
            result1 = input1 * 1000
            ;}
        else if (fromString1 == "m3" && toString1== "cm3"){
            result1 = input1 * 1000000
            ;}
        else if (fromString1 == "m3" && toString1== "ml"){
            result1 = input1 * 1000000
            ;}

        else if (fromString1 == "lit" && toString1== "bbl"){
            result1 = input1 * 0.00628981
            ;}
        else if (fromString1 == "lit" && toString1== "ft3"){
            result1 = input1 * 0.035314662
            ;}
        else if (fromString1 == "lit" && toString1== "gal"){
            result1 = input1 * 0.219969135
            ;}
        else if (fromString1 == "lit" && toString1== "gal(US)"){
            result1 = input1 * 0.264172004
            ;}
        else if (fromString1 == "lit" && toString1== "in3"){
            result1 = input1 * 61.02373675
            ;}
        else if (fromString1 == "lit" && toString1== "m3"){
            result1 = input1 * 0.001
            ;}
        else if (fromString1 == "lit" && toString1== "cm3"){
            result1 = input1 * 1000
            ;}
        else if (fromString1 == "lit" && toString1== "ml"){
            result1 = input1 * 1000
            ;}

        else if (fromString1 == "cm3" && toString1== "bbl"){
            result1 = input1 * 6.28981E-06
            ;}
        else if (fromString1 == "cm3" && toString1== "ft3"){
            result1 = input1 * 3.53147E-05;}
        else if (fromString1 == "cm3" && toString1== "gal"){
            result1 = input1 * 0.000219969;}
        else if (fromString1 == "cm3" && toString1== "gal(US)"){
            result1 = input1 * 0.000264172
            ;}
        else if (fromString1 == "cm3" && toString1== "in3"){
            result1 = input1 * 0.061023737
            ;}
        else if (fromString1 == "cm3" && toString1== "m3"){
            result1 = input1 * 0.000001
            ;}
        else if (fromString1 == "cm3" && toString1== "lit"){
            result1 = input1 * 0.001
            ;}
        else if (fromString1 == "cm3" && toString1== "ml"){
            result1 = input1 * 1
            ;}

        else if (fromString1 == "ml" && toString1== "bbl"){
            result1 = input1 * 6.28981E-06
            ;}
        else if (fromString1 == "ml" && toString1== "ft3"){
            result1 = input1 * 3.53147E-05
            ;}
        else if (fromString1 == "ml" && toString1== "gal"){
            result1 = input1 * 0.000219969
            ;}
        else if (fromString1 == "ml" && toString1== "gal(US)"){
            result1 = input1 * 0.000264172
            ;}
        else if (fromString1 == "ml" && toString1== "in3"){
            result1 = input1 * 0.061023737
            ;}
        else if (fromString1 == "ml" && toString1== "m3"){
            result1 = input1 * 0.000001
            ;}
        else if (fromString1 == "ml" && toString1== "lit"){
            result1 = input1 * 0.001
            ;}
        else if (fromString1 == "ml" && toString1== "cm3"){
            result1 = input1 * 1;}



        toEditText1.setText(String.valueOf(result1));




        if (fromString2 == toString2){

            result2 =   input2 * 1.0;

        }
        else if (fromString2 == "ft3/min" && toString2== "ft3/hr"){
            result2 = input2 * 60;}
        else if (fromString2 == "ft3/min" && toString2== "gal(US)/min"){
            result2 = input2 * 7.48052
            ;}
        else if (fromString2 == "ft3/min" && toString2== "bbl/hr"){
            result2 = input2 * 10.68645667;}
        else if (fromString2 == "ft3/min" && toString2== "m3/min"){
            result2 = input2 * 0.02831685
            ;}
        else if (fromString2 == "ft3/min" && toString2== "m3/hr"){
            result2 = input2 * 1.699011667
            ;}
        else if (fromString2 == "ft3/min" && toString2== "lit/min"){
            result2 = input2 * 28.31685
            ;}
        else if (fromString2 == "ft3/min" && toString2== "lit/hr"){
            result2 = input2 * 1699.011667
            ;}

        else if (fromString2 == "ft3/hr" && toString2== "ft3/min"){
            result2 = input2 * 0.016666667
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "gal(US)/min"){
            result2 = input2 * 0.124675333
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "bbl/hr"){
            result2 = input2 * 0.178107611
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "m3/min"){
            result2 = input2 * 0.000471948
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "m3/hr"){
            result2 = input2 * 0.028316861
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "lit/min"){
            result2 = input2 * 0.4719475
            ;}
        else if (fromString2 == "ft3/hr" && toString2== "lit/hr"){
            result2 = input2 * 28.31686111
            ;}

        else if (fromString2 == "gal(US)/min" && toString2== "ft3/min"){
            result2 = input2 * 0.133680546
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "ft3/hr"){
            result2 = input2 * 8.020832776
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "bbl/hr"){
            result2 = input2 * 1.428571365
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "m3/min"){
            result2 = input2 * 0.003785412
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "m3/hr"){
            result2 = input2 * 0.227124808
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "lit/min"){
            result2 = input2 * 3.785411977
            ;}
        else if (fromString2 == "gal(US)/min" && toString2== "lit/hr"){
            result2 = input2 * 227.1248077
            ;}


        else if (fromString2 == "bbl/hr" && toString2== "ft3/min"){
            result2 = input2 * 0.093576387
            ;}
        else if (fromString2 == "bbl/hr" && toString2== "ft3/hr"){
            result2 = input2 * 5.61458194

            ;}
        else if (fromString2 == "bbl/hr" && toString2== "gal(US)/min"){
            result2 = input2 * 0.700000031
            ;}
        else if (fromString2 == "bbl/hr" && toString2== "m3/min"){
            result2 = input2 * 0.002649789
            ;}
        else if (fromString2 == "bbl/hr" && toString2== "m3/hr"){
            result2 = input2 * 0.158987372
            ;}
        else if (fromString2 == "bbl/hr" && toString2== "lit/min"){
            result2 = input2 * 2.649788502
            ;}
        else if (fromString2 == "bbl/hr" && toString2== "lit/hr"){
            result2 = input2 * 158.9873725
            ;}


        else if (fromString2 == "m3/min" && toString2== "ft3/min"){
            result2 = input2 * 35.31466247
            ;}
        else if (fromString2 == "m3/min" && toString2== "ft3/hr"){
            result2 = input2 * 2118.879748
            ;}
        else if (fromString2 == "m3/min" && toString2== "gal(US)/min"){
            result2 = input2 * 264.1720389
            ;}
        else if (fromString2 == "m3/min" && toString2== "bbl/hr"){
            result2 = input2 * 377.3886102
            ;}
        else if (fromString2 == "m3/min" && toString2== "m3/hr"){
            result2 = input2 * 60.00002354
            ;}
        else if (fromString2 == "m3/min" && toString2== "lit/min"){
            result2 = input2 * 1000
            ;}
        else if (fromString2 == "m3/min" && toString2== "lit/hr"){
            result2 = input2 * 60000.02354
            ;}

        else if (fromString2 == "m3/hr" && toString2== "ft3/min"){
            result2 = input2 * 0.588577477
            ;}
        else if (fromString2 == "m3/hr" && toString2== "ft3/hr"){
            result2 = input2 * 35.31464861
            ;}
        else if (fromString2 == "m3/hr" && toString2== "gal(US)/min"){
            result2 = input2 * 4.402865588
            ;}
        else if (fromString2 == "m3/hr" && toString2== "bbl/hr"){
            result2 = input2 * 6.289807702
            ;}
        else if (fromString2 == "m3/hr" && toString2== "m3/min"){
            result2 = input2 * 0.01666666
            ;}
        else if (fromString2 == "m3/hr" && toString2== "lit/min"){
            result2 = input2 * 16.66666013
            ;}
        else if (fromString2 == "m3/hr" && toString2== "lit/hr"){
            result2 = input2 * 1000
            ;}

        else if (fromString2 == "lit/min" && toString2== "ft3/min"){
            result2 = input2 * 0.035314662
            ;}
        else if (fromString2 == "lit/min" && toString2== "ft3/hr"){
            result2 = input2 * 2.118879748
            ;}
        else if (fromString2 == "lit/min" && toString2== "gal(US)/min"){
            result2 = input2 * 0.264172039
            ;}
        else if (fromString2 == "lit/min" && toString2== "bbl/hr"){
            result2 = input2 * 0.37738861
            ;}
        else if (fromString2 == "lit/min" && toString2== "m3/min"){
            result2 = input2 * 0.001
            ;}
        else if (fromString2 == "lit/min" && toString2== "m3/hr"){
            result2 = input2 * 0.060000024
            ;}
        else if (fromString2 == "lit/min" && toString2== "lit/hr"){
            result2 = input2 * 60.00002354
            ;}

        else if (fromString2 == "lit/hr" && toString2== "ft3/min"){
            result2 = input2 * 0.000588577
            ;}
        else if (fromString2 == "lit/hr" && toString2== "ft3/hr"){
            result2 = input2 * 0.035314649
            ;}
        else if (fromString2 == "lit/hr" && toString2== "gal(US)/min"){
            result2 = input2 * 0.004402866
            ;}
        else if (fromString2 == "lit/hr" && toString2== "bbl/hr"){
            result2 = input2 * 0.006289808
            ;}
        else if (fromString2 == "lit/hr" && toString2== "m3/min"){
            result2 = input2 * 1.66667E-05
            ;}
        else if (fromString2 == "lit/hr" && toString2== "m3/hr"){
            result2 = input2 * 0.001
            ;}
        else if (fromString2 == "lit/hr" && toString2== "lit/min"){
            result2 = input2 * 0.01666666
            ;}

        toEditText2.setText(String.valueOf(result2));



        if (fromString3 == toString3){

            result3 =   input3 * 1.0;

        }
        else if (fromString3 == "psi" && toString3== "bar"){
            result3 = input3 * 0.06894757;}
        else if (fromString3 == "psi" && toString3== "mbar"){
            result3 = input3 * 68.94757
            ;}
        else if (fromString3 == "psi" && toString3== "Kg/cm2"){
            result3 = input3 * 0.07030696;}
        else if (fromString3 == "psi" && toString3== "kPa"){
            result3 = input3 * 6.894757
            ;}
        else if (fromString3 == "psi" && toString3== "Pa"){
            result3 = input3 * 6894.757
            ;}


        else if (fromString3 == "bar" && toString3== "psi"){
            result3 = input3 * 14.50377439;}
        else if (fromString3 == "bar" && toString3== "mbar"){
            result3 = input3 * 1000
            ;}
        else if (fromString3 == "bar" && toString3== "Kg/cm2"){
            result3 = input3 * 1.019716286;}
        else if (fromString3 == "bar" && toString3== "kPa"){
            result3 = input3 * 100
            ;}
        else if (fromString3 == "bar" && toString3== "Pa"){
            result3 = input3 * 100000
            ;}
        else if (fromString3 == "mbar" && toString3== "psi"){
            result3 = input3 * 0.014503774;}
        else if (fromString3 == "mbar" && toString3== "bar"){
            result3 = input3 * 0.001
            ;}
        else if (fromString3 == "mbar" && toString3== "Kg/cm2"){
            result3 = input3 * 0.001019716;}
        else if (fromString3 == "mbar" && toString3== "kPa"){
            result3 = input3 * 0.1
            ;}
        else if (fromString3 == "mbar" && toString3== "Pa"){
            result3 = input3 * 100
            ;}


        else if (fromString3 == "Kg/cm2" && toString3== "psi"){
            result3 = input3 * 14.2233429;}
        else if (fromString3 == "Kg/cm2" && toString3== "bar"){
            result3 = input3 * 0.98066493
            ;}
        else if (fromString3 == "Kg/cm2" && toString3== "mbar"){
            result3 = input3 * 980.6649299;}
        else if (fromString3 == "Kg/cm2" && toString3== "kPa"){
            result3 = input3 * 98.06649299
            ;}
        else if (fromString3 == "Kg/cm2" && toString3== "Pa"){
            result3 = input3 * 98066.49299
            ;}

        else if (fromString3 == "kPa" && toString3== "psi"){
            result3 = input3 * 0.145037744;}
        else if (fromString3 == "kPa" && toString3== "bar"){
            result3 = input3 * 0.01
            ;}
        else if (fromString3 == "kPa" && toString3== "mbar"){
            result3 = input3 * 10;}
        else if (fromString3 == "kPa" && toString3== "Kg/cm2"){
            result3 = input3 * 0.010197163
            ;}
        else if (fromString3 == "kPa" && toString3== "Pa"){
            result3 = input3 * 1000
            ;}


        else if (fromString3 == "Pa" && toString3== "psi"){
            result3 = input3 * 0.000145037744;}
        else if (fromString3 == "Pa" && toString3== "bar"){
            result3 = input3 * 0.00001
            ;}
        else if (fromString3 == "Pa" && toString3== "mbar"){
            result3 = input3 * 0.01;}
        else if (fromString3 == "Pa" && toString3== "Kg/cm2"){
            result3 = input3 * 1.01972E-05

            ;}
        else if (fromString3 == "Pa" && toString3== "kPa"){
            result3 = input3 * 0.001
            ;}


        toEditText3.setText(String.valueOf(result3));




        if (fromString4 == toString4){

            result4 =   input4 * 1.0;

        }
        else if (fromString4 == "gr/cm3" && toString4== "gr/ml"){
            result4 = input4 * 1;}
        else if (fromString4 == "gr/cm3" && toString4== "gr/lit"){
            result4 = input4 * 1000
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "gr/gal"){
            result4 = input4 * 3785.410757;}
        else if (fromString4 == "gr/cm3" && toString4== "Kg/m3"){
            result4 = input4 * 1000
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "lb/in3"){
            result4 = input4 * 0.036127299
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "lb/ft3"){
            result4 = input4 * 62.42797373
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "lb/gal"){
            result4 = input4 * 8.345408984
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "lb/bbl"){
            result4 = input4 * 350.5071024
            ;}
        else if (fromString4 == "gr/cm3" && toString4== "SG"){
            result4 = input4 * 1
            ;}


        else if (fromString4 == "gr/ml" && toString4== "gr/cm3"){
            result4 = input4 * 1;}
        else if (fromString4 == "gr/ml" && toString4== "gr/lit"){
            result4 = input4 * 1000
            ;}
        else if (fromString4 == "gr/ml" && toString4== "gr/gal"){
            result4 = input4 * 3785.410757;}
        else if (fromString4 == "gr/ml" && toString4== "Kg/m3"){
            result4 = input4 * 1000
            ;}
        else if (fromString4 == "gr/ml" && toString4== "lb/in3"){
            result4 = input4 * 0.036127299
            ;}
        else if (fromString4 == "gr/ml" && toString4== "lb/ft3"){
            result4 = input4 * 62.42797373
            ;}
        else if (fromString4 == "gr/ml" && toString4== "lb/gal"){
            result4 = input4 * 8.345408984
            ;}
        else if (fromString4 == "gr/ml" && toString4== "lb/bbl"){
            result4 = input4 * 350.5071024
            ;}
        else if (fromString4 == "gr/ml" && toString4== "SG"){
            result4 = input4 * 1
            ;}


        else if (fromString4 == "gr/lit" && toString4== "gr/cm3"){
            result4 = input4 * 0.001;}
        else if (fromString4 == "gr/lit" && toString4== "gr/ml"){
            result4 = input4 * 0.001
            ;}
        else if (fromString4 == "gr/lit" && toString4== "gr/gal"){
            result4 = input4 * 3.785410757;}
        else if (fromString4 == "gr/lit" && toString4== "Kg/m3"){
            result4 = input4 * 1
            ;}
        else if (fromString4 == "gr/lit" && toString4== "lb/in3"){
            result4 = input4 * 3.61273E-05
            ;}
        else if (fromString4 == "gr/lit" && toString4== "lb/ft3"){
            result4 = input4 * 0.062427974
            ;}
        else if (fromString4 == "gr/lit" && toString4== "lb/gal"){
            result4 = input4 * 0.008345409
            ;}
        else if (fromString4 == "gr/lit" && toString4== "lb/bbl"){
            result4 = input4 * 0.350507102
            ;}
        else if (fromString4 == "gr/lit" && toString4== "SG"){
            result4 = input4 * 0.001
            ;}


        else if (fromString4 == "Kg/m3" && toString4== "gr/cm3"){
            result4 = input4 * 0.001;}
        else if (fromString4 == "Kg/m3" && toString4== "gr/ml"){
            result4 = input4 * 0.001
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "gr/gal"){
            result4 = input4 * 3.785410757;}
        else if (fromString4 == "Kg/m3" && toString4== "gr/lit"){
            result4 = input4 * 1
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "lb/in3"){
            result4 = input4 * 3.61273E-05
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "lb/ft3"){
            result4 = input4 * 0.062427974
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "lb/gal"){
            result4 = input4 * 0.008345409
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "lb/bbl"){
            result4 = input4 * 0.350507102
            ;}
        else if (fromString4 == "Kg/m3" && toString4== "SG"){
            result4 = input4 * 0.001
            ;}


        else if (fromString4 == "lb/in3" && toString4== "gr/cm3"){
            result4 = input4 * 27.67989906;}
        else if (fromString4 == "lb/in3" && toString4== "gr/ml"){
            result4 = input4 * 27.67989906
            ;}
        else if (fromString4 == "lb/in3" && toString4== "gr/gal"){
            result4 = input4 * 104779.7877;}
        else if (fromString4 == "lb/in3" && toString4== "gr/lit"){
            result4 = input4 * 27679.89906
            ;}
        else if (fromString4 == "lb/in3" && toString4== "Kg/m3"){
            result4 = input4 * 27679.89906
            ;}
        else if (fromString4 == "lb/in3" && toString4== "lb/ft3"){
            result4 = input4 * 1728.000011
            ;}
        else if (fromString4 == "lb/in3" && toString4== "lb/gal"){
            result4 = input4 * 231.0000783
            ;}
        else if (fromString4 == "lb/in3" && toString4== "lb/bbl"){
            result4 = input4 * 9702.001214
            ;}
        else if (fromString4 == "lb/in3" && toString4== "SG"){
            result4 = input4 * 27.67989906
            ;}


        else if (fromString4 == "lb/ft3" && toString4== "gr/cm3"){
            result4 = input4 * 0.01601846;}
        else if (fromString4 == "lb/ft3" && toString4== "gr/ml"){
            result4 = input4 * 0.01601846
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "gr/gal"){
            result4 = input4 * 60.6364508;}
        else if (fromString4 == "lb/ft3" && toString4== "gr/lit"){
            result4 = input4 * 16.01846
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "Kg/m3"){
            result4 = input4 * 16.01846
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "lb/in3"){
            result4 = input4 * 0.000578704
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "lb/gal"){
            result4 = input4 * 0.1336806
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "lb/bbl"){
            result4 = input4 * 5.614584
            ;}
        else if (fromString4 == "lb/ft3" && toString4== "SG"){
            result4 = input4 * 0.01601846
            ;}


        else if (fromString4 == "lb/gal" && toString4== "gr/cm3"){
            result4 = input4 * 0.119826362;}
        else if (fromString4 == "lb/gal" && toString4== "gr/ml"){
            result4 = input4 * 0.119826362

            ;}
        else if (fromString4 == "lb/gal" && toString4== "gr/gal"){
            result4 = input4 * 453.5920006;}
        else if (fromString4 == "lb/gal" && toString4== "gr/lit"){
            result4 = input4 * 119.8263622
            ;}
        else if (fromString4 == "lb/gal" && toString4== "Kg/m3"){
            result4 = input4 * 119.8263622
            ;}
        else if (fromString4 == "lb/gal" && toString4== "lb/in3"){
            result4 = input4 * 0.004329003
            ;}
        else if (fromString4 == "lb/gal" && toString4== "lb/ft3"){
            result4 = input4 * 7.480516993
            ;}
        else if (fromString4 == "lb/gal" && toString4== "lb/bbl"){
            result4 = input4 * 41.99999102
            ;}
        else if (fromString4 == "lb/gal" && toString4== "SG"){
            result4 = input4 * 0.119826362
            ;}


        else if (fromString4 == "lb/bbl" && toString4== "gr/cm3"){
            result4 = input4 * 0.002853009
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "gr/ml"){
            result4 = input4 * 0.002853009
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "gr/gal"){
            result4 = input4 * 10.79981185
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "gr/lit"){
            result4 = input4 * 2.853009235

            ;}
        else if (fromString4 == "lb/bbl" && toString4== "Kg/m3"){
            result4 = input4 * 2.853009235

            ;}
        else if (fromString4 == "lb/bbl" && toString4== "lb/in3"){
            result4 = input4 * 0.000103072
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "lb/ft3"){
            result4 = input4 * 0.178107586
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "lb/gal"){
            result4 = input4 * 0.023809529
            ;}
        else if (fromString4 == "lb/bbl" && toString4== "SG"){
            result4 = input4 * 0.002853009

            ;}


        else if (fromString4 == "SG" && toString4== "gr/cm3"){
            result4 = input4 * 1

            ;}
        else if (fromString4 == "SG" && toString4== "gr/ml"){
            result4 = input4 * 1
            ;}
        else if (fromString4 == "SG" && toString4== "gr/gal"){
            result4 = input4 * 3785.410757
            ;}
        else if (fromString4 == "SG" && toString4== "gr/lit"){
            result4 = input4 * 1000

            ;}
        else if (fromString4 == "SG" && toString4== "Kg/m3"){
            result4 = input4 * 1000

            ;}
        else if (fromString4 == "SG" && toString4== "lb/in3"){
            result4 = input4 * 0.036127299
            ;}
        else if (fromString4 == "SG" && toString4== "lb/ft3"){
            result4 = input4 * 62.42797373
            ;}
        else if (fromString4 == "SG" && toString4== "lb/gal"){
            result4 = input4 * 8.345408984
            ;}
        else if (fromString4 == "SG" && toString4== "lb/bbl"){
            result4 = input4 * 350.5071024
            ;}



        toEditText4.setText(String.valueOf(result4));




        if (fromString5 == toString5){

            result5 =   input5 * 1.0;

        }
        else if (fromString5 == "Metric Ton" && toString5== "lb"){
            result5 = input5 * 2204.6;}
        else if (fromString5 == "Metric Ton" && toString5== "Kg"){
            result5 = input5 * 1000
            ;}
        else if (fromString5 == "Metric Ton" && toString5== "gr"){
            result5 = input5 * 1000000;}
        else if (fromString5 == "Metric Ton" && toString5== "Slug"){
            result5 = input5 * 68.5218
            ;}


        else if (fromString5 == "lb" && toString5== "Metric Ton"){
            result5 = input5 * 0.000453597;}
        else if (fromString5 == "lb" && toString5== "Kg"){
            result5 = input5 * 0.453597024
            ;}
        else if (fromString5 == "lb" && toString5== "gr"){
            result5 = input5 * 453.5970244;}
        else if (fromString5 == "lb" && toString5== "Slug"){
            result5 = input5 * 0.031081285
            ;}

        else if (fromString5 == "Kg" && toString5== "Metric Ton"){
            result5 = input5 * 0.001;}
        else if (fromString5 == "Kg" && toString5== "lb"){
            result5 = input5 * 2.2046
            ;}
        else if (fromString5 == "Kg" && toString5== "gr"){
            result5 = input5 * 1000;}
        else if (fromString5 == "Kg" && toString5== "Slug"){
            result5 = input5 * 0.0685218
            ;}

        else if (fromString5 == "gr" && toString5== "Metric Ton"){
            result5 = input5 * 0.000001;}
        else if (fromString5 == "gr" && toString5== "lb"){
            result5 = input5 * 0.0022046
            ;}
        else if (fromString5 == "gr" && toString5== "Kg"){
            result5 = input5 * 0.001;}
        else if (fromString5 == "gr" && toString5== "Slug"){
            result5 = input5 * 6.85218E-05
            ;}

        else if (fromString5 == "Slug" && toString5== "Metric Ton"){
            result5 = input5 * 0.014593896;}
        else if (fromString5 == "Slug" && toString5== "lb"){
            result5 = input5 * 32.17370238
            ;}
        else if (fromString5 == "Slug" && toString5== "Kg"){
            result5 = input5 * 14.59389567;}
        else if (fromString5 == "Slug" && toString5== "gr"){
            result5 = input5 * 14593.89567
            ;}




        toEditText5.setText(String.valueOf(result5));


    }}

