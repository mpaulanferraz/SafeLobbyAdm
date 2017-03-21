package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeeGuestServiceController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_guest_service_controller);
    }

    public void onBackPressed() {
        Intent novo = new Intent(SeeGuestServiceController.this, HomeAdmController.class);
        startActivity(novo);
        finish();
    }
}
