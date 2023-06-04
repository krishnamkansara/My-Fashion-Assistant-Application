package com.example.FashionAssistant;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.FashionAssistant.databinding.ActivityAboutusBinding;
import com.example.FashionAssistant.databinding.ActivityAddClothesBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class AddClothes extends DrawerbaseActivity {

    ActivityAddClothesBinding activityAddClothesBinding;
    public Uri imageUri;
    StorageReference storageReference;
    ProgressDialog progressDialog;
    ImageView tshirt_btn,pant_btn;
    private FirebaseStorage storage;
    private StorageReference storageReferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAddClothesBinding = ActivityAddClothesBinding.inflate(getLayoutInflater());
        setContentView(activityAddClothesBinding.getRoot());


        tshirt_btn = findViewById(R.id.tshirt_btn);
        pant_btn = findViewById(R.id.pant_btn);


        storage = FirebaseStorage.getInstance();
        storageReferences = storage.getReference();

        tshirt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choosePicture1();
                
            }
        });

        pant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choosePicture2();

            }
        });


    }

    private void choosePicture2() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,1);
    }

    private void choosePicture1() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && resultCode==RESULT_OK && data !=null && data.getData()!=null){
            imageUri = data.getData();
            uploadpicture1();
            uploadpicture2();

        }
    }

    private void uploadpicture1() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Uploading Image...");
        pd.show();

        final String randomKey = UUID.randomUUID().toString();
        StorageReference riverRef = storageReferences.child("T-SHIRT/*"+ randomKey);
        riverRef.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                pd.dismiss();
                Toast.makeText(AddClothes.this, "IMAGE UPLOADED!", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                pd.dismiss();
                Toast.makeText(AddClothes.this, "IMAGE NOT UPLOADED!", Toast.LENGTH_SHORT).show();


            }
        });
    }

    private void uploadpicture2() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Uploading Image...");
        pd.show();

        final String randomKey = UUID.randomUUID().toString();
        StorageReference riverRef = storageReferences.child("PANT/*"+ randomKey);
        riverRef.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                pd.dismiss();
                Toast.makeText(AddClothes.this, "IMAGE UPLOADED!", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                pd.dismiss();
                Toast.makeText(AddClothes.this, "IMAGE NOT UPLOADED!", Toast.LENGTH_SHORT).show();


            }
        });
    }
}