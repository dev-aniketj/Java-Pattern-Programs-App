package com.aniketjain.patternprogramsinjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.Task;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    private final ArrayList<SelectionModel> arrayList = new ArrayList<>();
    private DrawerLayout drawerLayout;

    boolean doubleBackToExitPressedOnce = false;

    //for checking the app version, if the version is old then it will show the pop-up update message to the user.
    private AppUpdateManager appUpdateManager;
    private final int PATTERN_PROGRAMS_IN_JAVA_APP_UPDATE_REQ_CODE = 1008;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        //for checking update.
        PopUpAppUpdate();

        //FindViews
        RecyclerView selection_recyclerView = findViewById(R.id.selection_recycler);
        drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        NavigationView nav = findViewById(R.id.nav);

        //Main Toolbar set support
        setSupportActionBar(toolbar);

     /*   //Drawer Layout Sync
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        //set nav icon color as white
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white_90));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //set toolbar nav btn click
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        //default set checked
        nav.setCheckedItem(R.id.home);
        //set navigation
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                Uri uri;
                switch (item.getItemId()) {
                    case R.id.pattern1:
                        intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                        intent.putExtra("heading", "Star Pattern Programs")
                                .putExtra("value", 1);
                        startActivity(intent);
                        break;
                    case R.id.pattern2:
                        intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                        intent.putExtra("heading", "Number Pattern Programs")
                                .putExtra("value", 2);
                        startActivity(intent);
                        break;
                    case R.id.pattern3:
                        intent = new Intent(SelectionActivity.this, QuestionsActivity.class);
                        intent.putExtra("heading", "Alphabet Pattern Programs")
                                .putExtra("value", 3);
                        startActivity(intent);
                        break;
                    case R.id.share:
                        intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        String shareBody = "I'm using " + getString(R.string.app_name) + " App for creating amazing java patterns, try this App.\nDownload link - https://play.google.com/store/apps/details?id=" + getPackageName();
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
                        uri = Uri.parse("https://play.google.com/store/search?q=pub%3AAniket%20Jain&c=apps");
                        intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

      */
        //Adding Selection Array Elements
        add_arrayElements();

        //Set RecyclerView
        SelectionAdapter adapter = new SelectionAdapter(this, arrayList);
        selection_recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        selection_recyclerView.setAdapter(adapter);


    }

    private void add_arrayElements() {
        arrayList.add(new SelectionModel(1, "Star Pattern Programs"));
        arrayList.add(new SelectionModel(2, "Number Pattern Programs"));
        arrayList.add(new SelectionModel(3, "Alphabet Pattern Programs"));
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if (item.getItemId() == R.id.share) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "I'm using " + getString(R.string.app_name) + " App for creating amazing java patterns, try this App.\nDownload link - https://play.google.com/store/apps/details?id=" + getPackageName();
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

    private void PopUpAppUpdate() {
        appUpdateManager = AppUpdateManagerFactory.create(this);

        // Returns an intent object that you use to check for an update.
        Task<AppUpdateInfo> appUpdateInfoTask = appUpdateManager.getAppUpdateInfo();

        // Checks that the platform will allow the specified type of update.
        appUpdateInfoTask.addOnSuccessListener(appUpdateInfo -> {
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
                    // This example applies an immediate update. To apply a flexible update
                    // instead, pass in AppUpdateType.IMMEDIATE
                    && appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {
                // Request the update.
                try {
                    appUpdateManager.startUpdateFlowForResult(appUpdateInfo, AppUpdateType.IMMEDIATE, SelectionActivity.this, PATTERN_PROGRAMS_IN_JAVA_APP_UPDATE_REQ_CODE);
                } catch (IntentSender.SendIntentException exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
}