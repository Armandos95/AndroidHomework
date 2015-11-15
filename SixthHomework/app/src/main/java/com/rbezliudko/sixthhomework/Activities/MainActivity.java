package com.rbezliudko.sixthhomework.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.rbezliudko.sixthhomework.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        TextView helloText = (TextView) findViewById(R.id.hello_world_text);

        if (id == R.id.action_blue) {
            helloText.setTextColor(Color.BLUE);
        } else if (id == R.id.action_green) {
            helloText.setTextColor(Color.GREEN);
        } else if (id == R.id.action_red) {
            helloText.setTextColor(Color.RED);
        } else if (id == R.id.action_black) {
            helloText.setTextColor(Color.BLACK);
        }

        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.button_homework1) {
            final Intent firstIntent = new Intent(MainActivity.this, FirstHomeworkActivity.class);
            MainActivity.this.startActivity(firstIntent);
        } else if (id == R.id.button_homework2) {
            final Intent secondIntent = new Intent(MainActivity.this, SecondHomeworkActivity.class);
            MainActivity.this.startActivity(secondIntent);
        } else if (id == R.id.button_homework3) {
            final Intent thirdIntent = new Intent(MainActivity.this, ThirdHomeworkActivity.class);
            MainActivity.this.startActivity(thirdIntent);
        } else if (id == R.id.button_homework4) {
            final Intent fourthIntent = new Intent(MainActivity.this, FourthHomeworkMainActivity.class);
            MainActivity.this.startActivity(fourthIntent);
        } else if (id == R.id.button_homework5) {
            final Intent fifthIntent = new Intent(MainActivity.this, FifthHomeworkActivity.class);
            MainActivity.this.startActivity(fifthIntent);
        } else if (id == R.id.button_homework6) {
            final Intent fourthIntent = new Intent(MainActivity.this, SixthHomeworkMainActivity.class);
            MainActivity.this.startActivity(fourthIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}