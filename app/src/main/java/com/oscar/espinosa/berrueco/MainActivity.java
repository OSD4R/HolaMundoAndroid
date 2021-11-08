package com.oscar.espinosa.berrueco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(new view.OnClickListener() {
            @Override
            public void onClic(View v) {
                abrirSuma()
            }
        });
    }
    private void abrirSuma()

    private Object packageContext;
    Intent intent = new Intent(packageContext: this , SumaActivity.class  );
    startActivity (intent) ;
}