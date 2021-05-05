package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<NhanVien> arrNhanVien = null;
    MyArrayAdapter adapter = null;
    Button btnnhap;
    ImageButton btnRemoveAll;
    EditText txtMa, txtTen;
    RadioGroup genderGrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnhap = findViewById(R.id.btn_nhap);
        btnRemoveAll = findViewById(R.id.btn_xoa);
        txtMa = findViewById(R.id.edit_manv);
        txtTen = findViewById(R.id.edit_tennv);
    }
}