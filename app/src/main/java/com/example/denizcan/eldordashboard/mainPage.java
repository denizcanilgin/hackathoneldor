package com.example.denizcan.eldordashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mainpage);
        setTitle("Eldor Corporation");


    }

    public void openKpis(View view){

        Intent intent = new Intent(this, kips.class);
        startActivity(intent);

    }
}
