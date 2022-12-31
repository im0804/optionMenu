package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout RL;
    int id;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RL = (LinearLayout) findViewById(R.id.RLNext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        id = item.getItemId();
        if (id == R.id.menuGreen){
            RL.setBackgroundColor(Color.GREEN);
        }
        if (id == R.id.menuBlue){
            RL.setBackgroundColor(Color.BLUE);
        }
        if (id == R.id.menuWhite){
            RL.setBackgroundColor(Color.WHITE);
        }
        return true;
    }

    public void next(View view) {
        si = new Intent(this, afterNext.class);
        startActivity(si);
    }
}