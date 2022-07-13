package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Golondrina;

public class GolondrinaTest {

    private Golondrina pepita;
    private String buenosAires;

    @BeforeEach // corre antes de cada test el setUp.
    void setUp() {
        //buenosAires := 'Buenos Aires'.
        buenosAires = "Buenos Aires";
        //golondrina := Golondrina new.
        pepita = new Golondrina(buenosAires);
    }

    @Test
    public void unaGolondrinaNaceCon45JoulesDeEnergia(){
        Assertions.assertEquals(45, pepita.energia());
        // Assert that: pepita energia isEqualTo: 45 "joules".
    }

    @Test
    public void unaGolondrinaNaceEnUnaUbicacion(){
        pepita = new Golondrina(buenosAires);

        Assertions.assertEquals(buenosAires, pepita.ubicacion());
        // Assert that: pepita ubicacion isEqualTo: buenosAires.
    }

    @Test
    public void unaGolondrinaComeUnaCantidadDeGramosPorLoQueAumentaSuEnergia(){
        Integer unaCantidadDeGramos = 1;

        pepita.comer(unaCantidadDeGramos);

        Integer energiaEsperada = 49;
        Assertions.assertEquals(energiaEsperada, pepita.energia());
        // Assert that: pepita energia isEqualTo: 49 "joules".
    }

    @Test
    public void unaGolondrinaVuelaUnosKilometrosPorLoQueGastaEnergia(){
        Integer unosKilometros = 1;

        pepita.volar(unosKilometros);

        Integer energiaEsperada = 34;
        Assertions.assertEquals(energiaEsperada, pepita.energia());
        // Assert that: pepita energia isEqualTo: 34 "joules".
    }
}
