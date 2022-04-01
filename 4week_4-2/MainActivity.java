package com.example.a4week_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    TextView textView;
    RadioGroup radioGroup;
    RadioButton radiodog, radiocat, radiorabbit;
    Button select;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radiodog = (RadioButton) findViewById(R.id.RadioDog);
        radiocat = (RadioButton) findViewById(R.id.radioCat);
        radiorabbit = (RadioButton) findViewById(R.id.radioRabbit);
        select = (Button) findViewById(R.id.Selet);
        imageView = (ImageView) findViewById(R.id.imageView);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(checkBox.isChecked() == true){
                    textView.setVisibility(android.view.View.VISIBLE);
                    radioGroup.setVisibility(android.view.View.VISIBLE);
                    select.setVisibility(android.view.View.VISIBLE);
                    imageView.setVisibility(android.view.View.VISIBLE);
                 }
                else{
                    textView.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(android.view.View.INVISIBLE);
                    select.setVisibility(android.view.View.INVISIBLE);
                    imageView.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.RadioDog:
                        imageView.setImageResource(R.drawable.doggie);
                        break;
                    case R.id.radioCat:
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioRabbit:
                        imageView.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}