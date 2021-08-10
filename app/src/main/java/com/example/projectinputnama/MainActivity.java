package com.example.projectinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi class
    EditText TxtNama;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //panggil variable
      TxtNama = (EditText)  findViewById(R.id.txtNama);
      hasil = (EditText) findViewById(R.id.textMasukkanNamaAnda);

      public void TampilNama (View v){
          hasil.setText("Nama Anda: "TxtNama.getText());
        }


    }

}