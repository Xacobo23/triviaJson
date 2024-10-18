package org.example;

import java.util.List;

public class PreguntaMultiple extends Pregunta{

    private String respuesta;
    private List<String> respuestasIncorrectas;

    public PreguntaMultiple(String pregunta, TipoPregunta tipoPregunta, Dificultad dificultad, Categoria categoria, String respuesta) {
        super(pregunta, tipoPregunta, dificultad, categoria);
        this.respuesta = respuesta;
    }

    public String isRespuesta() {
        return  respuesta;
    }

    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }


}
