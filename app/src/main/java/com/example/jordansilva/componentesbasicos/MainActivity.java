package com.example.jordansilva.componentesbasicos;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox checkBranco, checkVerde, checkVermelho ;
    List<String> check = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.etNomeProduto);
        resultado = findViewById(R.id.tvResultado);
        checkBranco = findViewById(R.id.checkBranco);
        checkVerde = findViewById(R.id.checkVerde);
        checkVermelho = findViewById(R.id.checkVermelho);
        rgEstoque = findViewById(R.id.rgEstoque);

        verificaRadioButton();
    }

    public void verificaCheck(){
        check.clear();

        if ( checkBranco.isChecked() ) {
            check.add( checkBranco.getText().toString() );
        }

        if ( checkVerde.isChecked() ) {
            check.add( checkVerde.getText().toString() );
        }

        if ( checkVermelho.isChecked() ) {
            check.add( checkVermelho.getText().toString() );
        }

        resultado.setText( check.toString() );

    }


    public void verificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged( RadioGroup group, int checkedId ) {
                if ( checkedId == R.id.radioSim ) {
                    resultado.setText("SIM");

                }else {
                    resultado.setText("NÃO");
                }
            }
        }
        );
    }

    public void btEnviar (View view){
       /* String nomeProduto = campoProduto.getText().toString();
        resultado.setText(nomeProduto); */

       // verificaCheck(); //chamando o método


    }
}
