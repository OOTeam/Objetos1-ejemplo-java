package org.unq.objetos.uno.ejemplos.golondrinas;

public class Golondrina {


    private Integer energia = 45;

    public Integer energia() {
        return energia;
    }

    public void volar(Integer unaDistanciaEnKilometros) {
        // energia := energia - (unaDistanciaEnKilometros / kilometer * joule  + self costoFijo)
        energia = energia - energiaResultanteTrasVolar(unaDistanciaEnKilometros);
    }

    private Integer energiaResultanteTrasVolar(Integer unaDistanciaEnKilometros) {
        return unaDistanciaEnKilometros + 10;
    }

    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        // energia := energia + (unaCantidadDeAlimentoEnGramos / gram * 4 * joule).
        energia = energia + energiaResultanteTrasComer(unaCantidadDeAlimentoEnGramos);
    }

    private int energiaResultanteTrasComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos * 4;
    }


    public boolean estaDebil() {
        return energia < 50;
    }
}
