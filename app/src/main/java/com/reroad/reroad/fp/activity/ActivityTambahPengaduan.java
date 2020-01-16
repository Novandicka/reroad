package com.reroad.reroad.fp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.reroad.reroad.fp.R;
import com.reroad.reroad.fp.model.Pengaduan;
import com.reroad.reroad.fp.room.AppDatabase;
import com.reroad.reroad.fp.room.PengaduanRoom;

public class ActivityTambahPengaduan extends AppCompatActivity implements View.OnClickListener {
    EditText edtLokasi;
    EditText edtGambar;
    EditText edtKeterangan;
    Button btnKirim;
    PengaduanRoom room;
    Pengaduan pengaduan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pengaduan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Pengaduan");
        edtLokasi = findViewById(R.id.tambah_pengaduan_Lokasi);
        edtGambar = findViewById(R.id.tambah_pengaduan_gambar);
        edtKeterangan = findViewById(R.id.tambah_pengaduan_keterangan);
        btnKirim = findViewById(R.id.kirim_pengaduan);
        btnKirim.setOnClickListener(this);


        room = AppDatabase.db(this).PengaduanRoom();
        int id = getIntent().getIntExtra("id", 0);
        pengaduan = room.select(id);
        if (pengaduan != null) {
            edtLokasi.setText(pengaduan.getLokasi());
            edtGambar.setText(pengaduan.getGambar());
            edtKeterangan.setText(pengaduan.getKeterangan());

        }else {
            btnKirim.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}