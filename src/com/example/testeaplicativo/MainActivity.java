package com.example.testeaplicativo;

import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    	super.setIntegerProperty("loadUrlTimeoutValue", 90000);
    	//super.setVolumeControlStream(999999);
        //setContentView(R.layout.activity_main);
    }
}
