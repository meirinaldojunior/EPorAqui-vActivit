package com.meirinaldojunior.eporaqui_vactivit;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        //força a orientação a ficar em paisagem
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void ChamarGuia(View view){

        startActivity(new Intent(this, LoginGuia.class));

    }
    public void ChamarTurista(View view){

        startActivity(new Intent(this, LoginTurista.class));

    }

    public void ChamarSobre(View view) {

        startActivity(new Intent(this, Sobre.class));

    }


}
