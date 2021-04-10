package com.mahananda.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String CALC_CODE = "calc.code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAge(View view) {
        Intent intent = new Intent(this, AgeActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
        intent.putExtra(CALC_CODE, "age");
        startActivity(intent);
    }

    public void openBmi(View view) {
        Intent intent = new Intent(this, BmiActivity.class);
        intent.putExtra(CALC_CODE, "bmi");
        startActivity(intent);
    }

    public void openFuel(View view) {
        Intent intent = new Intent(this, FuelActivity.class);
        intent.putExtra(CALC_CODE, "fuel");
        startActivity(intent);
    }

    public void openLoan(View view) {
        Intent intent = new Intent(this, LoanActivity.class);
        intent.putExtra(CALC_CODE, "loan");
        startActivity(intent);
    }

    public void openUnit(View view) {
        Intent intent = new Intent(this, UnitActivity.class);
        intent.putExtra(CALC_CODE, "unit");
        startActivity(intent);
    }
}