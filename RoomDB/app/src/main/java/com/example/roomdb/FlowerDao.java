package com.example.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FlowerDao {
    @Query("SELECT * FROM flower")
    List<flower> getAll();

   @Insert
    void insert(flower flower);
   @Update
    void update(flower flower);
   @Delete
    void delete(flower flower);
}

