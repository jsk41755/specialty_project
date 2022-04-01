package com.example.a4week_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView UP;
    ImageView DOWN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UP = (ImageView) findViewById(R.id.imageView);
        DOWN = (ImageView) findViewById(R.id.imageView2);
    }

    public void up(View view) {
        upimage();
    }

    private void upimage() {
        UP.setVisibility(View.VISIBLE);
        DOWN.setVisibility(View.INVISIBLE);
    }

    public void down(View view) {
        downImage();
    }

    private void downImage() {
        UP.setVisibility(View.INVISIBLE);
        DOWN.setVisibility(View.VISIBLE);
    }
}