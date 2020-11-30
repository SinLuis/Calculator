package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TopUp extends AppCompatActivity {

    private EditText Nominal;
    private TextView InputSaldo;
    private Button Add;
    private String dompet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);


        Nominal = (EditText) findViewById(R.id.textNominal);
        InputSaldo = (TextView) findViewById(R.id.inputSaldo);
        Add = (Button) findViewById(R.id.idAdd);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer angka1=0, angka2=0, jumlah;
                try {
                     angka1 = Integer.parseInt(InputSaldo.getText().toString());
                     angka2 = Integer.parseInt(Nominal.getText().toString());
                } catch(NumberFormatException nfe) {

                }

                jumlah = angka1 + angka2;
                angka2=0;
                InputSaldo.setText(jumlah.toString());

            }
        });



    }


}