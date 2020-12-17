package com.example.mybottomnavigationactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private String tag="TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"Activity: onCreate");
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav);
        NavController navController= Navigation.findNavController(this,R.id.fragment);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"Activity: onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"Activity: onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"Activity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"Activity: onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"Activity: onRestart");
    }
}