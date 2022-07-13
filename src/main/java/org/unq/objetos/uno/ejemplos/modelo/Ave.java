package org.unq.objetos.uno.ejemplos.modelo;

public abstract class Ave {

    protected Integer energia;
    protected String ubicacion;

    public Ave(String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    public Integer energia() {
        return energia;
    }

    public String ubicacion() {
        return ubicacion;
    }

    public void comer(Integer unaCantidadDeGramos) {
        // energia := energia + (unaCantidadDeGramos * 4 "joules").
        this.energia = energia + energiaRecuperadaPorComer(unaCantidadDeGramos);
    }

    protected abstract Integer energiaRecuperadaPorComer(Integer unaCantidadDeGramos);

    public void volar(Integer unosKilometros) {
        // energia := energia - (unosKilometros + 10 "joules de costo fijo").
        energia = energia - energiaDisminuidaPorVolar(unosKilometros);
    }

    protected abstract Integer energiaDisminuidaPorVolar(Integer unosKilometros);

    public boolean estaDebil() {
        return energia() < limiteCuandoEstaDebil();
    }

    protected abstract Integer limiteCuandoEstaDebil();
}
