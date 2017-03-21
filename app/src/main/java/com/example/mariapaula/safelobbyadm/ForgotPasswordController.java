package com.example.mariapaula.safelobbyadm;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
//                Intent novo = new Intent(ForgotPasswordController.this, NewPasswordMessageController.class);
//                startActivity(novo);
//                finish();
                showPopup();

            }
        });

    }

    private void showPopup() {
        AlertDialog.Builder dialog = new
                AlertDialog.Builder(this);
        dialog.setMessage("Uma nova senha foi enviada para seu email");
        dialog.setPositiveButton("Continuar", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {

                        Intent myIntent = new Intent
                                (ForgotPasswordController.this, LoginController.class);
                        ForgotPasswordController.this.startActivity(myIntent);
                        finish();

// TODO Auto-generated method stub

                    }
                });

        dialog.setNegativeButton("", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {
// TODO Auto-generated method stub

                    }
                });
        dialog.setTitle("Esqueceu a senha");
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_controller);
        ForgotPassword();
    }
}
