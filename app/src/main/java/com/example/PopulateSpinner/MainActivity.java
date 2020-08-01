package com.example.PopulateSpinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

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


        btn_add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String newName = et_addNames.getText().toString();
                        friends.add(newName);

                        Collections.sort(friends);

                        ad.notifyDataSetChanged();
                    }
                }
        );

        lv_listNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "pos =  "  + i +  " name =  " + friends.get(i), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
//                intent.putExtra("friendName", et_addNames.getText().toString());
                Log.d(TAG, "onItemClick: started");
                startActivity(intent);
            }
        });
    }
}