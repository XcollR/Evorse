package com.example.equino;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        EasySlider easySlider = findViewById(R.id.sliderId);

        List<SliderItem> list = new ArrayList<>();

        list.add(new SliderItem("En Josep muntant a cavall.", R.drawable.c1));
        list.add(new SliderItem("La Manri", R.drawable.c2));
        list.add(new SliderItem("Fent activitats!", R.drawable.c5));
        list.add(new SliderItem("Foto de tots junts", R.drawable.c6));
        list.add(new SliderItem("Mira què feliç sóc!", R.drawable.c7));
        list.add(new SliderItem("Cuidant la Manri", R.drawable.c8));

        easySlider.setTimer(999999999);
        easySlider.setPages(list);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.povhorse;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}