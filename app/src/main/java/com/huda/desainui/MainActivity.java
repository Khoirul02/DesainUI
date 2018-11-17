package com.huda.desainui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.huda.desainui.presenter.IntentPresenter;

public class MainActivity extends AppCompatActivity {
    //TODO format penamaan variable
    // TODO TypeData namaVariable (dengan syarat cammelCase)
    Button btnIntentExplicit;
    Button btnIntentImplicit;
    IntentPresenter intentPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO menyambungkan antara Java dan xml dengan XML bantuan findViewById
        btnIntentExplicit = findViewById(R.id.btn_intent_explicit);
        btnIntentImplicit = findViewById(R.id.btn_intent_implicit);
        intentPresenter = new IntentPresenter();
        btnIntentExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPresenter.intentExplicit(MainActivity.this);
            }
        });
        btnIntentImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPresenter.intentImplisit(MainActivity.this);
            }
        });

    }
}
