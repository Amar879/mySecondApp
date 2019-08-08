package com.example.secondapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_record);
        String username=getIntent().getStringExtra("username");
        String age=getIntent().getStringExtra("age");
        String address=getIntent().getStringExtra("address");

        TextView tv=(TextView)findViewById(R.id.tv_name);
        tv.setText(username);

        TextView TVage=(TextView)findViewById(R.id.TVage);
        TVage.setText(age);

        TextView TVaddress=(TextView)findViewById(R.id.TVaddress);
        TVaddress.setText(address);



    }
}
