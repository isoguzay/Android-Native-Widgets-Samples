package com.ioay.androidnativewidgets.imageviewvideoview;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import com.ioay.androidnativewidgets.R;

public class Main5Activity extends AppCompatActivity {

    private Button buttonChangeImage, buttonPlay, buttonPause;
    private ImageView imageView;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        buttonChangeImage = findViewById(R.id.button_main5changeimage);
        buttonPlay = findViewById(R.id.button_main5startvideo);
        buttonPause = findViewById(R.id.button_main5finishvideo);
        imageView = findViewById(R.id.imageView);
        videoView = findViewById(R.id.videoView);

        buttonChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.testimage2);
            }
        });

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.testvideo);
                videoView.setVideoURI(path);
                videoView.start();
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });

    }
}
