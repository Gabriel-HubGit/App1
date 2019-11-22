package com.example.aula1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;
    EditText primeiroNome, segundoNome, telefone, email;
    Button limpar, salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeiroNome = findViewById(R.id.primeiroNome);
        segundoNome = findViewById(R.id.segundoNome);
        telefone = findViewById(R.id.telefone);
        email = findViewById(R.id.email);

        limpar = findViewById(R.id.limpar);
        salvar = findViewById(R.id.salvar);

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primeiroNome.setText("");
                segundoNome.setText("");
                telefone.setText("");
                email.setText("");
            }
        });

         salvar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(),"Primeiro nome: "+primeiroNome.getText(),Toast.LENGTH_LONG).show();
                 Toast.makeText(getApplicationContext(),"Segundo nome: "+segundoNome.getText(),Toast.LENGTH_LONG).show();
                 Toast.makeText(getApplicationContext(),"Telefone: "+telefone.getText(),Toast.LENGTH_LONG).show();
                 Toast.makeText(getApplicationContext(),"Email: "+email.getText(),Toast.LENGTH_LONG).show();
             }
         });
    }
}
