package com.bayezid.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;


import java.util.Objects;

public class Writer_Name extends AppCompatActivity implements View.OnClickListener {
    private Button quran,hadis,arif,rumi,konaibi,bilal,muzahid,bashari,gajjali,taimiya,shafiyi,sulaiman,kadir,tarik,ali,abu_bakar,ikbal,atik,japer,sadi;
    private ImageView backBtn,optionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writer_name);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn =  findViewById(R.id.backButton);
        optionBtn = findViewById(R.id.optionButton);

        backBtn.setOnClickListener(this);
        optionBtn.setOnClickListener(this);

        quran =  findViewById(R.id.quran);
        hadis =  findViewById(R.id.hadis);
        arif =  findViewById(R.id.arif);
        rumi =  findViewById(R.id.rumi);
        konaibi =  findViewById(R.id.kunaibi);
        bilal =  findViewById(R.id.bilal);
        muzahid =  findViewById(R.id.muzahid);
        bashari =  findViewById(R.id.bashari);
        gajjali =  findViewById(R.id.hamid);
        taimiya =  findViewById(R.id.taimiya);
        shafiyi =  findViewById(R.id.shafiyi);
        sulaiman =  findViewById(R.id.sulaiman);
        kadir =  findViewById(R.id.kadir);
        tarik =  findViewById(R.id.tarik);
        ali =  findViewById(R.id.ali);
        abu_bakar =  findViewById(R.id.abu_bakar);
        ikbal =  findViewById(R.id.ikbal);
        atik =  findViewById(R.id.atik);
        japer =  findViewById(R.id.japer);
       sadi =  findViewById(R.id.sadi);


        quran.setOnClickListener(this);
        hadis.setOnClickListener(this);
        arif.setOnClickListener(this);
        rumi.setOnClickListener(this);
        konaibi.setOnClickListener(this);
        bilal.setOnClickListener(this);
        muzahid.setOnClickListener(this);
        bashari.setOnClickListener(this);
        gajjali.setOnClickListener(this);
        taimiya.setOnClickListener(this);
        shafiyi.setOnClickListener(this);
        sulaiman.setOnClickListener(this);
        kadir.setOnClickListener(this);
        tarik.setOnClickListener(this);
        ali.setOnClickListener(this);
        abu_bakar.setOnClickListener(this);
        ikbal.setOnClickListener(this);
        atik.setOnClickListener(this);
        japer.setOnClickListener(this);
        sadi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.backButton){
            this.finish();
        }

        if(v.getId()==R.id.optionButton){

            PopupMenu popupMenu = new PopupMenu(Writer_Name.this,optionBtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId()==R.id.emailButton){

                    Toast.makeText(Writer_Name.this, "Email", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId()==R.id.shareButton){

                    Toast.makeText(Writer_Name.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        }

        if (v.getId()==R.id.quran){
            Intent intent = new Intent(Writer_Name.this,Quran.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hadis){
            Intent intent = new Intent(Writer_Name.this,Hadis.class);
            startActivity(intent);
        }

        if (v.getId()==R.id.arif){
            Intent intent = new Intent(Writer_Name.this,Arif_azad.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.rumi){
            Intent intent = new Intent(Writer_Name.this,Jalaluddin_muhammad_rumi.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.kunaibi){
            Intent intent = new Intent(Writer_Name.this,D_kunobi.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.bilal){
            Intent intent = new Intent(Writer_Name.this,D_Bilal.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.muzahid){
            Intent intent = new Intent(Writer_Name.this,Muzahid.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.bashari){
            Intent intent = new Intent(Writer_Name.this,Hasan_Al_Bashari.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hamid){
            Intent intent = new Intent(Writer_Name.this,hamid.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.taimiya){
            Intent intent = new Intent(Writer_Name.this,taimiya.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.shafiyi){
            Intent intent = new Intent(Writer_Name.this,Shafiyi.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.sulaiman){
            Intent intent = new Intent(Writer_Name.this,Sulaiman.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.kadir){
            Intent intent = new Intent(Writer_Name.this,Kadir.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.tarik){
            Intent intent = new Intent(Writer_Name.this,Tarik.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.ali){
            Intent intent = new Intent(Writer_Name.this,Ali.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.abu_bakar){
            Intent intent = new Intent(Writer_Name.this,abu_bakar.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.ikbal){
            Intent intent = new Intent(Writer_Name.this,Ikbal.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.atik){
            Intent intent = new Intent(Writer_Name.this,Atik.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.japer){
            Intent intent = new Intent(Writer_Name.this,Japer.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.sadi){
            Intent intent = new Intent(Writer_Name.this,Sadi.class);
            startActivity(intent);
        }

    }
}