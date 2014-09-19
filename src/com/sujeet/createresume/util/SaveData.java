package com.sujeet.createresume.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class SaveData {

  Context context;

  public SaveData(Context context) {
    this.context = context;
  }

  public void setData(String key, String value) {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    Editor editor = sharedPreferences.edit();
    editor.putString(key, value);
    editor.commit();
  }

  public String getData(String key) {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    return sharedPreferences.getString(key, "");
  }
}
