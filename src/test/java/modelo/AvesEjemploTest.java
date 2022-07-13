package modelo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Ave;
import org.unq.objetos.uno.ejemplos.modelo.Golondrina;
import org.unq.objetos.uno.ejemplos.modelo.Gorrion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AvesEjemploTest {

    private String unaUbicacion;
    private Gorrion pepon;
    private Golondrina pepita;

    @BeforeEach
    void setUp() {
        unaUbicacion = "BuenosAires";
        pepon = new Gorrion(unaUbicacion);
        pepita = new Golondrina(unaUbicacion);
    }

    /**
     * Jerarquia de collecciones:
     * <p>
     * Collection - define el protocolo estandar para todas las colecciones
     * List <-> OrderedCollection - define protocolo de lista ordenada e indexada
     * Set -> Set - define protocolo de conjuntos
     * Map -> Dictionary - define protocolo de un diccionario clave valor, tambien se conoce como Hash.
     * ETC, son un monton!!!
     * <p>
     * Es muuuuuy raro trabajar solamente con Collection, es muy normal tipar a List, ya que tiene un protocolo mas copado.
     * <p>
     * Hay que tener muchisimo cuidado con los Arrays, son primitivos, dificiles de usar.
     */

    @Test
    public void ejemploColeccionesIsEmpty() {
        // aves := OrderedCollection new.
        List<Ave> aves = new ArrayList<>();

        Assertions.assertThat(aves).isEmpty();
    }

    @Test
    public void ejemploColeccionesSize() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        Assertions.assertThat(aves).hasSize(2);
    }


    @Test
    public void ejemploColeccionesForEach() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        // aves do: [:unAve | unAve comer: 10 "gramos" ].
        aves.forEach((ave) -> ave.comer(10));

        Assertions.assertThat(pepita.energia()).isEqualTo(85);
        Assertions.assertThat(pepon.energia()).isEqualTo(210);
    }
    @Test
    public void ejemploColeccionesIncludes() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        // aves includes: pepita.
        Assertions.assertThat(aves.contains(pepita)).isTrue();
        // aves includes: pepon.
        Assertions.assertThat(aves).contains(pepon);
    }

    @Test
    public void ejemploColeccionesFilter() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        // aves select: [:unAve | unAve estaDebil ].
        List<Ave> avesDebiles = aves.stream().filter((ave) -> ave.estaDebil()).collect(Collectors.toList());

        Assertions.assertThat(avesDebiles).containsExactly(pepita);
    }

    @Test
    public void ejemploColeccionesSum() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        // aves sum: [:unAve | unAve energia ] ifEmpty: [0 "joules"].
        // (aves collect: [:unAve | unAve energia ]) sum.
        int energiaTotal = aves.stream().mapToInt(Ave::energia).sum();

        Assertions.assertThat(energiaTotal).isEqualTo(pepita.energia() + pepon.energia());
    }

    @Test
    public void ejemploColeccionesDetect() {
        // aves := OrderedCollection with: pepita with: pepon.
        List<Ave> aves = List.of(pepita, pepon);

        // aves sum: [:unAve | unAve energia ] ifEmpty: [0 "joules"].
        // (aves collect: [:unAve | unAve energia ]) sum.
        Ave unAveDebil = aves.stream().filter(ave -> ave.estaDebil()).findFirst().get();

        Assertions.assertThat(unAveDebil).isEqualTo(pepita);
    }

}
