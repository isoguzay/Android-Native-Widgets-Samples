package com.ioay.androidnativewidgets.progressbarseekbarratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.ioay.androidnativewidgets.R;

public class Main4Activity extends AppCompatActivity {

    private TextView textViewSlider, textViewRating;
    private Button buttonStart, buttonFinish;
    private ProgressBar progressBar;
    private SeekBar seekBar;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textViewRating = findViewById(R.id.textView_main4rating);
        textViewSlider = findViewById(R.id.textView_main4slider);
        buttonStart = findViewById(R.id.button_main4start);
        buttonFinish = findViewById(R.id.button_main4finish);
        progressBar = findViewById(R.id.progressBar_main4);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar_main4);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSlider.setText("Slider : " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textViewRating.setText("Rating : " + (int)rating);
            }
        });


    }
}
