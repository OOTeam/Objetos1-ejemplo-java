package org.unq.objetos.uno.ejemplos.modelo;

public class Gorrion {
    private Integer energia = 100;

    public Integer energia() {
        return energia;
    }

    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        energia += energiaRecuperadaPorComer(unaCantidadDeAlimentoEnGramos);
    }

    private Integer energiaRecuperadaPorComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos + unaCantidadDeAlimentoEnGramos * 10;
    }
}
