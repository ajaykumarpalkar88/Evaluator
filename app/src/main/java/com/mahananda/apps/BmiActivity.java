package com.mahananda.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        final Button submit = (Button)findViewById(R.id.btnSubmit);
        EditText age = (EditText)findViewById(R.id.editAge);
        EditText height = (EditText)findViewById(R.id.editHeight);
        EditText weight = (EditText)findViewById(R.id.editWeight);
        TextView bmi = (TextView)findViewById(R.id.textBmi);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dblBMI = 0.0d;

                try{
                    Integer intAge = Integer.parseInt(age.getText().toString());
                    Double dblHeight = Double.parseDouble(height.getText().toString())/100;
                    Integer intWeight = Integer.parseInt(weight.getText().toString());
                    dblBMI = Math.rint(intWeight / (dblHeight * dblHeight));
                    bmi.setText(dblBMI.toString());
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT);
                }
            }
        });
    }
}