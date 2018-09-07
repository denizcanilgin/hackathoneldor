package com.example.denizcan.eldordashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.denizcan.eldordashboard.KPIs.KPI_finance;
import com.example.denizcan.eldordashboard.KPIs.KPI_hr;
import com.example.denizcan.eldordashboard.KPIs.KPI_operation;
import com.example.denizcan.eldordashboard.KPIs.KPI_quality;


public class kips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kips);

        setTitle("Eldor Corporation");
    }



    public void OpenRequestInfoPage(View view){

        Intent intent = null;

        switch(view.getId()){

            case R.id.first:

                intent = new Intent(this,KPI_operation.class);

                break;

            case R.id.two:

                intent = new Intent(this,KPI_finance.class);

                break;

            case R.id.three:

                intent = new Intent(this,KPI_hr.class);

                break;

            case R.id.four:

                intent = new Intent(this,KPI_quality.class);

                break;

        }

        startActivity(intent);



    }

}
