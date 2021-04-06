package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prifile);
        SharedPreferences shared = getSharedPreferences(LoginActivity.APP_PREFERENCES, MODE_PRIVATE);
        String channel = (shared.getString("TOKEN", ""));

       TextView text = findViewById(R.id.textView2);
       text.setText(channel);
    }
}