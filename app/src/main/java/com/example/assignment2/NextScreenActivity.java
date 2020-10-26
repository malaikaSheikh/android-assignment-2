package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class NextScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);
        TextView t1=(TextView)findViewById(R.id.display);
        String s2=getIntent().getStringExtra("Radio1_key");
        s2=s2+"\n"+getIntent().getStringExtra("Radio2_key");
        t1.setText(s2);
    }



}