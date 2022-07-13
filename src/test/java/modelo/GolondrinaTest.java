package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Golondrina;

public class GolondrinaTest {

    @Test
    public void unaGolondrinaNaceCon45JoulesDeEnergia(){
        //golondrina := Golondrina new.
        Golondrina pepita = new Golondrina();

        Assertions.assertEquals(45, pepita.energia());
        // Assert that: pepita energia isEqualTo: 45 "joules".
    }
}
