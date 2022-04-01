package com.example.a4week_4_4;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    TextView textView;
    RadioGroup radioGroup;
    RadioButton radio11, radio12, radio13;
    ImageView imageView;

    Button button_end, button_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);

        aSwitch = (Switch)findViewById(R.id.switch1);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radio11 = (RadioButton) findViewById(R.id.Q);
        radio12 = (RadioButton) findViewById(R.id.R);
        radio13 = (RadioButton) findViewById(R.id.S);

        button_end = (Button) findViewById(R.id.button_end);
        button_new = (Button) findViewById(R.id.button_new);

        imageView = (ImageView) findViewById(R.id.imageView);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(aSwitch.isChecked() == true){
                    textView.setVisibility(android.view.View.VISIBLE);
                    radioGroup.setVisibility(android.view.View.VISIBLE);
                    imageView.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    textView.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(android.view.View.INVISIBLE);
                    imageView.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.Q)
                    imageView.setImageResource(R.drawable.android_11);
                else if(i == R.id.R)
                    imageView.setImageResource(R.drawable.android_r);
                else if(i == R.id.S)
                    imageView.setImageResource(R.drawable.android_s);
            }
        });

        button_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.runFinalization();
                System.exit(0);
            }
        });

        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                System.runFinalization();
                startActivity(intent);
                System.exit(0);
            }
        });

    }
}