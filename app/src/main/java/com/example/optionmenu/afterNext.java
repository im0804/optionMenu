package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class afterNext extends AppCompatActivity {
    int id;
    LinearLayout RLNext;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_next);

        RLNext = (LinearLayout) findViewById(R.id.RLNext);
    }

    public void back(View view) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0,0,400, "red");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        id = item.getItemId();
        st = item.getTitle().toString();
        if (id == R.id.menuGreen){
            RLNext.setBackgroundColor(Color.GREEN);
        }
        if (id == R.id.menuBlue){
            RLNext.setBackgroundColor(Color.BLUE);
        }
        if (id == R.id.menuWhite){
            RLNext.setBackgroundColor(Color.WHITE);
        }
        if (st.equals("red")){
            RLNext.setBackgroundColor(Color.RED);
        }
        return true;
    }
}