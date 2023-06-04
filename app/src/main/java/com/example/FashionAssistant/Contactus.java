package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.FashionAssistant.databinding.ActivityContactusBinding;

public class Contactus extends DrawerbaseActivity {

    ActivityContactusBinding activityContactusBinding;

    ImageView fb,twitter,ig,linkdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityContactusBinding = ActivityContactusBinding.inflate(getLayoutInflater());
        setContentView(activityContactusBinding.getRoot());
        twitter=findViewById(R.id.twitter);
        linkdin=findViewById(R.id.linkdin);
        fb= findViewById(R.id.fb);
        ig=findViewById(R.id.ig);
        allClicklistener();
    }
    private void allClicklistener(){

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/KansaraKrishnam");

            }
        });
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/stfu_krish.21/");

            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/krishnam.kansara.3?mibextid=ZbWKwL");

            }
        });
        linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/in/krishnam-kansara-baa994186?original_referer=");

            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse((s));
        startActivity(new Intent(Intent.ACTION_VIEW,uri));


    }
}