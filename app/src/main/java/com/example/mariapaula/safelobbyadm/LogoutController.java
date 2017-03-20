package com.example.mariapaula.safelobbyadm;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class LogoutController extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account_controller);



        AlertDialog.Builder dialog = new
                AlertDialog.Builder(this);
        dialog.setMessage("Deseja sair da conta?");
        dialog.setPositiveButton("Sim", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {

                        Intent myIntent = new Intent
                                (LogoutController.this, LoginController.class);
                        LogoutController.this.startActivity(myIntent);

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
}