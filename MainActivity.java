package com.example.coversionbtweenmilesandkm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonKmToMiles = (Button) findViewById(R.id.btnkmtomiles);
        Button buttonMilesToKm = (Button) findViewById(R.id.btnmilestokm);
        final EditText editTextMiles = (EditText) findViewById(R.id.editTextmiles);
        final EditText editTextKm = (EditText) findViewById(R.id.editTextkm);

        buttonMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double vMiles = Double.valueOf(editTextMiles.getText().toString());
                Double vKM = vMiles/ 0.62137;
                DecimalFormat formatvalue = new DecimalFormat("##.##");
                editTextKm.setText(formatvalue.format(vKM));
            }
        });
        buttonKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double vKm = Double.valueOf(editTextKm.getText().toString());
                Double vMiles = vKm * 0.62137;
                DecimalFormat formatvalue = new DecimalFormat("##.##");
                editTextMiles.setText(formatvalue.format(vMiles));
            }
        });
    }
}