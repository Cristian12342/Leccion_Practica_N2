package com.mycompany.leccion_practica_n2;



public class Estudiantes implements IEstudiante {


public Estudiante agregarEstudiante() {
        
        return null; 
}

public void imprimirEstudiantes(Estudiante[] estudiantes) {
    for(int i= 0; i<estudiantes.length;i++){

        System.out.println("Nombre;"+ estudiantes[i].getNombre());
        System.out.println("Edad;"+ estudiantes[i].getEdad());
        System.out.println("Direccion;"+ estudiantes[i].getDireccion());

    }
}
}