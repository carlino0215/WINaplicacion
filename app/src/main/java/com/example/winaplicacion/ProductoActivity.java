package com.example.winaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
    }

    // metodo para el boton volver
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    // metodo para registrar producto
    public  void registrarProducto(View view){
        Intent registrar = new Intent(this, RegistroProductoActivity.class);
        startActivity(registrar);
    }
}