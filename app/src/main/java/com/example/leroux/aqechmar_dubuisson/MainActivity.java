package com.example.leroux.aqechmar_dubuisson;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.leroux.aqechmar_dubuisson.EnumConstraintLayout.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
    }

    private void init_layout() {
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) { //ecl = enum constraint layout
            findViewById(ecl.layout).setBackground(getDrawable(ecl.drawable));
        }
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent action = new Intent(this, DetailActivity.class);
        startActivity(action);
    }


}
