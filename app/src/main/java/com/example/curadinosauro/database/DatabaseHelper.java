// database/DatabaseHelper.java
package com.example.curadinosauro.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "cura_dinossauro.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE players (id INTEGER PRIMARY KEY, name TEXT, experience INTEGER, dinolar INTEGER);");
        db.execSQL("CREATE TABLE dinosaurs (id INTEGER PRIMARY KEY, name TEXT, species TEXT, attack INTEGER, defense INTEGER, vitality INTEGER, isSick INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS players");
        db.execSQL("DROP TABLE IF EXISTS dinosaurs");
        onCreate(db);
    }
}