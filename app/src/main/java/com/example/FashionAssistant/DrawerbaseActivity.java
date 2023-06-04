package com.example.FashionAssistant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

public class DrawerbaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    public void setContentView(View view) {
        drawerLayout=(DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawerbase,null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);

        super.setContentView(drawerLayout);

        Toolbar toolbar=drawerLayout.findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        NavigationView navigationView=drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_drawer_open,R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    /**
     * Called when an item in the navigation menu is selected.
     *
     * @param item The selected item
     * @return true to display the item as the selected item
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);
        switch(item.getItemId()){
            case R.id.home:
                startActivity(new Intent(this,Home.class));
                overridePendingTransition(0,0);
                break;
            case R.id.contactus:
                startActivity(new Intent(this,Contactus.class));
                overridePendingTransition(0,0);
                break;
            case R.id.aboutus:
                startActivity(new Intent(this,Aboutus.class));
                overridePendingTransition(0,0);
                break;
            case R.id.logout:
                LogoutMenu(DrawerbaseActivity.this);
//                startActivity(new Intent(this,option_page2.class));
//                overridePendingTransition(0,0);

        }
        return false;
    }

    private void LogoutMenu(DrawerbaseActivity drawerbaseActivity) {
        AlertDialog.Builder builder=new AlertDialog.Builder(drawerbaseActivity);
        builder.setTitle("LogOut");
        builder.setMessage("Are you Sure you want to LogOut?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //finish();

                // on below line we are exiting our activity
                System.exit(0);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();

    }

    protected void allocateActivityTitle(String titleString)
    {
        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle(titleString);
        }
    }
}