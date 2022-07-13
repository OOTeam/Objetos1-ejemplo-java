package org.unq.objetos.uno.ejemplos.golondrinas;

public class Golondrina extends Ave implements Cazador {


    public Golondrina() {
        this.energia = 45;
    }


    @Override
    public void volar(Integer unaDistanciaEnKilometros) {
        // energia := energia - (unaDistanciaEnKilometros / kilometer * joule  + self costoFijo)
        energia = energia - energiaResultanteTrasVolar(unaDistanciaEnKilometros);
    }

    private Integer energiaResultanteTrasVolar(Integer unaDistanciaEnKilometros) {
        return unaDistanciaEnKilometros + 10;
    }


    @Override
    protected Integer energiaResultanteTrasComer(Integer unaCantidadDeAlimentoEnGramos) {
        return unaCantidadDeAlimentoEnGramos * 4;
    }

    @Override
    protected Integer limiteDeDebilidad() {
        return 50;
    }

    @Override
    public void cazar(Ave unAve) {

    }

}
