package com.kirer.glidedemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
    }

    private void initView() {
        Glide
                .with(this)
                .load("http://45.32.48.236/3/background1.jpg")
                .into((ImageView) findViewById(R.id.img1));

        Glide
                .with(this)
                .load("http://45.32.48.236/3/background2.jpg")
                .placeholder(R.drawable.ic_photo_size_select_actual_black_24dp)
                .error(R.drawable.ic_error_outline_black_24dp)
                .crossFade(300)
                .into((ImageView) findViewById(R.id.img2));


        Glide
                .with(this)
                .load("http://i.kinja-img.com/gawker-media/image/upload/s--B7tUiM5l--/gf2r69yorbdesguga10i.gif")
                .asGif()
                .error(R.drawable.ic_error_outline_black_24dp)
                .into((ImageView) findViewById(R.id.img3));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_refresh) {
            initView();
        }
        return super.onOptionsItemSelected(item);
    }
}
