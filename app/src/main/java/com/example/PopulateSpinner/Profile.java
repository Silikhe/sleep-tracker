package com.example.PopulateSpinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView tv_profile = findViewById(R.id.tv_profile_details);
    TextView tv_name = findViewById(R.id.tv_name_details);
    TextView name = findViewById(R.id.tv_profile_name);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}