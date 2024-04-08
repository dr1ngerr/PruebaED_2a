/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 * Esta clase representa el NIE de las distintas personas que se matriculan al curso
 * @author andreib
 * @version 1.0
 */
public class Nif {
    
    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Metodo que calcula la letra de verificacion a partir del numero del NIF
     * @param numero El numero del NIF a partir del cual se calculara
     * @return La letra correspondiente al numero que se ha proporcionado
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor de la clase NIF que pone el numero a 0 y la letra vacia
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que permite crear un NIF con un numero especifico
     * @param numero Un entero que nos permite calcular la letra del NIF
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Nos muestra el NIF en forma de texto
     * @return Representacion en forma de cadena
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Metodo setter que permite modificar el NIF ya existente
     * La letra se recalcula automaticamente
     * @param numero El nuevo numero
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Metodo que compara NIF con otro objeto
     * @param obj El objeto que se compara
     * @return True o false dependiendo de si los NIF son iguales o no
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}

