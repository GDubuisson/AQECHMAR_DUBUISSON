package com.example.leroux.aqechmar_dubuisson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.Console;
import java.util.Arrays;

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
        Log.d("app", "HEYO " + view.getId());
        Log.d("app", "HEYO2 " + R.id.cLMedic1);
        String test ="";
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) {
            if (view.getId() == ecl.layout) {
                test = ecl.name();
            }
        }
        action.putExtra("recup",test);
        startActivity(action);
    }


}
