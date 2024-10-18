package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class AppTrivial {
    public static void main(String[] args) {
        Pregunta pregunta = new Pregunta().setTipoPregunta(
                TipoPregunta.BOOLEAN).setDificultad(Dificultad.HARD)
                .setPregunta("Pregunta")
                .setCategoria(new Categoria("Categorize")).setCorrecta("Correcta")
                .setIncorrecta(List.of("Incorrecta"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(pregunta));
    }
}
