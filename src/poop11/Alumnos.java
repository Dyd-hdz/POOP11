/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase Alumons, contiene los atributos y metodos de un alumno
 * @author Luis Hernández
 */
public class Alumnos {
    private String nombre, apeido1, apeido2, edad, promedio;

    /**
     * Constructor vacio
     */
    public Alumnos() {
    }

    /**
     * Constructor lleno
     * @param nombre Nombre del alumno
     * @param apeido1 Apeido paterno del alumno
     * @param apeido2 Apeido maternos del alumno
     * @param edad Edad del alumno
     * @param promedio Promedio del alumno
     */
    public Alumnos(String nombre, String apeido1, String apeido2, String edad, String promedio) {
        this.nombre = nombre;
        this.apeido1 = apeido1;
        this.apeido2 = apeido2;
        this.edad = edad;
        this.promedio = promedio;
    }

    /**
     * Metodo de servicio get, devuelve el nombre del alumno
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de servicio get, devuelve el apeido paterno del alumno
     * @return apeido1
     */
    public String getApeido1() {
        return apeido1;
    }

    /**
     * Metodo de servicio get, devuelve el apeido paterno del alumno
     * @return apeido2
     */
    public String getApeido2() {
        return apeido2;
    }

    /**
     * Metodo de servicio get, devuelve la edad del alumno
     * @return edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Metodo de servicio get, devuelve el promedio del alumno
     * @return 
     */
    public String getPromedio() {
        return promedio;
    }

    /**
     * Metodo de servicio set, modifica el nombre del alumno
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo de servicio set, modifica el apeido paterno del alumno
     * @param apeido1 
     */
    public void setApeido1(String apeido1) {
        this.apeido1 = apeido1;
    }

    /**
     * Metodo de servicio set, modifica el apeido materno del alumno
     * @param apeido2 
     */
    public void setApeido2(String apeido2) {
        this.apeido2 = apeido2;
    }

    /**
     * Metodo de servicio set, modifica la edad del alumno
     * @param edad 
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Metodo de servicio set, modifica el promedio del alumno
     * @param promedio 
     */
    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
    
    /**
     * Metodo sobreescrito toString(), devuelve los atributos del alumno
     * @return 
     */
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apeido1=" + apeido1 + ", apeido2=" + apeido2 + ", edad=" + edad + ", promedio=" + promedio + '}';
    }
}
