package org.example;

public enum TipoPregunta {
    MULTIPLE("Multiple"), BOOLEAN("Verdadero/Falso");
    private String tipoPregunta;

    TipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }
}