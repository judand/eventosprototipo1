package com.example.prototipo1.eventosprototipo1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class EventArray {
    List<EventoClass> eventos;

    // public constructor is necessary for collections
    public EventArray() {
        eventos = new ArrayList<EventoClass>();
    }
    public static EventArray parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        EventArray eventos1 = gson.fromJson(response, EventArray.class);
        return eventos1;
    }
}
