package com.example.FashionAssistant;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.FashionAssistant.databinding.ActivityDrawerbaseBinding;
import com.example.FashionAssistant.databinding.ActivityHomeBinding;

public class Home extends DrawerbaseActivity {

    private CardView Tryonbtn,Shoppingbtn,Tipsbtn,AddClothesbtn;

    ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(activityHomeBinding.getRoot());

        Tryonbtn = (CardView) findViewById(R.id.tryonbtn);
        Tryonbtn.setOnClickListener(v-> {
            startActivity(new Intent(Home.this, TryOn.class));
        });
        Shoppingbtn = (CardView) findViewById(R.id.shoppingbtn);
        Shoppingbtn.setOnClickListener(v-> {
            startActivity(new Intent(Home.this, Shopping.class));
        });
        Tipsbtn = (CardView) findViewById(R.id.tipsbtn);
        Tipsbtn.setOnClickListener(v-> {
            startActivity(new Intent(Home.this, TipsandTricks.class));
        });
        AddClothesbtn = (CardView) findViewById(R.id.addclothesbtn);
        AddClothesbtn.setOnClickListener(v-> {
            startActivity(new Intent(Home.this, AddClothes.class));
        });

    }
}