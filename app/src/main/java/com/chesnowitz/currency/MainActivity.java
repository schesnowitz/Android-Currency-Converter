package com.chesnowitz.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCash(View view) {
        EditText currencyAmount = (EditText) findViewById(R.id.currencyAmount);

        Double currencyAmountDouble = Double.parseDouble(currencyAmount.getText().toString());
        Double canadianAmount = currencyAmountDouble * 1.37;

        Toast.makeText(this, "Is worth " + "$" + String.format("%.2f", canadianAmount) +  " Canadian Dollars",  Toast.LENGTH_LONG).show();
        Log.i("Button",  currencyAmount.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
