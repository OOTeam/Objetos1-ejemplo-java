package org.unq.objetos.uno.ejemplos.golondrinas;

public abstract class Ave {

    protected Integer energia;

    public abstract void volar(Integer unaDistanciaEnKilometros);

    public void comer(Integer unaCantidadDeAlimentoEnGramos) {
        // energia := energia + (unaCantidadDeAlimentoEnGramos / gram * 4 * joule).
        energia = energia + energiaResultanteTrasComer(unaCantidadDeAlimentoEnGramos);
    }

    protected abstract Integer energiaResultanteTrasComer(Integer unaCantidadDeAlimentoEnGramos);

    public Integer energia() {
        return energia;
    }

    public boolean estaDebil() {
        return energia < limiteDeDebilidad();
    }

    protected abstract Integer limiteDeDebilidad();
}
