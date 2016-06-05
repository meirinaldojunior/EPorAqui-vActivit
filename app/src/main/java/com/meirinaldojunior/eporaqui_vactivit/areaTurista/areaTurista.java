package com.meirinaldojunior.eporaqui_vactivit.areaTurista;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.meirinaldojunior.eporaqui_vactivit.R;

public class areaTurista extends AppCompatActivity {


    WebView mWebView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_turista);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Adds Progrss bar Support
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        // Makes Progress bar Visible
        getWindow().setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

        // Get Web view
        mWebView = (WebView) findViewById(R.id.webView); //This is the id you gave
        //to the WebView in the main.xml
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this
        //if ROM supports Multi-Touch
        mWebView.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM

        // Load URL
        mWebView.loadUrl("http://www.firstdroid.com/advertisement.htm");


        // Sets the Chrome Client, and defines the onProgressChanged
        // This makes the Progress bar be updated.
        final Activity MyActivity = this;
        mWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                MyActivity.setTitle("Loading...");
                MyActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                // Return the app name after finish loading
                if (progress == 100)
                    MyActivity.setTitle(R.string.app_name);
            }
        });


    }//End of Method onCreate


}
