package org.unq.objetos.uno.ejemplos.golondrinas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GolondrinaTest {


    private Golondrina pepita;

    @BeforeEach // voy a ejecutar este mensaje antes de correr cada test
    public void setUp() {
        // pepita := Golondrina new.
        pepita = new Golondrina();
    }

    @Test
    public void unaGolondrinaCuandoNaceTiene45JoulesDeEnergia() {
        Assertions.assertEquals(45, pepita.energia());
        //Assert that: pepita energia isEqualTo: 45 * joule.
    }

    @Test
    public void unaGolondrinaVuelaUnosKilometros() {
        Integer energiaEsperada = 34;
        Integer unaDistanciaEeKilometros = 1;

        pepita.volar(unaDistanciaEeKilometros);

        Assertions.assertEquals(energiaEsperada, pepita.energia());
    }

    @Test
    public void unaGolondrinaComeUnaCantidadDeAlimentoEnGramos(){
        Integer energiaEsperada = 49;
        Integer unaCantidadDeAlimentoEnGramos = 1;

        pepita.comer(unaCantidadDeAlimentoEnGramos);

        Assertions.assertEquals(energiaEsperada, pepita.energia());
    }
}
