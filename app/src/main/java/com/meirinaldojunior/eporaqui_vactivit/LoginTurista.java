package com.meirinaldojunior.eporaqui_vactivit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.meirinaldojunior.eporaqui_vactivit.cadastros.Cad_guia;
import com.meirinaldojunior.eporaqui_vactivit.cadastros.Cad_turista;

public class LoginTurista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_turista);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public void chamarCadastroTur(View view){
        startActivity(new Intent(this, Cad_turista.class));
    }

}
