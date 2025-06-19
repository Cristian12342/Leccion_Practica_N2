
package com.mycompany.leccion_practica_n2;

/**
 *
 * @author Calavera
 */
public class Leccion_Practica_N2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Vector de Estudiantes

        Estudiante estudiantesUno = new Estudiante("Juan", "25", "Calle El Rancho");
        Estudiante estudiantesDos = new Estudiante("Maria", "22", "Calle La Paz");
        Estudiante estudiantesTres = new Estudiante("Pedro", "23", "Calle El Sol");

       IEstudiante estudiantes = new Estudiantes(3);
       
        //Agregando estudiantes
        estudiantes.agregarEstudiante(estudiantesUno);
        estudiantes.agregarEstudiante(estudiantesDos);
        estudiantes.agregarEstudiante(estudiantesTres); 

        //Imprimir estudiantes
       estudiantes.imprimirDatos();
        System.out.println("Datos Actualizados");
        //Actualizando un estudiante
        Estudiante estudiantesCuatro = new Estudiante("Ana", "24", "Calle La Luna");
        estudiantes.actualizarEstudiante(1, estudiantesCuatro);
        //Imprimir estudiantes actualizados
        estudiantes.imprimirDatos();
         
    }
}