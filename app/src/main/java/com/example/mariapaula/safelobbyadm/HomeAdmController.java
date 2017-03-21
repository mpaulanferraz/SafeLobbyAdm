package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAdmController extends AppCompatActivity {

    public Button minhaConta;
    public Button meusHistoricos;
    public Button requisitarVS;
    public Button adicionar;
    public Button logo;

    public void MyAccount() {
        minhaConta = (Button) findViewById(R.id.minhaConta);
        minhaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeAdmController.this, MyAccountController.class);
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
                Intent novo = new Intent(HomeAdmController.this, HistoryController.class);
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
                Intent novo = new Intent(HomeAdmController.this, SeeGuestServiceController.class);
                startActivity(novo);
                finish();

            }
        });

    }


    public void Add() {
        adicionar = (Button) findViewById(R.id.adicionar);
        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(HomeAdmController.this, ChooseAddEditController.class);
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
                Intent novo = new Intent(HomeAdmController.this, InfoAppController.class);
                startActivity(novo);
                finish();

            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_adm_controller);
        MyAccount();
        MyHistoric();
        RequestVS();
        Add();
        Info();
    }

}
