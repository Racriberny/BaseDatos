package com.cristobalbernal.basedatos.bb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserSQLLite extends SQLiteOpenHelper {
    private static UserSQLLite instance;
    private static final String DB_NAME = "users.db";
    private static final int DB_VERSION = 1;
    private static final String SQLCREATE = "CREATE TABLE user(INTEGER id PRIMARY KEY,username TEXT NOT NULL,password TEXT NOLL NULL";

    private UserSQLLite(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    public static synchronized UserSQLLite getInstance(Context context) {
        if (instance == null){
            instance = new UserSQLLite(context);
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLCREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
