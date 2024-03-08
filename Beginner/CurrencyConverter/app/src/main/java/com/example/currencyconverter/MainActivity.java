package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String numberString = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        try{
            EditText editText = (EditText) findViewById(R.id.editText);
            numberString = (editText.getText().toString());
            double euroValue = Double.valueOf(numberString);
            double dollarValue = getDollarValue(euroValue);
            TextView textvalue = findViewById(R.id.textValue);
            textvalue.setText("$" + String.valueOf(dollarValue));


        }catch(Exception e){
            Toast.makeText(this, " The value : " + numberString + " is not a number", Toast.LENGTH_SHORT).show();
        }

    }

    public double getDollarValue (double euroValue){

        double dollarvalue = Math.round((1 * euroValue * 100) / 0.92);

        dollarvalue = dollarvalue / 100;

        return dollarvalue;

    }
}