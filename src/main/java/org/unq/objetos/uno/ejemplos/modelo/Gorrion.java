package org.unq.objetos.uno.ejemplos.modelo;

public class Gorrion extends Ave {
    private Integer energia = 100;
    private String ubicacion;

    public Gorrion(String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    @Override
    public Integer energia() {
        return energia;
    }

    @Override
    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        energia += energiaRecuperadaPorComer(unaCantidadDeAlimentoEnGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos + unaCantidadDeAlimentoEnGramos * 10;
    }

    public String ubicacion() {
        return ubicacion;
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
