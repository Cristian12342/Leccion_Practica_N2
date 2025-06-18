
package com.mycompany.leccion_practica_n2;

/**
 *
 * @author Calavera
 */
public class Leccion_Practica_N2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Vector de Estudiantes
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0]=new Estudiante("Juan","25","Calle El Rancho");
        estudiantes[1]=new Estudiante("Maria","22","Calle La Paz");
        estudiantes[2]=new Estudiante("Pedro","23","Calle El Sol");

       IEstudiante x = new Estudiantes();
       x.imprimirEstudiantes(estudiantes);

    }
}