package com.mj7addadcoder.alwiqayah;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static ImageButton imageButton_one;
    private static ImageButton imageButton_two;
    private static ImageButton imageButton_three;
    private static ImageButton imageButton_four;
    private static ImageButton imageButton_five;
    private static ImageButton imageButton_six;
    private static ImageButton imageButton_seven;
    private static ImageButton imageButton_eight;
    private static ImageButton imageButton_nine;
    private static ImageButton imageButton_ten;
    private static ImageButton imageButton_eleven;
    private static ImageButton imageButton_twelve;
    private static ImageButton imageButton_thirteen;
    private static ImageButton imageButton_forteen;


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

        OnClickButtonListener();


    }

    public void OnClickButtonListener(){
        imageButton_one = (ImageButton)findViewById(R.id.imageButton);
        imageButton_two = (ImageButton) findViewById(R.id.imageButton2);
        imageButton_three = (ImageButton) findViewById(R.id.imageButton3);
        imageButton_four = (ImageButton) findViewById(R.id.imageButton4);
        imageButton_five = (ImageButton) findViewById(R.id.imageButton5);
        imageButton_six = (ImageButton) findViewById(R.id.imageButton6);
        imageButton_seven = (ImageButton) findViewById(R.id.imageButton7);
        imageButton_eight = (ImageButton) findViewById(R.id.imageButton8);
        imageButton_nine = (ImageButton) findViewById(R.id.imageButton9);
        imageButton_ten = (ImageButton) findViewById(R.id.imageButton10);
        imageButton_eleven = (ImageButton) findViewById(R.id.imageButton11);
        imageButton_twelve = (ImageButton) findViewById(R.id.imageButton12);
        imageButton_thirteen = (ImageButton) findViewById(R.id.imageButton13);
        imageButton_forteen = (ImageButton) findViewById(R.id.imageButton14);

        imageButton_one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 1;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 2;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 3;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 4;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 5;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 6;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 7;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 8;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 9;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_ten.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 10;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_eleven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 11;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_twelve.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 12;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_thirteen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 13;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );
        imageButton_forteen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = 14;
                        Intent intent = new Intent("com.mj7addadcoder.alwiqayah.OneActivity");
                        intent.putExtra("num",num);
                        startActivity(intent);
                    }
                }
        );

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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            // Handle the camera action
        } else if (id == R.id.nav_hamed) {

        } else if (id == R.id.nav_alawi) {

        } else if (id == R.id.nav_coder) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_rate) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
