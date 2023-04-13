package it.avoltapg.jukeboxalessio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int numero = bundle.getInit(key "Numero")
        Log.d(TAG, "Numero passato: " + numero)
    }

    Button Button1= findViewById(R.id.button1);

    public void Button1( View view){
        Intent intent= new Intent(getApplicationContext(), MainActivity2.class);
        MainActivity2.putExtra();
        startActivity(MainActivity2);


    }



} final String TAG;
        Button Button1;
@Override