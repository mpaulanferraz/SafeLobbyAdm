package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginController extends AppCompatActivity {

    public Button btn_login;
    public Button esqueceusenha;

    // vai depender do login, ou vai para adm ou porteiro
    public void Login() {
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(LoginController.this, HomeAdmController.class);
                startActivity(novo);
                finish();
            }
        });

    }

    public void ForgotPassword() {
        esqueceusenha = (Button) findViewById(R.id.esqueceusenha);
        esqueceusenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(LoginController.this, ForgotPasswordController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_controller);
        Login();
        ForgotPassword();
    }
}
