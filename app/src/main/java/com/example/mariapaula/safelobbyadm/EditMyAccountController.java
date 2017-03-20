package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditMyAccountController extends AppCompatActivity {

    public Button confirmar;


    public void Confirm() {
        confirmar = (Button) findViewById(R.id.confirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(EditMyAccountController.this, MyAccountController.class);
                startActivity(novo);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_my_account_controller);
        Confirm();
    }
}
