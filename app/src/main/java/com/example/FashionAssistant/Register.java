package com.example.FashionAssistant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    private TextView sign_in_link;
    private EditText Email;
    private EditText Pwd;
    private FirebaseAuth auth;
    private Button registerbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        auth = FirebaseAuth.getInstance();
        Pwd=findViewById(R.id.Pwd);
        Email=findViewById(R.id.Email);
        registerbtn=findViewById(R.id.registerbtn);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = Email.getText().toString().trim();
                String pass = Pwd.getText().toString().trim();

                if (mail.isEmpty()){
                    Email.setError("Email cannot be Empty!");
                }
                if (pass.isEmpty()){
                    Pwd.setError("Password cannot be Empty!");
                }

                else {
                    auth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(Register.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this,login.class));

                            }else{
                                Toast.makeText(Register.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });
        sign_in_link = findViewById(R.id.sign_in_link);
        sign_in_link.setOnClickListener(v -> {
            startActivity(new Intent(Register.this, login.class));
        });
    }
}