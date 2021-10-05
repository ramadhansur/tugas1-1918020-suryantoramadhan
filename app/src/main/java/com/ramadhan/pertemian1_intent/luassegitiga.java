package com.ramadhan.pertemian1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class luassegitiga extends AppCompatActivity {

    EditText a,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luassegitiga);

        a = (EditText)findViewById(R.id.alas);
        t = (EditText) findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.hitungluas);
        hasil = (TextView) findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String isialas = a.getText().toString();
                String isitinggi = t.getText().toString();
                double a = Double.parseDouble(isialas);
                double t = Double.parseDouble(isitinggi);
                double hasilakhir = (a * t)/2;
                String output = String.valueOf(hasilakhir);
                hasil.setText(output.toString());
            }

        });
    }
}