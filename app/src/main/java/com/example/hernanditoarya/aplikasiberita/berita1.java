package com.example.hernanditoarya.aplikasiberita;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class berita1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita1);
    }
    public void backMessage (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
