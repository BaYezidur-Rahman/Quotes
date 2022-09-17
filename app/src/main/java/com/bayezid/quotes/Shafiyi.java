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

public class Shafiyi extends AppCompatActivity implements View.OnClickListener {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;
    private ImageView copy1,copy2,copy3,copy4,copy5,copy6,copy7,copy8,copy9,copy10,copy11,copy12,copy13,copy14;
    private ImageView share1,share2,share3,share4,share5,share6,share7,share8,share9,share10,share11,share12,share13,share14;
    private ImageView backBtn,optionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shafiyi);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn =  findViewById(R.id.backButton);
        optionBtn = findViewById(R.id.optionButton);

        backBtn.setOnClickListener(this);
        optionBtn.setOnClickListener(this);

        text1 =  findViewById(R.id.shafiyitext1);
        text2 =  findViewById(R.id.shafiyitext2);
        text3 =  findViewById(R.id.shafiyitext3);
        text4 =  findViewById(R.id.shafiyitext4);
        text5 =  findViewById(R.id.shafiyitext5);
        text6 =  findViewById(R.id.shafiyitext6);
        text7 =  findViewById(R.id.shafiyitext7);
        text8 =  findViewById(R.id.shafiyitext8);
        text9 =  findViewById(R.id.shafiyitext9);
        text10 =  findViewById(R.id.shafiyitext10);
        text11 =  findViewById(R.id.shafiyitext11);
        text12 =  findViewById(R.id.shafiyitext12);
        text13 =  findViewById(R.id.shafiyitext13);
        text14 =  findViewById(R.id.shafiyitext14);


        copy1 =  findViewById(R.id.shafiyicopy1);
        copy2 =  findViewById(R.id.shafiyicopy2);
        copy3 =  findViewById(R.id.shafiyicopy3);
        copy4 =  findViewById(R.id.shafiyicopy4);
        copy5 =  findViewById(R.id.shafiyicopy5);
        copy6 =  findViewById(R.id.shafiyicopy6);
        copy7 =  findViewById(R.id.shafiyicopy7);
        copy8 =  findViewById(R.id.shafiyicopy8);
        copy9 =  findViewById(R.id.shafiyicopy9);
        copy10 =  findViewById(R.id.shafiyicopy10);
        copy11 =  findViewById(R.id.shafiyicopy11);
        copy12 =  findViewById(R.id.shafiyicopy12);
        copy13 =  findViewById(R.id.shafiyicopy13);
        copy14 =  findViewById(R.id.shafiyicopy14);


        share1 =  findViewById(R.id.shafiyishare1);
        share2 =  findViewById(R.id.shafiyishare2);
        share3 =  findViewById(R.id.shafiyishare3);
        share4 =  findViewById(R.id.shafiyishare4);
        share5 =  findViewById(R.id.shafiyishare5);
        share6 =  findViewById(R.id.shafiyishare6);
        share7 =  findViewById(R.id.shafiyishare7);
        share8 =  findViewById(R.id.shafiyishare8);
        share9 =  findViewById(R.id.shafiyishare9);
        share10 =  findViewById(R.id.shafiyishare10);
        share11 =  findViewById(R.id.shafiyishare11);
        share12 =  findViewById(R.id.shafiyishare12);
        share13 =  findViewById(R.id.shafiyishare13);
        share14 =  findViewById(R.id.shafiyishare14);



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



    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.backButton){
            this.finish();
        }

        if(v.getId()==R.id.optionButton){

            PopupMenu popupMenu = new PopupMenu(Shafiyi.this,optionBtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId()==R.id.emailButton){
                    try {

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:"));
                        String [] abu_bakarEmail = {getString(R.string.my_email)};
                        intent.putExtra(Intent.EXTRA_EMAIL,abu_bakarEmail);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Quotes problems of Imam hafiyi (R.)");
                        intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.ali_problems));
                        startActivity(Intent.createChooser(intent,"Send Email"));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (item.getItemId()==R.id.shareButton){

                    Toast.makeText(Shafiyi.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        }

        if (v.getId()==R.id.shafiyicopy1){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text1.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare1){

            String text = text1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy2){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text2.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare2){

            String text = text2.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy3){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text3.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare3){

            String text = text3.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy4){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text4.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare4){

            String text = text4.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy5){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text5.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare5){

            String text = text5.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy6){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text6.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare6){

            String text = text6.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy7){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text7.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare7){

            String text = text7.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy8){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text8.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare8){

            String text = text8.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy9){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text9.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare9){

            String text = text9.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy10){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text10.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare10){

            String text = text10.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy11){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text11.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare11){

            String text = text11.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy12){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text12.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare12){

            String text = text12.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy13){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text13.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare13){

            String text = text13.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.shafiyicopy14){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text14.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Shafiyi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.shafiyishare14){

            String text = text14.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }








    }
}