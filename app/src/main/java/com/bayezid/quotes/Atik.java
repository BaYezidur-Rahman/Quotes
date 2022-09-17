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

public class Atik extends AppCompatActivity implements View.OnClickListener {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20;
    private ImageView copy1,copy2,copy3,copy4,copy5,copy6,copy7,copy8,copy9,copy10,copy11,copy12,copy13,copy14,copy15,copy16,copy17,copy18,copy19,copy20;
    private ImageView share1,share2,share3,share4,share5,share6,share7,share8,share9,share10,share11,share12,share13,share14,share15,share16,share17,share18,share19,share20;
    private ImageView backBtn,optionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atik);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn = findViewById(R.id.backButton);
        optionBtn = findViewById(R.id.optionButton);

        backBtn.setOnClickListener(this);
        optionBtn.setOnClickListener(this);

        text1 =  findViewById(R.id.atiktext1);
        text2 =  findViewById(R.id.atiktext2);
        text3 =  findViewById(R.id.atiktext3);
        text4 =  findViewById(R.id.atiktext4);
        text5 =  findViewById(R.id.atiktext5);
        text6 =  findViewById(R.id.atiktext6);
        text7 =  findViewById(R.id.atiktext7);
        text8 =  findViewById(R.id.atiktext8);
        text9 =  findViewById(R.id.atiktext9);
        text10 =  findViewById(R.id.atiktext10);
        text11 =  findViewById(R.id.atiktext11);
        text12 =  findViewById(R.id.atiktext12);
        text13 =  findViewById(R.id.atiktext13);
        text14 =  findViewById(R.id.atiktext14);
        text15 =  findViewById(R.id.atiktext15);
        text16 =  findViewById(R.id.atiktext16);
        text17 =  findViewById(R.id.atiktext17);
        text18 =  findViewById(R.id.atiktext18);
        text19 =  findViewById(R.id.atiktext19);
        text20 =  findViewById(R.id.atiktext20);


        copy1 =  findViewById(R.id.atikcopy1);
        copy2 =  findViewById(R.id.atikcopy2);
        copy3 =  findViewById(R.id.atikcopy3);
        copy4 =  findViewById(R.id.atikcopy4);
        copy5 =  findViewById(R.id.atikcopy5);
        copy6 =  findViewById(R.id.atikcopy6);
        copy7 =  findViewById(R.id.atikcopy7);
        copy8 =  findViewById(R.id.atikcopy8);
        copy9 =  findViewById(R.id.atikcopy9);
        copy10 =  findViewById(R.id.atikcopy10);
        copy11 =  findViewById(R.id.atikcopy11);
        copy12 =  findViewById(R.id.atikcopy12);
        copy13 =  findViewById(R.id.atikcopy13);
        copy14 =  findViewById(R.id.atikcopy14);
        copy15 =  findViewById(R.id.atikcopy15);
        copy16 =  findViewById(R.id.atikcopy16);
        copy17 =  findViewById(R.id.atikcopy17);
        copy18 =  findViewById(R.id.atikcopy18);
        copy19 =  findViewById(R.id.atikcopy19);
        copy20 =  findViewById(R.id.atikcopy20);


        share1 =  findViewById(R.id.atikshare1);
        share2 =  findViewById(R.id.atikshare2);
        share3 =  findViewById(R.id.atikshare3);
        share4 =  findViewById(R.id.atikshare4);
        share5 =  findViewById(R.id.atikshare5);
        share6 =  findViewById(R.id.atikshare6);
        share7 =  findViewById(R.id.atikshare7);
        share8 =  findViewById(R.id.atikshare8);
        share9 =  findViewById(R.id.atikshare9);
        share10 =  findViewById(R.id.atikshare10);
        share11 =  findViewById(R.id.atikshare11);
        share12 =  findViewById(R.id.atikshare12);
        share13 =  findViewById(R.id.atikshare13);
        share14 =  findViewById(R.id.atikshare14);
        share15 =  findViewById(R.id.atikshare15);
        share16 =  findViewById(R.id.atikshare16);
        share17 =  findViewById(R.id.atikshare17);
        share18 =  findViewById(R.id.atikshare18);
        share19 =  findViewById(R.id.atikshare19);
        share20 =  findViewById(R.id.atikshare20);



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



    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.backButton){
            this.finish();
        }

        if(v.getId()==R.id.optionButton){

            PopupMenu popupMenu = new PopupMenu(Atik.this,optionBtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId()==R.id.emailButton){
                    try {

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:"));
                        String [] abu_bakarEmail = {getString(R.string.my_email)};
                        intent.putExtra(Intent.EXTRA_EMAIL,abu_bakarEmail);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Quotes problems of Atik ullah");
                        intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.ali_problems));
                        startActivity(Intent.createChooser(intent,"Send Email"));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (item.getItemId()==R.id.shareButton){

                    Toast.makeText(Atik.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        }

        if (v.getId()==R.id.atikcopy1){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text1.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare1){

            String text = text1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy2){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text2.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare2){

            String text = text2.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy3){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text3.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare3){

            String text = text3.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy4){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text4.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare4){

            String text = text4.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy5){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text5.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare5){

            String text = text5.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy6){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text6.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare6){

            String text = text6.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy7){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text7.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare7){

            String text = text7.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy8){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text8.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare8){

            String text = text8.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy9){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text9.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare9){

            String text = text9.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy10){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text10.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare10){

            String text = text10.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy11){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text11.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare11){

            String text = text11.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy12){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text12.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare12){

            String text = text12.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy13){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text13.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare13){

            String text = text13.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy14){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text14.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare14){

            String text = text14.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy15){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text15.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare15){

            String text = text15.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy16){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text16.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare16){

            String text = text16.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy17){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text17.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare17){

            String text = text17.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy18){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text18.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare18){

            String text = text18.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy19){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text19.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare19){

            String text = text19.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.atikcopy20){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text20.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Atik.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.atikshare20){

            String text = text20.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }








    }
}