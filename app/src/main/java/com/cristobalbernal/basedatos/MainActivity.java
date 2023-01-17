package com.cristobalbernal.basedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.cristobalbernal.basedatos.Models.User;

import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = null;
        try {
            user = new User(1,"nombre","12345");
            Log.e(getClass().getSimpleName(),user.getPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }





    }
}