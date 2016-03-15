package com.example.jchua204.relativeprogressbuttons;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RelativeProgressButton extends AppCompatActivity {
    public ProgressBar proBar;
    TextView txtProVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_progress_button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //where all variables are given values
        txtProVal = (TextView) findViewById(R.id.txtProVal);
        proBar = (ProgressBar) findViewById(R.id.proBar);
        proBar.setProgress(50);
    }

    public void DecreasePro(View vw) {
        if(proBar.getProgress() <= 0) {
            proBar.setProgress(proBar.getProgress() - 0);
            txtProVal.setText("Can no longer go any lower.");
        }else {
            proBar.setProgress(proBar.getProgress() - 5);
            txtProVal.setText("");
        }
    }
    public void IncreasePro(View vw) {
        if(proBar.getProgress() >= 100) {
            proBar.setProgress(proBar.getProgress() + 0);
            txtProVal.setText("Can no longer go any higher.");
        }else {
            proBar.setProgress(proBar.getProgress() + 5);
            txtProVal.setText("");
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_relative_progress_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
