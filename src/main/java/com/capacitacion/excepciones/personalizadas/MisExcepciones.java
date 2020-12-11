package com.capacitacion.excepciones.personalizadas;

public class MisExcepciones extends Exception {

    private String causa;
    private String tipoFalla;

    public MisExcepciones(String causa, String tipoFalla) {
        this.causa = causa;
        this.tipoFalla = tipoFalla;
    }

    public String getCausa() {
        return causa;
    }

    public String getTipoFalla() {
        return tipoFalla;
    }
}
