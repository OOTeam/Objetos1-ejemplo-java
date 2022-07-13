package org.unq.objetos.uno.ejemplos.modelo;

public class Gorrion extends Ave {

    public Gorrion(String unaUbicacion) {
        super(unaUbicacion);
        this.energia = 100;
    }

    @Override
    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        energia += energiaRecuperadaPorComer(unaCantidadDeAlimentoEnGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos + unaCantidadDeAlimentoEnGramos * 10;
    }

    @Override
    public void volar(Integer unosKilometros) {
        energia = energia - energiaDisminuidaPorVolar(unosKilometros);
    }

    private Integer energiaDisminuidaPorVolar(Integer unosKilometros) {
        return unosKilometros * 5;
    }

    @Override
    protected Integer limiteCuandoEstaDebil() {
        return 100;
    }
}
