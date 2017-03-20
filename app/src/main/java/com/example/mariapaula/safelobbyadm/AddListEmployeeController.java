package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddListEmployeeController extends AppCompatActivity {

    public Button listafuncionarios;
    public Button addfuncionario;

    public void AddEmployee() {
        addfuncionario = (Button) findViewById(R.id.addfuncionario);
        addfuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddListEmployeeController.this, AddEditEmployeeController.class);
                startActivity(novo);

            }
        });

    }


    public void ListEmployee() {
        listafuncionarios = (Button) findViewById(R.id.listafuncionarios);
        listafuncionarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddListEmployeeController.this, EmployeeListController.class);
                startActivity(novo);

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_employee_controller);
        AddEmployee();
        ListEmployee();
    }
}
