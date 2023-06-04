package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.FashionAssistant.databinding.ActivityAboutusBinding;
import com.example.FashionAssistant.databinding.ActivityTipsandTricksBinding;

public class TipsandTricks extends DrawerbaseActivity {
    ActivityTipsandTricksBinding activityTipsandTricksBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTipsandTricksBinding = ActivityTipsandTricksBinding.inflate(getLayoutInflater());
        setContentView(activityTipsandTricksBinding.getRoot());
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TipsData[] tipsData=new TipsData[]{
                new TipsData("TOP 10 Fashion Tips (Updated) - Fashion Bhaiyya Returns | Ranveer Allahbadia",R.drawable.t1),
                new TipsData("5 Fashion Tips That Changed My Life | Ranveer Allahbadia\n",R.drawable.t2),
                new TipsData("7 Tips To Look Stylish INSTANTLY! | Style Tips For Women | Ishita Khanna\n",R.drawable.t3),
                new TipsData("EASY TIPS To Improve Your Fashion Style! | Style Tips For Women\n",R.drawable.t4),
                new TipsData("Style Fundamentals | How To Build A Good Outfit\n",R.drawable.t5),
                new TipsData("How To Improve Looks Instantly - Fashion Bhaiyya Returns | Ranveer Allahbadia\n",R.drawable.t6),
                new TipsData("How Our Clothing Brand Made $82,784 In A Day *Tips & Tricks*\n",R.drawable.t7),
                new TipsData("7 Style Rules All Men Should Follow No Matter What\n",R.drawable.t8),
                new TipsData("Dressing Rules EVERYONE Should Learn Once And For ALL\n",R.drawable.t9),
                new TipsData("10 Trending Fashion 2023 | Latest Men’s Fashion Outfits | Casual Summer Outfits for Men and Boys\n",R.drawable.t10),
                new TipsData("Look Handsome in Formal Clothes | 7 Office Style Tips For Men | BeYourBest Fashion by San Kalra\n",R.drawable.t11),
        };

        String[] urls={
                "https://youtu.be/m7Z5urOOdso",
                "https://youtu.be/o_Ptn6Vwe1I",
                "https://youtu.be/3o-VB9Hss08",
                "https://youtu.be/ypVcBP8RNZI",
                "https://youtu.be/0jqIHvb7yKk",
                "https://youtu.be/0jqIHvb7yKk",
                "https://youtu.be/nGnhNJ9MDLE",
                "https://youtu.be/WNEUcRb0-jw",
                "https://youtu.be/aqQu8JTtwe0",
                "https://youtu.be/MJfZdm0wsKA",
                "https://youtu.be/wio71dS5XA4"
        };



        TipsAdapter tipsAdapter=new TipsAdapter(tipsData,TipsandTricks.this,urls);
        recyclerView.setAdapter(tipsAdapter);





    }
}