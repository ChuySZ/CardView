package com.example.android.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.cardview.ui.informacion.InformacionFragment;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, InformacionFragment.newInstance())
                    .commitNow();
        }
    }
}
