package com.example.PopulateSpinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_add;
    EditText et_addNames;
    ListView lv_listNames;


    List<String> friends = new ArrayList<>();

    String [] startingList = {"Ababa", "Brayo", "Cythia", "Diana", "Eldah"};

    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);
        et_addNames = findViewById(R.id.et_addName);
        lv_listNames = findViewById(R.id.lv_listNames);


        friends = new ArrayList<String>(Arrays.asList(startingList));
        ad = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,friends);

        lv_listNames.setAdapter(ad);
    }
}