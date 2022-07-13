package modelo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unq.objetos.uno.ejemplos.modelo.Ave;
import org.unq.objetos.uno.ejemplos.modelo.Golondrina;
import org.unq.objetos.uno.ejemplos.modelo.Gorrion;

import java.util.ArrayList;
import java.util.List;

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

        // { pepon . pepita } do: [:unAve | unAve comer: 10 "gramos" ].
        aves.forEach((ave) -> ave.comer(10));

        Assertions.assertThat(pepita.energia()).isEqualTo(85);
        Assertions.assertThat(pepon.energia()).isEqualTo(210);
    }

}
