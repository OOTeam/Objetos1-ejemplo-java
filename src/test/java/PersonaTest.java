import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.Persona;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonaTest {

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void unaPersonaTieneUnNombre(){

        Persona pepe = new Persona("Pepe");

        Assertions.assertEquals("Pepe", pepe.nombre());
//        Assert that: pepe nombre isEqualTo: 'Pepe'
//        pepe.nombre() = "Pepe";
    }

    @Test
    public void trueSiempreSeraTrue() {
        boolean unBooleano = true;
        Assertions.assertTrue(unBooleano);
    }

    @Test
    public void unoMasUnoEsDos() {
        int resultado = 1 + 1;
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void unoNoEsIgualADos() {
        Assertions.assertNotEquals(1, 2);
    }

    @Test
    public void unaColeccionEstaVacia() {
        List<String> palabras = new ArrayList<>();
        palabras.add("Holis");

        assertThat(palabras).hasSize(1);
    }

}
