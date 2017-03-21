package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InfoAppController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_app_controller);
    }

    public void onBackPressed() {
        Intent novo = new Intent(InfoAppController.this, HomeAdmController.class);
        startActivity(novo);
        finish();
    }
}
