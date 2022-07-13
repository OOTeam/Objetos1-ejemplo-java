package org.unq.objetos.uno.ejemplos.golondrinas;

public interface Cazador {

    default void cazar(Ave ave) {
        ave.volar(100);
    }
}
