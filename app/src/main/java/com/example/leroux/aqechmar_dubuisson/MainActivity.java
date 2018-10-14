package com.example.leroux.aqechmar_dubuisson;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String SAVE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
        //verifier ici et lancer l'activité qui va bien
        if (PreferenceManager.getDefaultSharedPreferences(this).contains(SAVE)) {
            Log.d("msg2","HEYO2 "+PreferenceManager.getDefaultSharedPreferences(this).getString(SAVE,""));
            Intent var = new Intent(this,DetailActivity.class);
            var.putExtra("recup",PreferenceManager.getDefaultSharedPreferences(this).getString(SAVE,""));
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
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(SAVE,test);
        editor.apply();

        Log.d("msg","HEYO "+PreferenceManager.getDefaultSharedPreferences(this).getString(SAVE,""));
        Log.d("msg1","HEYO1 "+test);

        action.putExtra("recup", test);
        startActivity(action);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
