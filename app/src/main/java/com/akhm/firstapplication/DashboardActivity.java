package com.akhm.firstapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String welcomeText = "Welcome " ;
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);
    }
}