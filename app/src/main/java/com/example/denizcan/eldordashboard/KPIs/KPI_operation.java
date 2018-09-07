package com.example.denizcan.eldordashboard.KPIs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.denizcan.eldordashboard.R;

public class KPI_operation extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpi_operation);
        setTitle("Eldor Corporation");

    }

    public void OpenRequestInfoPage(View view){

        Intent intent = null;

        switch (view.getId()){

            case R.id.first:

                intent = new Intent(this,KPI_operation_production.class);

                break;


            case R.id.second:

                intent = new Intent(this,KPI_operation_logistic.class);

                break;

        }

        startActivity(intent);


    }

}
