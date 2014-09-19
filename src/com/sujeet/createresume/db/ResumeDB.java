package com.sujeet.createresume.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ResumeDB extends SQLiteOpenHelper {

  public static final String TABLE_NAME = "resume_db";
  public static final String TYPE = "type";
  public static final String START_DATE = "start_date";
  public static final String END_DATE = "end_date";
  public static final String OTHER_INFO = "other_info";
  public static final String ID = "id";
  private static final int DATABASE_VERSION = 1;

  private static final String DATABASE_NAME = "resume_table";


  public ResumeDB(Context context, String name, CursorFactory factory, int version) {
    super(context, name, factory, version);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {

    
//    String CREATE_TABLE =
//        "CREATE TABLE " + COLOR_TABLE + "(" + KEY_ID + " INTEGER PRIMARY KEY," + COLOR_ONE
//            + " TEXT," + COLOR_TWO + " TEXT," + COLOR_THREE + " TEXT," + COLOR_FOUR + " TEXT,"
//            + COLOR_FIVE + " TEXT," + KEY_POSITION + " INTEGER" + ")";

    
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

  }


}
