package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    public static final String USERNAME_ADDED="new_username";
    private EditText username;


    private UserViewModel mUserViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // for button insert
        Button mInsert= (Button)findViewById(R.id.btn1);
        mInsert.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
        // for button update
        Button mUpdate=(Button)findViewById(R.id.btn2);
        mUpdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, UpdateActivity.class);
                startActivity(i);

            }
        });
        // for button Display
        Button mDisplay=(Button)findViewById(R.id.btn3);
        mDisplay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, DisplayActivity.class);
                startActivity(i);

            }
        });
        // for button Display
        Button mDelete=(Button)findViewById(R.id.btn4);
        mDelete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, DeleteActivity.class);
                startActivity(i);

            }
        });




    }
}


