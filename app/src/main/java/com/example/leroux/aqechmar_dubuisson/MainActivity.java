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


        ConstraintLayout medoc1 = findViewById(R.id.constraintLayout1);
        ConstraintLayout medoc2 = findViewById(R.id.constraintLayout2);
        ConstraintLayout medoc3 = findViewById(R.id.constraintLayout3);
        ConstraintLayout medoc4 = findViewById(R.id.constraintLayout4);
        ConstraintLayout medoc5 = findViewById(R.id.constraintLayout5);
        ConstraintLayout medoc6 = findViewById(R.id.constraintLayout6);
        ConstraintLayout medoc7 = findViewById(R.id.constraintLayout7);

        medoc1.setBackground(getDrawable(MEDIC1.drawable));
        medoc2.setBackground(getDrawable(MEDIC2.drawable));
        medoc3.setBackground(getDrawable(MEDIC3.drawable));
        medoc4.setBackground(getDrawable(MEDIC4.drawable));
        medoc5.setBackground(getDrawable(MEDIC5.drawable));
        medoc6.setBackground(getDrawable(MEDIC6.drawable));
        medoc7.setBackground(getDrawable(MEDIC7.drawable));
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent action = new Intent(this, DetailActivity.class);
        startActivity(action);
    }


}
