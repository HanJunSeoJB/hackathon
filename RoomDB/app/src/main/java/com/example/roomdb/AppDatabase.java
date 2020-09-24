package com.example.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {flower.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FlowerDao flowerDao();
}
