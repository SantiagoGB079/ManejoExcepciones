package com.capacitacion.excepciones;

import com.capacitacion.excepciones.personalizadas.MisExcepciones;
import com.capacitacion.excepciones.procesos.ProcesarDatos;
import com.capacitacion.excepciones.utils.Constantes;

import static com.capacitacion.excepciones.utils.Constantes.*;

public class ExcepcionesApplication {

    public static void main(String[] args) {

        try {
            caso1();
            caso2();
        } catch (MisExcepciones misExcepciones) {
            System.out.println(misExcepciones.getCausa());
            System.out.println(misExcepciones.getTipoFalla());
            misExcepciones.printStackTrace();
        }

        caso3();
        //caso4();
        //caso5();
    }


    public static void caso1() throws MisExcepciones {

        ProcesarDatos procesarDatos = new ProcesarDatos();

        //System.out.println(procesarDatos.division("48", "0"));
        System.out.println(procesarDatos.division("48", "2"));
        //System.out.println(procesarDatos.division("15.8", "30"));
    }

    public static void caso2() throws MisExcepciones {

        ProcesarDatos procesarDatos = new ProcesarDatos();

        String[] array = new String[]{"Muy", "buenos", "días"};
        //procesarDatos.arreglo(array);
    }

    public static void caso3() {

        ProcesarDatos procesarDatos = new ProcesarDatos();
        try {
            procesarDatos.fecha("20201211");
        } catch (Exception e) {
            System.out.println(CAUSA + e.getCause());
            System.out.println(FALLA + e.getMessage());
            e.printStackTrace();
        }
        //// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
        //envie al metodo una fecha con el formato "yyyy/mm/dd".
        //capture e identifique la excepcion que se genera (no la excepcion general de java Exception)
        // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error;
    }

    public static void caso4() {
        //manejo de excepciones personalizadas

    }

    public static void caso5() {
        //manejo de cierre de  objetos en lectura y escritura de arhivos

    }


}
