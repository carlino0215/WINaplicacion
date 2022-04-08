package com.example.winaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RegistroProductoActivity extends AppCompatActivity {

    EditText mCampo;
    ListView mLista;
    ArrayAdapter<String> adapter;

    String categoria[] = {"Tecnologia", "Linea Blanca", "Deporte", "Calzado", "Otro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_producto);

        mCampo = (EditText) findViewById(R.id.campo);
        mLista = (ListView) findViewById(R.id.lista);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, categoria);
        mLista.setAdapter(adapter);
        mCampo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    // metodo para registrar producto
    public  void Anterior(View view){
        Intent anterior = new Intent(this, ProductoActivity.class);
        startActivity(anterior);
    }


}