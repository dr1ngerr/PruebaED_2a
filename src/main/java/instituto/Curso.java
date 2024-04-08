/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package instituto;

import java.util.TreeSet;
/**
 * Clase que representa un curso en el que se matriculan personas
 * @author andreib
 * @version 1.0
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Metodo getter para obtener el nombre del curso
     * @return El nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que permite crear los cursos
     * @param nombre Recibe el nombre que se le va a dar al curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Metodo que muestra una representacion en cadena del objeto Curso
     * @return 
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Metodo para añadir alumnos al curso
     * @param p El alumno que se quiere añadir
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
