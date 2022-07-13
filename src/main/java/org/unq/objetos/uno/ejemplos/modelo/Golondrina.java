package org.unq.objetos.uno.ejemplos.modelo;

public class Golondrina extends Ave {

    public Golondrina(String unaUbicacion) {
        super(unaUbicacion);
        this.energia  = 45;
    }

    @Override
    public void comer(Integer unaCantidadDeGramos) {
        // energia := energia + (unaCantidadDeGramos * 4 "joules").
        energia = energia + energiaRecuperadaPorComer(unaCantidadDeGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeGramos) {
        return unaCantidadDeGramos * 4;
    }

    @Override
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

    @Override
    protected Integer limiteCuandoEstaDebil() {
        return 50;
    }
}
