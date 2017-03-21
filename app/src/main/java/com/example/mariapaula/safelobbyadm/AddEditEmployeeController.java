package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEditEmployeeController extends AppCompatActivity {

    public Button cadastroemp;

    public void RegisterEmployee() {
        cadastroemp = (Button) findViewById(R.id.cadastroemp);
        cadastroemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddEditEmployeeController.this, HomeAdmController.class);
                startActivity(novo);
                finish();

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_employee_controller);
        RegisterEmployee();
    }
}
