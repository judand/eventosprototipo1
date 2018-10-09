package com.example.prototipo1.eventosprototipo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class DescripcionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrip_layout);
        setTitle("Descripcion");
        Gson gson =new Gson();
        EventoClass evento1= new EventoClass("201","soy","colombia","bucaramanga","agora","pequeño","diversion","1","http://thr2y3lcnnh2ths9v2z7pw0h.wpengine.netdna-cdn.com/wp-content/uploads/2017/03/clasica_0-810x539.jpg");

        //EventoClass evento2=gson.fromJson(json,EventoClass.class);
        JSONResourceReader reader = new JSONResourceReader(getResources(),R.raw.document);
        String w=reader.getJsonString();
        EventoClass evento2=gson.fromJson(w,EventoClass.class);
        Log.i("hola",evento2.getCategoria());
        //cargaID
        TextView texto = (TextView) findViewById(R.id.textView9);
        texto.setText(evento2.getId());
        //carga imagen
        Picasso.get()
                .load(evento2.getImagen())
                .into((ImageView) findViewById(R.id.imageView3));
        //carganombre
        TextView texto1 = (TextView) findViewById(R.id.textView10);
        texto1.setText(evento2.getNombre());
        //cargapais
        TextView texto3 = (TextView) findViewById(R.id.textView11);
        texto3.setText(evento2.getPais());
        //cargaciudad
        TextView texto4 = (TextView) findViewById(R.id.textView12);
        texto4.setText(evento2.getCiudad());
        //cargalugar
        TextView texto5 = (TextView) findViewById(R.id.textView13);
        texto5.setText(evento2.getLugar());
        //cargacategoria
        TextView texto6 = (TextView) findViewById(R.id.textView14);
        texto6.setText(evento2.getCategoria());
        //cargadescripcion
        TextView texto7 = (TextView) findViewById(R.id.textView15);
        texto7.setText(evento2.getDescripcion());

    }
}
