package com.example.leroux.aqechmar_dubuisson;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ConstraintLayout medic = findViewById(R.id.constraintLayout3);
        medic.setBackground(Drawable.createFromPath("drawable-hdpi/medicament1.png"));
    }
}
