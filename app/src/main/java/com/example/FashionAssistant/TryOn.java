package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.denzcoskun.imageslider.ImageSlider;
import com.example.FashionAssistant.databinding.ActivityAboutusBinding;
import com.example.FashionAssistant.databinding.ActivityTryOnBinding;

public class TryOn extends DrawerbaseActivity {
    ActivityTryOnBinding activityTryOnBinding;
    ViewFlipper tshirtviewFlipper,pantviewFlipper;
    Button left_btn,right_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTryOnBinding = ActivityTryOnBinding.inflate(getLayoutInflater());
        setContentView(activityTryOnBinding.getRoot());
        int imgarray1[] = {R.drawable.tshirt1, R.drawable.tshirt2,R.drawable.tshirt3, R.drawable.tshirt4, R.drawable.tshirt5, R.drawable.tshirt6, R.drawable.tshirt7, R.drawable.tshirt8, R.drawable.tshirt9, R.drawable.tshirt10};
        int imgarray2[] = {R.drawable.pant1, R.drawable.pant2,R.drawable.pant3, R.drawable.pant4, R.drawable.pant5, R.drawable.pant6, R.drawable.pant7, R.drawable.pant8, R.drawable.pant9, R.drawable.pant10};

        tshirtviewFlipper = (ViewFlipper) findViewById(R.id.tshirt_flipper);
        pantviewFlipper = (ViewFlipper) findViewById(R.id.pant_flipper);

        for(int i=0;i<imgarray1.length;i++){
            showimages(imgarray1[i]);
        }
        for(int i=0;i<imgarray2.length;i++){
            showimage(imgarray2[i]);
        }
    }
        public void showimages(int img)
        {
            ImageView imageView= new ImageView(this);
            imageView.setBackgroundResource(img);
            tshirtviewFlipper.addView(imageView);
            tshirtviewFlipper.setFlipInterval(2000);
            tshirtviewFlipper.setAutoStart(true);
//            left_btn = findViewById(R.id.left_btn);
//            left_btn.setOnClickListener(v-> {
//                viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
//            });
//            right_btn = findViewById(R.id.right_btn);
//            right_btn.setOnClickListener(v-> {
//                viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
//            });
            tshirtviewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
            tshirtviewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);


        }

    public void showimage(int img)
    {
        ImageView imageView= new ImageView(this);
        imageView.setBackgroundResource(img);
        pantviewFlipper.addView(imageView);
        pantviewFlipper.setFlipInterval(2500);
        pantviewFlipper.setAutoStart(true);
//            left_btn = findViewById(R.id.left_btn);
//            left_btn.setOnClickListener(v-> {
//                viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
//            });
//            right_btn = findViewById(R.id.right_btn);
//            right_btn.setOnClickListener(v-> {
//                viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
//            });
        pantviewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        pantviewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);


    }



}