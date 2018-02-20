package com.example.nicol.a21_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Testen extends AppCompatActivity {


    public static TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testen);

        txt = (TextView) findViewById(R.id.txt);


fetchData process = new fetchData();
process.execute();







    }
}
