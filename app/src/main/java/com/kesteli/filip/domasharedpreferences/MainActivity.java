package com.kesteli.filip.domasharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    private static Context contextOfApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contextOfApplication = getApplicationContext();

        sharedpreferences = getSharedPreferences(POJO.KEY_MOJ_SHARED_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();

        String ime_tima = "Ime tima lalala";
        int brojIgraca = 141;
        editor.putString(POJO.KEY_IME_TIMA, ime_tima);
        editor.putInt(POJO.KEY_BROJ_CLANOVA, brojIgraca);
        editor.commit();// commit is important here.
        Log.d("kakaka", sharedpreferences.getString(POJO.KEY_IME_TIMA, "poc"));
        Log.d("tititi", "" + sharedpreferences.getInt(POJO.KEY_BROJ_CLANOVA, 0));

        ProbnaKlasa probnaKlasa = new ProbnaKlasa();
        probnaKlasa.createSharedPreferences();
    }

    public static Context getContextOfApplication(){
        return contextOfApplication;
    }
}
