package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class option_page2 extends AppCompatActivity {

    TextView need_help1;
    Button loginbtn,sign_up2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_page2);


        sign_up2 = findViewById(R.id.sign_up2);

        sign_up2.setOnClickListener(v-> {
            startActivity(new Intent(option_page2.this, Register.class));
        });

        loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(v -> {
            startActivity(new Intent(option_page2.this, login.class));
        });

        need_help1 = findViewById(R.id.need_help1);
        need_help1.setOnClickListener(v -> {
            startActivity(new Intent(option_page2.this, help.class));
        });


    }
}
