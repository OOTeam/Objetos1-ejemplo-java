package org.unq.objetos.uno.ejemplos;

import org.unq.objetos.uno.ejemplos.golondrinas.Ave;

public class Main {
    public static void main(String[] args) {

        //pepe := Persona new.
        Persona pepe = new Persona("Pepe");

//        pepe renombrar: 'Jose'.
        pepe.renombrar("Jose");

        System.out.println(pepe.nombre());
    }
}