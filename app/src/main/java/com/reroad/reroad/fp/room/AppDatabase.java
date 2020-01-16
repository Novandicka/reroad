package com.reroad.reroad.fp.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.reroad.reroad.fp.model.Pengaduan;

@Database(entities = {Pengaduan.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public static AppDatabase db(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class, "reroad")
                .allowMainThreadQueries()
                .build();
    }

    public abstract Pengaduan pengaduanRoom();
}
