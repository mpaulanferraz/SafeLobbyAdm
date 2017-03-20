package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyAccountController extends AppCompatActivity {

    public Button inputSair;
    public Button editarConta;

    public void Logout() {
        inputSair = (Button) findViewById(R.id.inputSair);
        inputSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(MyAccountController.this, LogoutController.class);
                startActivity(novo);

            }
        });

    }

    public void Edit() {
        editarConta = (Button) findViewById(R.id.editarConta);
        editarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(MyAccountController.this, EditMyAccountController.class);
                startActivity(novo);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account_controller);
        Logout();
        Edit();
    }
}
