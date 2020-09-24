package com.example.roomdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class flower {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;

    public flower(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return title;
    }
}
