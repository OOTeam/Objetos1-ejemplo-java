package org.unq.objetos.uno.ejemplos;

// Persona.java

public class Persona {

    private String nombre;

    public Persona(String unNombre){
        nombre = unNombre;
    }

    public String nombre() {
        // ^ nombre.
        return nombre;
    }

    public void renombrar(String unNombre){
        nombre = unNombre;
    }
}
