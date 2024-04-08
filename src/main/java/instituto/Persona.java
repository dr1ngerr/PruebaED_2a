/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
/**
 * La clase persona representa a una persona
 * Implementa la interfaz Comparable para permitir la comparacion entre personas
 * @author andreib
 * @version 1.0
 */
public class Persona implements Comparable<Persona>{
     private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que crea una persona a partir del NIF
     * @param nif Entero que permite crear un NIF
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor con todos los atributos de la persona
     * @param nif Entero que permite crear un NIF
     * @param nombre String para crear el nombre de la persona
     * @param genero Letra (char) para indicar el genero de la persona
     * @param dia Entero del dia que nacio
     * @param mes Entero del mes que nacio
     * @param ano Entero del año que nacio
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una representacion en cadena de la persona
     * @return La representacion en forma de cadena de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Metodo que compara dos personas
     * @param a La persona a comparar
     * @return Si las personas son iguales devuelve true, y false en el caso contrario
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Metodo para comparar dos personas
     * @param obj El objeto a comparar
     * @return Si las personas son iguales devuelve true, y false en el caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Metodo que comprueba si dos personas son iguales
     * @param o La persona con la que se compara
     * @return Un valor negativo si NIF es menor, 0 si son iguales, o positivo si NIF es mayor
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
}
}