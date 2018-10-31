package com.example.alex.photomanagerassessment.database;

import android.arch.persistence.room.RoomDatabase;

public abstract class PicRoomDatabase extends RoomDatabase {

    public abstract PictureDAO mDao();
    private static volatile PicRoomDatabase INSTANCE;
}
