package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.FashionAssistant.databinding.ActivityAboutusBinding;
import com.example.FashionAssistant.databinding.ActivityContactusBinding;

public class Aboutus extends DrawerbaseActivity {

    ActivityAboutusBinding activityAboutusBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAboutusBinding = ActivityAboutusBinding.inflate(getLayoutInflater());
        setContentView(activityAboutusBinding.getRoot());
    }
}