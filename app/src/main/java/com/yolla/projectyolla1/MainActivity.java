package com.yolla.projectyolla1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtJKelamin, edtNoHP, edtAlamat, edtProdi, edtFak;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtTampil);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJKelamin = (EditText) findViewById(R.id.edtJKelamin);
        edtNoHP = (EditText) findViewById(R.id.edtNoHP);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtFak = (EditText) findViewById(R.id.edtFak);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJKelamin = edtJKelamin.getText().toString();
                String strNoHP = edtNoHP.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strFak= edtFak.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strJKelamin + "\n" + strNoHP + "\n" + strAlamat + "\n" + strProdi + "\n" + strFak);
            }
        });
    }
}