package com.example.soporte.myapplication.basedatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by soporte on 11/12/2017.
 */

public class DBHelper extends SQLiteOpenHelper{
    public DBHelper(Context CTT){
        super(CTT, "db.db", null ,0);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PERSONAS(id integer primary key autoincrement, nombre text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void add_persona(String nombre){
        try{
            ContentValues CV = new ContentValues();
            CV.put("nombre", nombre);
            getWritableDatabase().insert("PERSONAS", null, CV);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
