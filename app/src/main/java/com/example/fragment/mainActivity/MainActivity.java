package com.example.fragment.mainActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment.R;
import com.example.fragment.fragment.Pencarian;
import com.example.fragment.fragment.Profile;
import com.example.fragment.fragment.Home;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnhome, btnpencarian, btnprofile, btnexit;

    Home fragmentHome;
    Pencarian fragmentPencarian;
    Profile fragmentProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhome = findViewById(R.id.btn_home);
        btnpencarian = findViewById(R.id.btn_pencarian);
        btnprofile = findViewById(R.id.btn_profile);
        btnexit = findViewById(R.id.btn_exit);

        btnhome.setOnClickListener(this);
        btnpencarian.setOnClickListener(this);
        btnprofile.setOnClickListener(this);
        btnexit.setOnClickListener(this);
    }

    void menuHome() {
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuPencarian() {
        fragmentPencarian = new Pencarian();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentPencarian);
        ft.commit();
    }

    void menuProfile() {
        fragmentProfile = new Profile();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentProfile);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnhome) {
            menuHome();
        }

        if (v == btnpencarian) {
            menuPencarian();
        }

        if (v == btnprofile) {
            menuProfile();
        }

        if (v == btnexit) {
            menuExit();
        }

    }
}