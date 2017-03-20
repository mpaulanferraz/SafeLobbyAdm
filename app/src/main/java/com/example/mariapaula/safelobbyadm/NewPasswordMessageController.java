package com.example.mariapaula.safelobbyadm;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class NewPasswordMessageController extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_controller);



        AlertDialog.Builder dialog = new
                AlertDialog.Builder(this);
        dialog.setMessage("Uma nova senha foi enviada para seu email");
        dialog.setPositiveButton("Continuar", new
                DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface di, int arg) {

                        Intent myIntent = new Intent
                                (NewPasswordMessageController.this, LoginController.class);
                        NewPasswordMessageController.this.startActivity(myIntent);

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
}