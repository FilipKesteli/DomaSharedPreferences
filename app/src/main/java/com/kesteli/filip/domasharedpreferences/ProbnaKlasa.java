package com.kesteli.filip.domasharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Valemate on 26.8.2017..
 */

public class ProbnaKlasa {

    SharedPreferences sharedpreferences;

    public void createSharedPreferences() {
        Context applicationContext = MainActivity.getContextOfApplication();
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        String atmosfera = "atmosfera";
        editor.putString(POJO.KEY_IME_TIMA, atmosfera);
        editor.commit();// commit is important here.

        Log.d("karora", sharedpreferences.getString(POJO.KEY_MOJ_SHARED_PREFERENCES, ""));
    }

}
