package com.meirinaldojunior.eporaqui_vactivit.areaTurista;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by meirinaldo on 05/06/16.
 */
public class WebAppInterface extends AppCompatActivity {
    Context mContext;


    WebAppInterface(Context c) {
        mContext = c;
    }


    @JavascriptInterface
    public void AbrirMapa() {

        runOnUiThread(new Runnable() {

            public void run() {

                String packageName = "com.meirinaldojunior.eporaqui_vactivit.areaTurista";
                try {
                    //          mContext.startActivity(new Intent(WebAppInterface.this, areaTurista.class));
                } catch (Exception ex) {
                    //        Toast.makeText(mContext, "invalid activity name: " + areaTurista.class, Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

}

