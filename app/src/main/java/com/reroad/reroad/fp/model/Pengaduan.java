package com.reroad.reroad.fp.model;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Pengaduan {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "lokasi")
    private String lokasi;

    @ColumnInfo(name = "gambar")
    private String gambar;

    @ColumnInfo(name = "keterangan")
    private String keterangan;

    @ColumnInfo(name = "tanggal")
    private String tanggal;

    @ColumnInfo(name = "jam")
    private String jam;

    public Pengaduan() {
    }

    @Ignore
    public Pengaduan(String lokasi, String gambar, String keterangan, String tanggal, String jam) {
        this.lokasi = lokasi;
        this.gambar = gambar;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
        this.jam = jam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}