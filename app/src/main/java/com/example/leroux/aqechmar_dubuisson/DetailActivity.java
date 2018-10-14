package com.example.leroux.aqechmar_dubuisson;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private EnumConstraintLayout enumRecup = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        enumRecup = EnumConstraintLayout.valueOf(getIntent().getStringExtra("recup"));
        findViewById(R.id.medicDetailActivity)
                .setBackground(getDrawable(enumRecup.drawable));
        ((TextView) findViewById(R.id.textView))
                .setText(enumRecup.name);
        ((TextView) findViewById(R.id.textView2))
                .setText(enumRecup.description);
    }

    public void createNotification(View view) {
        final Intent emptyIntent = new Intent();
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, emptyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        Notification notification = new NotificationCompat.Builder(this, "maNotif")
                .setSmallIcon(enumRecup.drawable)
                .setContentTitle(enumRecup.name)
                .setContentText(enumRecup.description)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(5, notification);
    }


}
