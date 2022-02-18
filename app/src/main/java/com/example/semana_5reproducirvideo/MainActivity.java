package com.example.semana_5reproducirvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.videoView);

        String path = "android.resource://"+ getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}