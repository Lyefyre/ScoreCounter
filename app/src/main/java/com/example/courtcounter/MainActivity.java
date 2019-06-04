package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */

    int teama = 0;
    int teamb = 0;

    public void plusthree1(View view) {
        teama = teama + 3;
        displaya(teama);
    }

    public void plustwo1(View view) {
        teama = teama + 2;
        displaya(teama);
    }

    public void plusone1(View view) {
        teama = teama + 1;
        displaya(teama);
    }

    public void plusthree2(View view) {
        teamb = teamb + 3;
        displayb(teamb);
    }

    public void plustwo2(View view) {
        teamb = teamb + 2;
        displayb(teamb);
    }

    public void plusone2(View view) {
        teamb = teamb + 1;
        displayb(teamb);
    }

    public void reset(View view) {
        teamb = 0;
        teama = 0;
        displaya(teama);
        displayb(teamb);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displaya(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scorea);
        quantityTextView.setText(String.valueOf(number));
    }

    private void displayb(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.scoreb);
        priceTextView.setText(String.valueOf(number));
    }
}
