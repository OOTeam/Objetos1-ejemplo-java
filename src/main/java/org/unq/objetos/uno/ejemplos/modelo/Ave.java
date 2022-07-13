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

    protected abstract Integer energiaRecuperadaPorComer(Integer unaCantidadDeGramos);

    public abstract void volar(Integer unaDistanciaEnKilometros);

    public void comer(Integer unaCantidadDeGramos) {
        // energia := energia + (unaCantidadDeGramos * 4 "joules").
        this.energia = energia + energiaRecuperadaPorComer(unaCantidadDeGramos);
    }

    public boolean estaDebil() {
        return energia() < limiteCuandoEstaDebil();
    }

    protected abstract Integer limiteCuandoEstaDebil();
}
