package com.example.databaseexam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MemoDbHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "Memo.db";
    private static final String SQL_CREARE_ENTRIES =
            String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %S  TEXT, %S TEXT",
                   Memo.MemoEntey.TABLE_NAME,
                    Memo.MemoEntey._ID,
                    Memo.MemoEntey.COLUM_NAME_TITLE,
                    Memo.MemoEntey.COLUM_NAME_CONTENTS);

    public MemoDbHelper(@Nullable Context context) {

        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREARE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

// 폐기처분
