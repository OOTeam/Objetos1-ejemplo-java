package org.unq.objetos.uno.ejemplos.modelo;

public abstract class Ave {

    public abstract void volar(Integer unaDistanciaEnKilometros);

    public abstract void comer(Integer unaCantidadDeAlimentoEnGramos);

    public boolean estaDebil() {
        return energia() < limiteCuandoEstaDebil();
    }

    public abstract Integer energia();

    protected abstract Integer limiteCuandoEstaDebil();
}
