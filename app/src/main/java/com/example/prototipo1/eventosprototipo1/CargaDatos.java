package com.example.prototipo1.eventosprototipo1;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class CargaDatos {
    public EventoClass activity;
    public DescripcionActivity ac;

    public CargaDatos(EventoClass activity) {

        this.activity = activity;

    }

    public CargaDatos() {

    }


    public View getView(View convertView) {
        // SE GENERA UN CONVERTVIEW POR MOTIVOS DE EFICIENCIA DE MEMORIA
        //ES UN NIVEL MAS BAJO DE VISTA, PARA QUE OCUPEN MENOS MEMORIA LAS

        View v = convertView;
        //ASOCIAMOS LA VISTA AL LAYOUT DEL RECURSO XML DONDE ESTA LA BASE DE

        if(convertView == null){
            Activity a;
            LayoutInflater inf = (LayoutInflater) ac.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.descrip_layout, null);
        }


        //RELLENAMOS LA IMAGEN
        Picasso.get()
                .load(activity.getImagen())
                .into((ImageView) v.findViewById(R.id.imageView3));




        //CAMPOS
        TextView id = (TextView) v.findViewById(R.id.textView9);
        id.setText("ID : "+ activity.getNombre());
        TextView nombre = (TextView) v.findViewById(R.id.textView10);
        nombre.setText("NOMBRE : "+ activity.getNombre());
        TextView pais = (TextView) v.findViewById(R.id.textView11);
        pais.setText("PAIS : "+activity.getPais());
        TextView ciudad = (TextView) v.findViewById(R.id.textView12);
        ciudad.setText("CIUDAD : "+activity.getCiudad());

        TextView lugar = (TextView) v.findViewById(R.id.textView13);
        lugar.setText("LUGAR : "+activity.getLugar());

        TextView categoria = (TextView) v.findViewById(R.id.textView14);
        categoria.setText("CATEGORIA : "+activity.getCategoria());

        TextView descrip = (TextView) v.findViewById(R.id.textView15);
        descrip.setText("DESCRIPCION : "+activity.getDescripcion());


        // DEVOLVEMOS VISTA
        return v;
    }

}
