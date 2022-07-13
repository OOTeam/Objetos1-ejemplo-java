package org.unq.objetos.uno.ejemplos.modelo;

public class Golondrina {
    private Integer energia = 45;
    private String ubicacion;

    public Golondrina(String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    public Integer energia() {
        return energia;
    }

    public void comer(Integer unaCantidadDeGramos) {
        // energia := energia + (unaCantidadDeGramos * 4 "joules").
        energia = energia + energiaRecuperadaPorComer(unaCantidadDeGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeGramos) {
        return unaCantidadDeGramos * 4;
    }

    public void volar(Integer unosKilometros) {
        // energia := energia - (unosKilometros + 10 "joules de costo fijo").
        energia = energia - energiaDisminuidaPorVolar(unosKilometros);
    }

    private Integer energiaDisminuidaPorVolar(Integer unosKilometros) {
        return unosKilometros + costoFijoPorVolar();
    }

    private Integer costoFijoPorVolar() {
        return 10;
    }

    public String ubicacion() {
        return ubicacion;
    }
}
