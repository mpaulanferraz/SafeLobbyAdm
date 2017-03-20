package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordController extends AppCompatActivity {

    public Button esqueceu_senha;

    public void ForgotPassword() {
        esqueceu_senha = (Button) findViewById(R.id.esqueceu_senha);
        esqueceu_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(ForgotPasswordController.this, NewPasswordMessageController.class);
                startActivity(novo);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_controller);
        ForgotPassword();
    }
}
