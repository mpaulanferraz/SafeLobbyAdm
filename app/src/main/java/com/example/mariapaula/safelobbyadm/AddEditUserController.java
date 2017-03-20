package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEditUserController extends AppCompatActivity {

    public Button cadastraruser;

    public void RegisterUser() {
        cadastraruser = (Button) findViewById(R.id.cadastraruser);
        cadastraruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddEditUserController.this, HomeAdmController.class);
                startActivity(novo);

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_user_controller);
        RegisterUser();
    }
}
