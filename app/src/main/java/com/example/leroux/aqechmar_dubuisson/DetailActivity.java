package com.example.leroux.aqechmar_dubuisson;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

    public void createNotification(View view) {
        String test ="";
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) {
            if (view.getId()==ecl.layout) {
                test=ecl.name;
            }
        }
        EnumConstraintLayout enumRecup = EnumConstraintLayout.valueOf(test);
        NotificationCompat.Builder notification=new NotificationCompat.Builder(this,"maNotif")
                .setSmallIcon(enumRecup.drawable)
                .setContentTitle(enumRecup.name)
                .setContentText(enumRecup.description)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
    }
}
