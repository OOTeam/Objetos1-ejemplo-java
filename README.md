# Objetos1-ejemplo-java


## Setupeando el pom.xml
El archivo `pom.xml` sirve para estructurar el projecto de java, 
poder declarar dependencias, 
la version de java, 
el compilador que usara maven para luego generar el archivo .jar 
entre muchas otras mas cosas.


## Estructura clasica de projecto java

Por lo general dentro de la carpeta `src` existen `main` y `test`.
Tanto en `main` como en `test` ambos tienen usualmente dos carpetas, `resources` y `java` donde en el primero se guardan algunos archivos que puedan ser necesarios, y el segundo el codigo fuente en si mismo.
En el caso de `test` el codigo fuente son los tests, estos no se compilaran en una version productiva.

```
pom.xml
src
    main
        java
            org/unq/objetos/uno/ejemplo/
                ClaseJavaEjemplo.java
        resources
            archivo1.txt
    test
        java
            org/unq/objetos/uno/ejemplo/
                ClaseJavaEjemploTest.java
        resources
            archivoDeTesting.txt
```