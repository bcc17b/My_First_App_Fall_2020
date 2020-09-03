package com.bcc17.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class DisplayMessageActivity extends AppCompatActivity {

    ImageView img;
    Button show;
    MediaPlayer ring;
    boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        img = (ImageView)findViewById(R.id.imageView2);
        show = (Button)findViewById(R.id.button2);
        ring= MediaPlayer.create(this, R.raw.song);
        clicked = false;

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (clicked == false){
                    clicked = true;
                    img.setVisibility(View.VISIBLE);
                    ring.start();
                }
                else{
                    clicked = false;
                    img.setVisibility(View.INVISIBLE);
                    ring.stop();
                    ring.reset();
                }
            }
        });
    }

    public void showImage(View view) {
        ImageView imageview =(ImageView) findViewById(R.id.imageView2);
        imageview.setVisibility(View.VISIBLE);
    }

}