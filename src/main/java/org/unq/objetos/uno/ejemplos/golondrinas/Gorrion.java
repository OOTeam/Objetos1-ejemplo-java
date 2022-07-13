package org.unq.objetos.uno.ejemplos.golondrinas;

public class Gorrion extends Ave {

    public Gorrion() {
        this.energia = 100;
    }

    @Override
    public Integer energia() {
        return energia;
    }

    @Override
    protected Integer energiaResultanteTrasComer(Integer unaCantidadDeAlimentoEnGramos) {
        return (unaCantidadDeAlimentoEnGramos * 10) + unaCantidadDeAlimentoEnGramos;
    }

    @Override
    public void volar(Integer unaDistanciaEnKilometros) {
        this.energia = energia - (unaDistanciaEnKilometros * 10);
    }


    @Override
    protected Integer limiteDeDebilidad() {
        return 100;
    }

}
