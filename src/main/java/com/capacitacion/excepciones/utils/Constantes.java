package com.capacitacion.excepciones.utils;

public class Constantes {

    public static final String CAUSA = "La Causa: ";
    public static final String FALLA = "La Falla: ";
    public static final String RUTA = "src/main/java/com/capacitacion/excepciones/datos/data.txt";
    public static final String RUTA2 = "src/main/java/com/capacitacion/excepciones/datos/data2.txt";
    public static final String MENU = "\nDigite una opcion \n" +
            "0. Salir\n" +
            "1. Caso 1 \n" +
            "2. Caso 2 \n" +
            "3. Caso 3 \n" +
            "4. Caso 4 \n" +
            "5. Caso 5 \n";

    private Constantes() {
        throw new IllegalStateException("Utility class");
    }
}
