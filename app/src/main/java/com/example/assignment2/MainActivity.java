package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    String s1 = "";
    String s2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.Group1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.Group2);
        CheckBox cb1 = (CheckBox) findViewById(R.id.ch1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.ch2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.ch3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.ch4);

        //onclick listener of Radio buttons
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio1) {
                    s1 = "R1 is pressed";
                } else if (checkedId == R.id.radio2) {
                    s1 = "R2 is pressed";
                }
            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio3) {
                    s2 = "R3 is pressed";
                } else if (checkedId == R.id.radio4) {
                    s2 = "R4 is pressed";
                }
            }
        });

        cb1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s2 = s2 + "\n" + "Checkbox 1 is selected";
                }

            }
        });
        cb2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s2 = s2 + "\n" + "Checkbox 2 is selected";
                }

            }
        });
        cb3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s2 = s2 + "\n" + "Checkbox 3 is selected";
                }

            }
        });
        cb4.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s2 = s2 + "\n" + "Checkbox 4 is selected";
                }

            }
        });


    }

    public void NextPage(View view) {

        Intent i = new Intent(this, NextScreenActivity.class);
        i.putExtra("Radio1_key", s1);
        i.putExtra("Radio2_key", s2);
        startActivity(i);
    }
}
