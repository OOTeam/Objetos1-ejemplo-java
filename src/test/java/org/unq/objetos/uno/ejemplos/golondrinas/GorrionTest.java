package org.unq.objetos.uno.ejemplos.golondrinas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GorrionTest {

    private static final int ENERGIA_INICIAL_DE_UN_GORRION = 100;
    private Gorrion pepon;

    @BeforeEach
    void setUp() {
        pepon = new Gorrion();
    }

    @Test
    public void unGorrionCuandoNaceTiene100JoulesDeEnergia() {
        Assertions.assertEquals(GorrionTest.ENERGIA_INICIAL_DE_UN_GORRION, pepon.energia());
    }

    @Test
    public void unGorrionCuandoComeAumentaMuchoSuEnergia() {
        int unaCantidadDeAlimento = 1;

        pepon.comer(unaCantidadDeAlimento);

        Assertions.assertEquals(GorrionTest.ENERGIA_INICIAL_DE_UN_GORRION + 11, pepon.energia());
    }


    @Test
    public void unGorrionCuandoVuelaDisminuyeMuchoSuEnergia() {
        int unaDistancia = 2;

        pepon.volar(unaDistancia);

        Assertions.assertEquals(GorrionTest.ENERGIA_INICIAL_DE_UN_GORRION - 20, pepon.energia());
    }

    @Test
    public void unGorrionEstaDebil() {
        pepon.volar(1);

        Assertions.assertTrue(pepon.estaDebil());
    }
}
