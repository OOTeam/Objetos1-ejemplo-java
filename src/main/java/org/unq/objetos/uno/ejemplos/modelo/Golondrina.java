package org.unq.objetos.uno.ejemplos.modelo;

public class Golondrina extends Ave {

    public Golondrina(String unaUbicacion) {
        super(unaUbicacion);
        this.energia  = 45;
    }

    @Override
    protected Integer energiaRecuperadaPorComer(Integer unaCantidadDeGramos) {
        return unaCantidadDeGramos * 4;
    }

    @Override
    protected Integer energiaDisminuidaPorVolar(Integer unosKilometros) {
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
