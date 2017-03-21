package com.example.mariapaula.safelobbyadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddListUserController extends AppCompatActivity {
    public Button listacondominos;
    public Button addcondomino;

    public void AddGuest() {
        addcondomino = (Button) findViewById(R.id.addcondomino);
        addcondomino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddListUserController.this, AddEditUserController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    public void ListGuest() {
        listacondominos = (Button) findViewById(R.id.listacondominos);
        listacondominos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(AddListUserController.this, UserListController.class);
                startActivity(novo);
                finish();

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_user_controller);
        AddGuest();
        ListGuest();
    }
}
