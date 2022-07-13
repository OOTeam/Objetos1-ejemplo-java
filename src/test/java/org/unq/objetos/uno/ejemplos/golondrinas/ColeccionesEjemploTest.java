package org.unq.objetos.uno.ejemplos.golondrinas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesEjemploTest {

    private Golondrina pepita;
    private Golondrina pepon;
    private List<Golondrina> aves;

    @BeforeEach
    void setUp() {
        pepita = new Golondrina();
        pepon = new Golondrina();
        pepon.comer(100);
        aves = new ArrayList<>();
        aves.add(pepita);
        aves.add(pepon);

    }

    @Test
    public void ejemploCollecciones() {
        // Set new.
        // {} "un array"

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Chau");
        palabras.add("a");
        palabras.remove("a");

        Assertions.assertEquals(2, palabras.size());
        Assertions.assertTrue(palabras.contains("Hola"));
        Assertions.assertFalse(palabras.isEmpty());
    }


    @Test
    public void ejemploCollecciones2() {
        List<Golondrina> aves = new ArrayList<>();
        aves.add(pepita);
        aves.add(pepon);

        // aves sum: [:unAve | unAve energia] ifEmpty: [0].
        // aves sum: #energia ifEmpty: [0].
        // (aves collect: [:unAve | unAve energia]) sum.
        Integer energiaTotal = aves.stream()
                .mapToInt((Golondrina golondrina) -> golondrina.energia())
                .sum();

        Assertions.assertEquals(490, energiaTotal);
    }

    @Test
    public void ejemploColleccionesSelect() {
        // aves select: [:unAve | unAve estaDebil] .
        List<Golondrina> avesDebiles = aves.stream()
                .filter((Golondrina unaGolondrina) -> unaGolondrina.estaDebil())
                .toList();

        Assertions.assertEquals(1, avesDebiles.size());
    }


    @Test
    public void ejemploColleccionesDetect() {
        // aves detect: [:unAve | unAve estaDebil] ifNone: [self error].
        Golondrina golondrinaDebil = aves.stream()
                .filter((Golondrina unaGolondrina) -> unaGolondrina.estaDebil())
                .findFirst()
                .orElseThrow();

        Assertions.assertEquals(pepita, golondrinaDebil);
    }

    @Test
    public void ejemploColleccionesAnySatisfy() {
        // aves anySatisfy: [:unAve | unAve estaDebil] .
        Boolean existeUnaGolondrinaDebil = aves.stream().anyMatch(golondrina -> golondrina.estaDebil());

        Assertions.assertTrue(existeUnaGolondrinaDebil);
    }

    @Test
    public void whileEjemplo() {
        // (pepita estaDebil) while: [ pepita comer: 1].
        int contarCuantesVecesComio = 0;
        while (pepita.estaDebil()) {
            pepita.comer(1);
            contarCuantesVecesComio++;
        }

        Assertions.assertEquals(2, contarCuantesVecesComio);
    }

}
