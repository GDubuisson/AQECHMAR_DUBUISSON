package com.example.leroux.aqechmar_dubuisson;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EnumConstraintLayout enumRecup = EnumConstraintLayout.valueOf(getIntent().getStringExtra("recup"));

        ConstraintLayout image = findViewById(R.id.medicDetailActivity);
        TextView titre = findViewById(R.id.textView);
        TextView desc = findViewById(R.id.textView2);
        //https://developer.android.com/guide/topics/data/data-storage#pref
        image.setBackground(getDrawable(enumRecup.drawable));
        titre.setText(enumRecup.name);
        desc.setText(enumRecup.description);

    }
}
