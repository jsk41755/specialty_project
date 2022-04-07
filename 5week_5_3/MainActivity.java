package com.example.a5week_5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

        EditText editText = new EditText(this);
        baseLayout.addView(editText);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        TextView textView = new TextView(this);
        baseLayout.addView(textView);

        TextView textView2 = new TextView(this);
        baseLayout.addView(textView2);
        textView2.setText("2017038043 정승규");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();
                textView.setText(string);
            }
        });
    }
}