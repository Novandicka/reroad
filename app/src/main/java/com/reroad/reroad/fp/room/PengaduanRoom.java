package com.reroad.reroad.fp.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.reroad.reroad.fp.model.Pengaduan;

import java.util.List;

@Dao
public interface PengaduanRoom {

    @Query("SELECT * FROM pengaduan WHERE id = :id")
    Pengaduan select(int id);

    @Query("SELECT * FROM pengaduan")
    List<Pengaduan> selectAll();

    @Insert
    void insert(Pengaduan pengaduan);

    @Update
    void update(Pengaduan pengaduan);

    @Delete
    void delete(Pengaduan pengaduan);
}
