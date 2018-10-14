package com.example.leroux.aqechmar_dubuisson;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static String SAVED_KEY = "Saved_medoc";
    public SharedPreferences defaultSharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences.contains(SAVED_KEY)) {
            Intent var = new Intent(this,DetailActivity.class);
            var.putExtra("recup", defaultSharedPreferences.getString(SAVED_KEY,""));
            startActivity(var);
        }
        afficheToast();
    }

    private void init_layout() {
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) { //ecl = enum constraint layout
            findViewById(ecl.layout).setBackground(getDrawable(ecl.drawable));
        }
    }

    private void afficheToast() {
        String message = getResources().getString(R.string.welcome);
        Toast bienvenu = Toast.makeText(this, message, Toast.LENGTH_LONG);
        bienvenu.show();
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent action = new Intent(this, DetailActivity.class);
        String test = "";
        for (EnumConstraintLayout ecl : EnumConstraintLayout.values()) {
            if (view.getId() == ecl.layout) {
                test = ecl.name();
            }
        }
        SharedPreferences.Editor editor = defaultSharedPreferences.edit();
        editor.putString(SAVED_KEY,test);
        editor.apply();
        action.putExtra("recup", test);
        startActivity(action);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Uri uri = Uri.parse("http://www.univ-poitiers.fr");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
}
