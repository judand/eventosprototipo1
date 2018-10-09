package com.example.prototipo1.eventosprototipo1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        Gson gson =new Gson();
        //EventoClass evento2=gson.fromJson(json,EventoClass.class);
        JSONResourceReader reader = new JSONResourceReader(getResources(),R.raw.document);
        String w=reader.getJsonString();
        EventoClass evento2=gson.fromJson(w,EventoClass.class);
        //carga imagen
        Picasso.get()
                .load(evento2.getImagen())
                .into((ImageView) findViewById(R.id.imageView));
        //carganombre
        TextView texto1 = (TextView) findViewById(R.id.textView);
        texto1.setText(evento2.getNombre());
        //cargalugar
        TextView texto3 = (TextView) findViewById(R.id.textView3);
        texto3.setText(evento2.getLugar());
        //cargaciudad
        TextView texto4 = (TextView) findViewById(R.id.textView2);
        texto4.setText(evento2.getCiudad());





    }



    public void Click(View view) {
        Intent i = new Intent(MainActivity.this, DescripcionActivity.class);
        startActivity(i);


    }


    }








