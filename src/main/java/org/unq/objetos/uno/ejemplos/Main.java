package org.unq.objetos.uno.ejemplos;

public class Main {
    public static void main(String[] args) {

        //pepe := Persona new.
        Persona pepe = new Persona("Pepe");

//        pepe renombrar: 'Jose'.
        pepe.renombrar("Jose");

        System.out.println(pepe.nombre());
    }
}