package com.example.leroux.aqechmar_dubuisson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Toast bienvenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
        afficheToast();
    }

    private void init_layout() {
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) { //ecl = enum constraint layout
            findViewById(ecl.layout).setBackground(getDrawable(ecl.drawable));
        }
    }

    private void afficheToast() {
        bienvenu = Toast.makeText(this, "Bienvenu", Toast.LENGTH_LONG);
        bienvenu.show();
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent action = new Intent(this, DetailActivity.class);
        Log.d("app", "HEYO " + view.getId());
        Log.d("app", "HEYO2 " + R.id.cLMedic1);
        String test = "";
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) {
            if (view.getId() == ecl.layout) {
                test = ecl.name();
            }
        }
        action.putExtra("recup", test);
        startActivity(action);
    }


}
