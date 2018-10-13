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

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int actualView = getIntent().getIntExtra("actualView", -1);
        View viewById = findViewById(actualView);

        ConstraintLayout actuel = findViewById(R.id.medicDetailActivity);
        actuel.setBackground(viewById.getBackground());
    }
}
