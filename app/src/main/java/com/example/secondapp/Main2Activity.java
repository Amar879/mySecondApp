package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText username = (EditText) findViewById(R.id.ed_username);
        String content =username.getText().toString();
        username.setText(content);


        EditText age=(EditText)findViewById(R.id.editText4);
        String content1=age.getText().toString();
        age.setText(content1);


        EditText address=(EditText)findViewById(R.id.editText5);
        String content2=address.getText().toString();
        address.setText(content2);


        Button save=(Button)findViewById(R.id.button2);
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,AppDatabase.class);
                startActivity(intent);
            }
        });
    }
}
