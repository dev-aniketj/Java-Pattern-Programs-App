package com.aniketjain.patternprogramsinjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class SelectionActivity extends AppCompatActivity {

    private final ArrayList<SelectionModel> arrayList = new ArrayList<>();
    private DrawerLayout drawerLayout;

    boolean doubleBackToExitPressedOnce = false;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        // FindViews
        RecyclerView selection_recyclerView = findViewById(R.id.selection_recycler);
        drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        NavigationView nav = findViewById(R.id.nav);

        // Main Toolbar set support
        setSupportActionBar(toolbar);

        // Drawer Layout Sync
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        // set nav icon color as white
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white_90));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // set toolbar nav btn click
        toolbar.setNavigationOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));

        // default set checked
        nav.setCheckedItem(R.id.home);
        // set navigation
        nav.setNavigationItemSelectedListener(item -> {
            Intent intent;
            Uri uri;
            switch (item.getItemId()) {
                case R.id.pattern1:
                    intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                    intent.putExtra("heading", "Star Pattern Programs").putExtra("value", 1);
                    startActivity(intent);
                    break;
                case R.id.pattern2:
                    intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                    intent.putExtra("heading", "Number Pattern Programs").putExtra("value", 2);
                    startActivity(intent);
                    break;
                case R.id.pattern3:
                    intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                    intent.putExtra("heading", "Alphabet Pattern Programs").putExtra("value", 3);
                    startActivity(intent);
                    break;
                case R.id.share:
                    intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String shareBody = "I'm using " + getString(R.string.app_name) + " App for creating amazing java patterns, try this App.\nDownload link - https://play.google.com/store/apps/details?id=" + getPackageName() + "\nMore Apps : https://play.google.com/store/apps/dev?id=8788999160422104385";
                    String shareSubject = String.valueOf(R.string.app_name);
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    intent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                    startActivity(Intent.createChooser(intent, "Share using"));
                    break;
                case R.id.rate_us:
                    uri = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                    intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    break;
                case R.id.more_apps:
                    uri = Uri.parse("https://play.google.com/store/apps/dev?id=8788999160422104385");
                    intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });

        // Adding Selection Array Elements
        add_arrayElements();

        // Set RecyclerView
        SelectionAdapter adapter = new SelectionAdapter(this, arrayList);
        selection_recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        selection_recyclerView.setAdapter(adapter);

    }

    private void add_arrayElements() {
        arrayList.add(new SelectionModel(1, "Star Pattern Programs"));
        arrayList.add(new SelectionModel(2, "Number Pattern Programs"));
        arrayList.add(new SelectionModel(3, "Alphabet Pattern Programs"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if (item.getItemId() == R.id.share) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "I'm using " + getString(R.string.app_name) + " App for creating amazing java patterns, try this App.\nDownload link - https://play.google.com/store/apps/details?id=" + getPackageName() + "\nMore Apps : https://play.google.com/store/apps/dev?id=8788999160422104385";
            String shareSubject = String.valueOf(R.string.app_name);
            intent.putExtra(Intent.EXTRA_TEXT, shareBody);
            intent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
            startActivity(Intent.createChooser(intent, "Share using"));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        drawerLayout.closeDrawer(GravityCompat.START);
        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return;
        }

        doubleBackToExitPressedOnce = true;
        new Handler(Looper.getMainLooper()).postDelayed(() -> doubleBackToExitPressedOnce = false, 2000);
    }
}