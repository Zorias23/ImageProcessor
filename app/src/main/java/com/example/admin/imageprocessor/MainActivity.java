package com.example.admin.imageprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Admin on 2/15/2018.
 */

public class MainActivity extends AppCompatActivity {
    ImageView workingImage;
    private int rotation = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        workingImage = findViewById(R.id.workingImage);
        workingImage.setImageResource(R.drawable.utah_mountaings);
    }

    public void rotateRight(View view) {
        Picasso.with(this)
                .load(R.drawable.utah_mountaings)
                .rotate((rotation+90))
                .into(workingImage);
        rotation = rotation + 90;
    }

    public void rotateLeft(View view) {
        Picasso.with(this)
                .load(R.drawable.utah_mountaings)
                .rotate((rotation-90))
                .into(workingImage);
        rotation = rotation - 90;
    }
}
