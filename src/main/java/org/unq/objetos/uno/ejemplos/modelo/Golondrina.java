package org.unq.objetos.uno.ejemplos.modelo;

public class Golondrina {
    private Integer energia = 45;

    public Integer energia() {
        return energia;
    }

    public void comer(Integer unaCantidadDeGramos) {
        // energia := energia + (unaCantidadDeGramos * 4 "joules").
        energia = energia + (unaCantidadDeGramos * 4);
    }

    public void volar(Integer unosKilometros) {
        // energia := energia - (unosKilometros + 10 "joules de costo fijo").
        energia = energia - (unosKilometros + 10);
    }
}
