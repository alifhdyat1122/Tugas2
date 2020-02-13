package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_sin, btn_cos, btn_tan, btn_secan, btn_cotan, btn_cosec, btn_log;
    private TextView tv_hasil;
    private EditText et_angka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_angka = findViewById(R.id.et_angka);
        tv_hasil = findViewById(R.id.tv_hasil);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_secan = findViewById(R.id.btn_secan);
        btn_cotan = findViewById(R.id.btn_cotan);
        btn_cosec = findViewById(R.id.btn_cosec);
        btn_log = findViewById(R.id.btn_log);

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = Math.sin(Math.toRadians(dAngka));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = Math.cos(Math.toRadians(dAngka));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = Math.tan(Math.toRadians(dAngka));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_secan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = (1 / Math.cos(Math.toRadians(dAngka)));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = (1 / Math.sin(Math.toRadians(dAngka)));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cotan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = (1 / Math.tan(Math.toRadians(dAngka)));
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka = et_angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double hasil = Math.log10(dAngka);
                    String hitung = String.valueOf(hasil);

                    tv_hasil.setText(hitung);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh Kosong!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
