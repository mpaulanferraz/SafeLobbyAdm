package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseAddEditController extends AppCompatActivity {

    public Button condomino;
    public Button funcionario;


    public void Guest() {
        condomino = (Button) findViewById(R.id.condomino);
        condomino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(ChooseAddEditController.this, AddListUserController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    public void Employee() {
        funcionario = (Button) findViewById(R.id.funcionario);
        funcionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(ChooseAddEditController.this, AddListEmployeeController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_add_edit_controller);
        Guest();
        Employee();

    }

    public void onBackPressed() {
        Intent novo = new Intent(ChooseAddEditController.this, HomeAdmController.class);
        startActivity(novo);
        finish();
    }
}
