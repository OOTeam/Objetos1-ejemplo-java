package org.unq.objetos.uno.ejemplos.modelo;

public class Gorrion {
    private Integer energia = 100;
    private String ubicacion;

    public Gorrion(String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    public Integer energia() {
        return energia;
    }

    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        energia += energiaRecuperadaPorComer(unaCantidadDeAlimentoEnGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos + unaCantidadDeAlimentoEnGramos * 10;
    }

    public String ubicacion() {
        return ubicacion;
    }

    public void volar(Integer unosKilometros) {
        energia = energia - energiaDisminuidaPorVolar(unosKilometros);
    }

    private Integer energiaDisminuidaPorVolar(Integer unosKilometros) {
        return unosKilometros * 5;
    }
}
