package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Gorrion;

public class GorrionTest {


    private static final Integer ENERGIA_INICIAL_DE_LOS_GORRIONES = 100;
    private Gorrion pepon;

    @BeforeEach
    void setUp() {
        pepon = new Gorrion();
    }

    @Test
    public void unGorrionNaceCon100JoulesDeEnergia() {
        Gorrion pepon = new Gorrion();

        Assertions.assertEquals(ENERGIA_INICIAL_DE_LOS_GORRIONES, pepon.energia());
        // Assert that: pepon energia isEqualTo: 100 "joules".
    }

    @Test
    public void unGorrionCuandoComeAlimentoAumentaMuchisimoSuEnergia() {
        int energiaEsperada = ENERGIA_INICIAL_DE_LOS_GORRIONES + 22;
        int unaCantidadDeAlimentoEnGramos = 2;

        pepon.comer(unaCantidadDeAlimentoEnGramos);

        Assertions.assertEquals(energiaEsperada, pepon.energia());
        // Assert that: pepon energia isEqualTo: 122 "joules".
    }
}
