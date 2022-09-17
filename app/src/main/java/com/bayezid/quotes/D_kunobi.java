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

public class D_kunobi extends AppCompatActivity implements View.OnClickListener {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    private ImageView copy1,copy2,copy3,copy4,copy5,copy6,copy7,copy8,copy9,copy10;
    private ImageView share1,share2,share3,share4,share5,share6,share7,share8,share9,share10;
    private ImageView backBtn,optionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dkunobi);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn =  findViewById(R.id.backButton);
        optionBtn = findViewById(R.id.optionButton);

        backBtn.setOnClickListener(this);
        optionBtn.setOnClickListener(this);

        text1 = findViewById(R.id.kunaibitext1);
        text2 =  findViewById(R.id.kunaibitext2);
        text3 =  findViewById(R.id.kunaibitext3);
        text4 =  findViewById(R.id.kunaibitext4);
        text5 =  findViewById(R.id.kunaibitext5);
        text6 =  findViewById(R.id.kunaibitext6);
        text7 =  findViewById(R.id.kunaibitext7);
        text8 =  findViewById(R.id.kunaibitext8);
        text9 =  findViewById(R.id.kunaibitext9);
        text10 =  findViewById(R.id.kunaibitext10);


        copy1 =  findViewById(R.id.kunaibicopy1);
        copy2 =  findViewById(R.id.kunaibicopy2);
        copy3 =  findViewById(R.id.kunaibicopy3);
        copy4 =  findViewById(R.id.kunaibicopy4);
        copy5 =  findViewById(R.id.kunaibicopy5);
        copy6 =  findViewById(R.id.kunaibicopy6);
        copy7 =  findViewById(R.id.kunaibicopy7);
        copy8 =  findViewById(R.id.kunaibicopy8);
        copy9 =  findViewById(R.id.kunaibicopy9);
        copy10 =  findViewById(R.id.kunaibicopy10);


        share1 =  findViewById(R.id.kunaibishare1);
        share2 =  findViewById(R.id.kunaibishare2);
        share3 =  findViewById(R.id.kunaibishare3);
        share4 =  findViewById(R.id.kunaibishare4);
        share5 =  findViewById(R.id.kunaibishare5);
        share6 =  findViewById(R.id.kunaibishare6);
        share7 =  findViewById(R.id.kunaibishare7);
        share8 =  findViewById(R.id.kunaibishare8);
        share9 =  findViewById(R.id.kunaibishare9);
        share10 =  findViewById(R.id.kunaibishare10);

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
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.backButton){
            this.finish();
        }

        if(v.getId()==R.id.optionButton){

            PopupMenu popupMenu = new PopupMenu(D_kunobi.this,optionBtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId()==R.id.emailButton){
                    try {

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:"));
                        String [] abu_bakarEmail = {getString(R.string.my_email)};
                        intent.putExtra(Intent.EXTRA_EMAIL,abu_bakarEmail);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Quotes problems of D. kunaibi");
                        intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.ali_problems));
                        startActivity(Intent.createChooser(intent,"Send Email"));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (item.getItemId()==R.id.shareButton){

                    Toast.makeText(D_kunobi.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        }


        if (v.getId()==R.id.kunaibicopy1){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text1.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare1){

            String text = text1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy2){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text2.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare2){

            String text = text2.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy3){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text3.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare3){

            String text = text3.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy4){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text4.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare4){

            String text = text4.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy5){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text5.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare5){

            String text = text5.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy6){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text6.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare6){

            String text = text6.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy7){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text7.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare7){

            String text = text7.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy8){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text8.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare8){

            String text = text8.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy9){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text9.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare9){

            String text = text9.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }

        if (v.getId()==R.id.kunaibicopy10){
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",text10.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(D_kunobi.this, "কপি করা হয়েছে", Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==R.id.kunaibishare10){

            String text = text10.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Write subject here");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Share text by"));

        }
    }
}