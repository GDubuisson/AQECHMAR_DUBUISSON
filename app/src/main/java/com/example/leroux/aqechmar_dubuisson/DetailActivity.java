package com.example.leroux.aqechmar_dubuisson;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
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
        image.setBackground(getDrawable(enumRecup.drawable));
        titre.setText(enumRecup.name);
        desc.setText(enumRecup.description);

    }
}
