


package com.mahananda.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        final Button submit = (Button)findViewById(R.id.btnSubmit);
        EditText amount = (EditText)findViewById(R.id.editAmount);
        EditText rate = (EditText)findViewById(R.id.editRate);
        EditText years = (EditText)findViewById(R.id.editYears);
        TextView interest = (TextView)findViewById(R.id.textInterest);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double dblInterest = 0.0d;

                try{
                    Integer intAmount = Integer.parseInt(amount.getText().toString());
                    Double dblRate = Double.parseDouble(rate.getText().toString());
                    Double dblYears = Double.parseDouble(years.getText().toString());
                    dblInterest = (intAmount * dblRate * dblYears) / 100;
                    interest.setText(dblInterest.toString());
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT);
                }
            }
        });
    }
}