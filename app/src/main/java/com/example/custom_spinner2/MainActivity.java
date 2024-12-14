package com.example.custom_spinner2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    Spinner countreis;
    TextView tV ;

    country[] s2 = new country[7];




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.tV);
        countreis =  findViewById(R.id.countreis);

        //countreis.setOnItemSelectedListener(this);
        s2[0] = new country(R.drawable.israel, "Israel", "Jerusalem", 12000000);
        s2[1] = new country(R.drawable.usa, "USA", "Washington D.C.", 331000000);
        s2[2] = new country(R.drawable.france, "France", "Paris", 67000000);
        s2[3] = new country(R.drawable.russia, "russia", "Moscow", 1000000000);
        s2[4] = new country(R.drawable.britian, "britian", "london", 83000002);
        s2[5] = new country(R.drawable.spain, "spain", "Madrid", 83000001);
        s2[6] = new country(R.drawable.canada, "canada", "Ottawa", 83000003);


        countreis.setOnItemSelectedListener(this);

        CustomAdapter customAdapter = new CustomAdapter(this, s2);
        countreis.setAdapter(customAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid)
    {
        tV.setText("countryname: "+s2[pos].getCountryname() +"\n"+"capital: "+ s2[pos].getCapital() +"\n"+ "poplationsize: "+s2[pos].populationsize);
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.i("1", "Nothing selected");
    }


}