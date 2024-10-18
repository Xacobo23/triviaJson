package org.example;

import java.util.List;

public class Pregunta {
    private String pregunta;
    private TipoPregunta tipoPregunta;
    private Dificultad dificultad;
    private Categoria categoria;
    private String correcta;
    private List<String> incorrecta;



    public Pregunta(String pregunta, TipoPregunta tipoPregunta, Dificultad dificultad, Categoria categoria) {
        this.pregunta = pregunta;
        this.tipoPregunta = tipoPregunta;
        this.dificultad = dificultad;
        this.categoria = categoria;
    }
    public Pregunta(){}

    public String getPregunta() {
        return pregunta;
    }

    public Pregunta setPregunta(String pregunta) {
        this.pregunta = pregunta;
        return this;
    }

    public TipoPregunta getTipoPregunta() {
        return tipoPregunta;
    }

    public Pregunta setTipoPregunta(TipoPregunta tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
        return this;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public Pregunta setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Pregunta setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public String getCorrecta() {
        return correcta;
    }

    public Pregunta setCorrecta(String correcta) {
        this.correcta = correcta;
        return this;
    }

    public List<String> getIncorrecta() {
        return incorrecta;
    }

    public Pregunta setIncorrecta(List<String> incorrecta) {
        this.incorrecta = incorrecta;
        return this;
    }

    public void addIncorrecta(String incorrecta){
        if (incorrecta == null){
        }
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", tipoPregunta=" + tipoPregunta +
                ", dificultad=" + dificultad +
                ", categoria=" + categoria +
                '}';
    }
}
