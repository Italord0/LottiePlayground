package com.italo.lottieplayground.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.italo.lottieplayground.R;

public class HomeActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();

        String[] strings = {"Smile"};

        ArrayAdapter arrayAdapter;
        arrayAdapter = new ArrayAdapter<>(this,R.layout.adapter_menu, R.id.tvName, strings);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            switch (position){
                case 0 :
                    startActivity(new Intent(this,AnimationActivity.class));
                    break;
                default:
                    break;
            }
        });
    }

    private void initViews() {
        listView = findViewById(R.id.list);
    }
}