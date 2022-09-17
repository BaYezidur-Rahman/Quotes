package com.bayezid.quotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);*/


        drawerLayout = findViewById(R.id.drawerId);

        NavigationView navigationView = findViewById(R.id.NavigationId);
        Handler handler = new Handler();
        navigationView.setNavigationItemSelectedListener(handler);



        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button1 = (Button) findViewById(R.id.main_app_name);
        button2 = (Button) findViewById(R.id.share);
        button3 = (Button) findViewById(R.id.rating);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.main_app_name){

            Intent intent = new Intent(MainActivity.this,Writer_Name.class);
            startActivity(intent);


        }

        if (v.getId()==R.id.share){
            Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.rating){
            Toast.makeText(MainActivity.this, "rating", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    class Handler implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            if (item.getItemId()==R.id.account){
                Toast.makeText(MainActivity.this, "I am your account", Toast.LENGTH_SHORT).show();
            }

            // email lunch...
            if (item.getItemId()==R.id.email){

                Toast.makeText(MainActivity.this, "Feedback", Toast.LENGTH_SHORT).show();
                try {

                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:"));
                    String [] mymail = {getString(R.string.bostami143),getString(R.string.bdahzaab)};
                    intent.putExtra(Intent.EXTRA_EMAIL,mymail);
                    intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.Quotes_problems));
                    intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.any_problems));

                    startActivity(Intent.createChooser(intent,getString(R.string.emailSend)));


                } catch (Exception e) {
                    e.printStackTrace();}

            }

            if (item.getItemId()==R.id.love){
                Toast.makeText(MainActivity.this, "I love your work", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId()==R.id.chat){
                Toast.makeText(MainActivity.this, "Chat list", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId()==R.id.share){
                Toast.makeText(MainActivity.this, "Do share ", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId()==R.id.others_app){
                Toast.makeText(MainActivity.this, "My others app ", Toast.LENGTH_SHORT).show();
            }


            return false;
        }
    }






}