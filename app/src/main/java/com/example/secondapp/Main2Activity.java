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

        Button save=(Button)findViewById(R.id.button2);
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // for getting the username
                EditText a=(EditText)findViewById(R.id.ed_username);
                String content= a.getText().toString();


                // for getting the user age
                EditText b=(EditText)findViewById(R.id.editText4);
                String content1=b.getText().toString();

                // for getting the address of user
                EditText c=(EditText)findViewById(R.id.editText5);
                String content2=c.getText().toString();


                Intent intent=new Intent(Main2Activity.this,LoginRecordActivity.class);
                intent.putExtra("username",content);
                intent.putExtra("age",content1);
                intent.putExtra("address",content2);


                startActivity(intent);
            }
        });
    }
}
