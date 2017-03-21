package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeEmployeeController extends AppCompatActivity {

    public Button minhaConta;
    public Button meusHistoricos;
    public Button requisitarVS;
    private Button logo;

    public void MyAccount() {
        minhaConta = (Button) findViewById(R.id.minhaConta);
        minhaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeEmployeeController.this, MyAccountController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    public void MyHistoric() {
        meusHistoricos = (Button) findViewById(R.id.meusHistoricos);
        meusHistoricos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeEmployeeController.this, HistoryController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    public void RequestVS() {
        requisitarVS = (Button) findViewById(R.id.requisitarVS);
        requisitarVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeEmployeeController.this, SeeGuestServiceController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    public void Info() {
        logo = (Button) findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeEmployeeController.this, InfoAppController.class);
                startActivity(novo);
                finish();

            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_employee_controller);
        MyAccount();
        MyHistoric();
        RequestVS();
        Info();
    }
}
