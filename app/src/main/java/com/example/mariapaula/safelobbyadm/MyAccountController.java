package com.example.mariapaula.safelobbyadm;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
                showPopup();

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
                finish();

            }
        });

    }

    private void showPopup() {
        AlertDialog.Builder dialog = new
                AlertDialog.Builder(this);
        dialog.setMessage("Deseja sair da conta?");
        dialog.setPositiveButton("Sim", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {

                        Intent myIntent = new Intent
                                (MyAccountController.this, LoginController.class);
                        MyAccountController.this.startActivity(myIntent);
                        finish();
// TODO Auto-generated method stub

                    }
                });

        dialog.setNegativeButton("Não", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {
// TODO Auto-generated method stub

                    }
                });
        dialog.setTitle("Conta");
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account_controller);
        Logout();
        Edit();
    }

    public void onBackPressed() {
        Intent novo = new Intent(MyAccountController.this, HomeAdmController.class);
        startActivity(novo);
        finish();
    }
}
