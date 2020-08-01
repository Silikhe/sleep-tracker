package com.example.PopulateSpinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "Profile";

//    TextView tv_profile = findViewById(R.id.tv_profile_details);
    TextView tv_name = findViewById(R.id.tv_name_details);
//    TextView name = findViewById(R.id.tv_profile_name);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String username = "user name not set";

        Bundle extras = getIntent().getExtras();
        if (extras !=null)
            username = extras.getString("friendName");

        tv_name.setText(username);
        Log.d(TAG, "onCreate: activity started successfuly");
    }
}