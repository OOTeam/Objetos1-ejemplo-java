package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Gorrion;

public class GorrionTest {


    private static final Integer ENERGIA_INICIAL_DE_LOS_GORRIONES = 100;
    private Gorrion pepon;
    private String buenosAires;

    @BeforeEach
    void setUp() {
        buenosAires = "BuenosAires";
        pepon = new Gorrion(buenosAires);
    }

    @Test
    public void unGorrionNaceCon100JoulesDeEnergia() {
        Assertions.assertEquals(ENERGIA_INICIAL_DE_LOS_GORRIONES, pepon.energia());
        // Assert that: pepon energia isEqualTo: 100 "joules".
    }

    @Test
    public void unGorrionNaceEnUnaUbicacion() {
        Assertions.assertEquals(buenosAires, pepon.ubicacion());
        // Assert that: pepon ubicacion isEqualTo: buenosAires.
    }

    @Test
    public void unGorrionCuandoComeAlimentoAumentaMuchisimoSuEnergia() {
        int energiaEsperada = ENERGIA_INICIAL_DE_LOS_GORRIONES + 22;
        int unaCantidadDeAlimentoEnGramos = 2;

        pepon.comer(unaCantidadDeAlimentoEnGramos);

        Assertions.assertEquals(energiaEsperada, pepon.energia());
        // Assert that: pepon energia isEqualTo: 122 "joules".
    }

    @Test
    public void unGorrionVuelaUnosKilometrosPorLoQueGastaEnergia() {
        Integer unosKilometros = 2;

        pepon.volar(unosKilometros);

        Integer energiaEsperada = ENERGIA_INICIAL_DE_LOS_GORRIONES - 10;
        Assertions.assertEquals(energiaEsperada, pepon.energia());
        // Assert that: pepon energia isEqualTo: 90 "joules".
    }

    @Test
    public void unGorrionConPocaEnergiaEstaDebil() {
        pepon.volar(1);

        Assertions.assertTrue(pepon.estaDebil());
        // Assert isTrue: pepon estaDebil.
    }

    @Test
    public void unGorrionConMuchaEnergiaNoEstaDebil() {
        Integer unaCantidadDeGramos = 100;

        pepon.comer(unaCantidadDeGramos);

        Assertions.assertFalse(pepon.estaDebil());
        // Assert isFalse: pepon estaDebil.
    }
}
