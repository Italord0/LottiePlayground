package com.italo.lottieplayground.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.italo.lottieplayground.R;

public class AnimationActivity extends AppCompatActivity {

    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        initViews();
    }

    private void initViews() {
        animationView = findViewById(R.id.animationView);
        animationView.setAnimation("animations/smile.json");

    }

    public void onPlay(View view) {
        animationView.playAnimation();
    }
}