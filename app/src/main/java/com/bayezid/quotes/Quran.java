package com.bayezid.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Quran extends AppCompatActivity implements View.OnClickListener {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26;
    private ImageView copy1,copy2,copy3,copy4,copy5,copy6,copy7,copy8,copy9,copy10,copy11,copy12,copy13,copy14,copy15,copy16,copy17,copy18,copy19,copy20,copy21,copy22,copy23,copy24,copy25,copy26;
    private ImageView share1,share2,share3,share4,share5,share6,share7,share8,share9,share10,share11,share12,share13,share14,share15,share16,share17,share18,share19,share20,share21,share22,share23,share24,share25,share26;
    private ImageView backBtn,optionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn =  findViewById(R.id.backButton);
        optionBtn = findViewById(R.id.optionButton);

        backBtn.setOnClickListener(this);
        optionBtn.setOnClickListener(this);

        text1 =  findViewById(R.id.qurantext1);
        text2 =  findViewById(R.id.qurantext2);
        text3 =  findViewById(R.id.qurantext3);
        text4 =  findViewById(R.id.qurantext4);
        text5 =  findViewById(R.id.qurantext5);
        text6 =  findViewById(R.id.qurantext6);
        text7 =  findViewById(R.id.qurantext7);
        text8 =  findViewById(R.id.qurantext8);
        text9 =  findViewById(R.id.qurantext9);
        text10 =  findViewById(R.id.qurantext10);
        text11 =  findViewById(R.id.qurantext11);
        text12 =  findViewById(R.id.qurantext12);
        text13 =  findViewById(R.id.qurantext13);
        text14 =  findViewById(R.id.qurantext14);
        text15 =  findViewById(R.id.qurantext15);
        text16 =  findViewById(R.id.qurantext16);
        text17 =  findViewById(R.id.qurantext17);
        text18 =  findViewById(R.id.qurantext18);
        text19 =  findViewById(R.id.qurantext19);
        text20 =  findViewById(R.id.qurantext20);
        text21 =  findViewById(R.id.qurantext21);
        text22 =  findViewById(R.id.qurantext22);
        text23 =  findViewById(R.id.qurantext23);
        text24 =  findViewById(R.id.qurantext24);
        text25 =  findViewById(R.id.qurantext25);
        text26 =  findViewById(R.id.qurantext26);

        copy1 =  findViewById(R.id.qurancopy1);
        copy2 =  findViewById(R.id.qurancopy2);
        copy3 =  findViewById(R.id.qurancopy3);
        copy4 =  findViewById(R.id.qurancopy4);
        copy5 =  findViewById(R.id.qurancopy5);
        copy6 =  findViewById(R.id.qurancopy6);
        copy7 =  findViewById(R.id.qurancopy7);
        copy8 =  findViewById(R.id.qurancopy8);
        copy9 =  findViewById(R.id.qurancopy9);
        copy10 =  findViewById(R.id.qurancopy10);
        copy11 =  findViewById(R.id.qurancopy11);
        copy12 =  findViewById(R.id.qurancopy12);
        copy13 =  findViewById(R.id.qurancopy13);
        copy14 =  findViewById(R.id.qurancopy14);
        copy15 =  findViewById(R.id.qurancopy15);
        copy16 =  findViewById(R.id.qurancopy16);
        copy17 =  findViewById(R.id.qurancopy17);
        copy18 =  findViewById(R.id.qurancopy18);
        copy19 =  findViewById(R.id.qurancopy19);
        copy20 =  findViewById(R.id.qurancopy20);
        copy21 =  findViewById(R.id.qurancopy21);
        copy22 =  findViewById(R.id.qurancopy22);
        copy23 =  findViewById(R.id.qurancopy23);
        copy24 =  findViewById(R.id.qurancopy24);
        copy25 =  findViewById(R.id.qurancopy25);
        copy26 =  findViewById(R.id.qurancopy26);

        share1 =  findViewById(R.id.quranshare1);
        share2 =  findViewById(R.id.quranshare2);
        share3 =  findViewById(R.id.quranshare3);
        share4 =  findViewById(R.id.quranshare4);
        share5 =  findViewById(R.id.quranshare5);
        share6 =  findViewById(R.id.quranshare6);
        share7 =  findViewById(R.id.quranshare7);
        share8 =  findViewById(R.id.quranshare8);
        share9 =  findViewById(R.id.quranshare9);
        share10 =  findViewById(R.id.quranshare10);
        share11 =  findViewById(R.id.quranshare11);
        share12 =  findViewById(R.id.quranshare12);
        share13 =  findViewById(R.id.quranshare13);
        share14 =  findViewById(R.id.quranshare14);
        share15 =  findViewById(R.id.quranshare15);
        share16 =  findViewById(R.id.quranshare16);
        share17 =  findViewById(R.id.quranshare17);
        share18 =  findViewById(R.id.quranshare18);
        share19 =  findViewById(R.id.quranshare19);
        share20 =  findViewById(R.id.quranshare20);
        share21 =  findViewById(R.id.quranshare21);
        share22 =  findViewById(R.id.quranshare22);
        share23 =  findViewById(R.id.quranshare23);
        share24 =  findViewById(R.id.quranshare24);
        share25 =  findViewById(R.id.quranshare25);
        share26 =  findViewById(R.id.quranshare26);


        copy1.setOnClickListener(this);
        copy2.setOnClickListener(this);
        copy3.setOnClickListener(this);
        copy4.setOnClickListener(this);
        copy5.setOnClickListener(this);
        copy6.setOnClickListener(this);
        copy7.setOnClickListener(this);
        copy8.setOnClickListener(this);
        copy9.setOnClickListener(this);
        copy10.setOnClickListener(this);
        copy11.setOnClickListener(this);
        copy12.setOnClickListener(this);
        copy13.setOnClickListener(this);
        copy14.setOnClickListener(this);
        copy15.setOnClickListener(this);
        copy16.setOnClickListener(this);
        copy17.setOnClickListener(this);
        copy18.setOnClickListener(this);
        copy19.setOnClickListener(this);
        copy20.setOnClickListener(this);
        copy21.setOnClickListener(this);
        copy22.setOnClickListener(this);
        copy23.setOnClickListener(this);
        copy24.setOnClickListener(this);
        copy25.setOnClickListener(this);
        copy26.setOnClickListener(this);


        share1.setOnClickListener(this);
        share2.setOnClickListener(this);
        share3.setOnClickListener(this);
        share4.setOnClickListener(this);
        share5.setOnClickListener(this);
        share6.setOnClickListener(this);
        share7.setOnClickListener(this);
        share8.setOnClickListener(this);
        share9.setOnClickListener(this);
        share10.setOnClickListener(this);
        share11.setOnClickListener(this);
        share12.setOnClickListener(this);
        share13.setOnClickListener(this);
        share14.setOnClickListener(this);
        share15.setOnClickListener(this);
        share16.setOnClickListener(this);
        share17.setOnClickListener(this);
        share18.setOnClickListener(this);
        share19.setOnClickListener(this);
        share20.setOnClickListener(this);
        share21.setOnClickListener(this);
        share22.setOnClickListener(this);
        share23.setOnClickListener(this);
        share24.setOnClickListener(this);
        share25.setOnClickListener(this);
        share26.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.backButton){
            this.finish();
        }

        if(v.getId()==R.id.optionButton){

            PopupMenu popupMenu = new PopupMenu(Quran.this,optionBtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId()==R.id.emailButton){
                    try {

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:"));
                        String [] abu_bakarEmail = {getString(R.string.my_email)};
                        intent.putExtra(Intent.EXTRA_EMAIL,abu_bakarEmail);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Quotes problems of Quran");
                        intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.ali_problems));
                        startActivity(Intent.createChooser(intent,"Send Email"));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (item.getItemId()==R.id.shareButton){

                    Toast.makeText(Quran.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        }

        if (v.getId()==R.id.qurancopy1){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text1.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare1){

            String text = text1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy2){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text2.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare2){

            String text = text2.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy3){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text3.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare3){

            String text = text3.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy4){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text4.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare4){

            String text = text4.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy5){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text5.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare5){

            String text = text5.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy6){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text6.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare6){

            String text = text6.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy7){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text7.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare7){

            String text = text7.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy8){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text8.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare8){

            String text = text8.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy9){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text9.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare9){

            String text = text9.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy10){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text10.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare10){

            String text = text10.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy11){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text11.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare11){

            String text = text11.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy12){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text12.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare12){

            String text = text12.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy13){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text13.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare13){

            String text = text13.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy14){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text14.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare14){

            String text = text14.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy15){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text15.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare15){

            String text = text15.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy16){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text16.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare16){

            String text = text16.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy17){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text17.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare17){

            String text = text17.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy18){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text18.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare18){

            String text = text18.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy19){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text19.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare19){

            String text = text19.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy20){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text20.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare20){

            String text = text20.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy21){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text21.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare21){

            String text = text21.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }



        if (v.getId()==R.id.qurancopy22){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text22.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare22){

            String text = text22.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy23){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text23.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare23){

            String text = text23.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy24){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text24.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare24){

            String text = text24.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy25){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text25.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare25){

            String text = text25.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.qurancopy26){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text26.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quran.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.quranshare26){

            String text = text26.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }






    }
}