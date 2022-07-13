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

    public abstract void volar(Integer unaDistanciaEnKilometros);

    public abstract void comer(Integer unaCantidadDeAlimentoEnGramos);

    public boolean estaDebil() {
        return energia() < limiteCuandoEstaDebil();
    }

    protected abstract Integer limiteCuandoEstaDebil();
}
