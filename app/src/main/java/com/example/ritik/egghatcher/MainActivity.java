package com.example.ritik.egghatcher;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar timer;
    TextView timerText;
    MediaPlayer mp;
    boolean isplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = findViewById(R.id.seekBar);
        timerText = findViewById(R.id.textView);
        timer.setMax(600);
        timer.setProgress(30);
    }
    timer.setonSeek
}
