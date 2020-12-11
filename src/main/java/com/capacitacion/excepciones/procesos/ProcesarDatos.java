package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.personalizadas.MisExcepciones;
import com.capacitacion.excepciones.utils.Constantes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.capacitacion.excepciones.utils.Constantes.*;

public class ProcesarDatos {

    public int division(String numero1, String numero2) throws MisExcepciones {
        int resultado = 0;

        try {
            resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);
            return resultado;
        } catch (ArithmeticException e) {
            throw new MisExcepciones(CAUSA + e.getCause(), FALLA + e.getMessage());
        } catch (NumberFormatException e) {
            throw new MisExcepciones(CAUSA + e.getCause(), FALLA + e.getMessage());
        }
    }


    public void arreglo(String[] lista) throws MisExcepciones {

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(lista[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MisExcepciones(CAUSA + e.getCause(),
                    FALLA + "El arreglo es de " + e.getMessage() + " posiciones");
        }


    }

    public void fecha(String input) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = format.parse(input);
            date.toString();
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }
}
