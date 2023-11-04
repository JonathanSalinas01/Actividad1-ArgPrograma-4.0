package ar.edu.AP;

public class Gestion {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Jonathan Salinas");
        Materia lenguaje1 = new Materia("Lenguaje 1", 8);
        Materia lenguaje2 = new Materia("Lenguaje 2");
        Inscripcion inscripcion = new Inscripcion();
        lenguaje2.agregarCorrelativa(lenguaje1);

        System.out.println(inscripcion.inscripcion(alumno1, lenguaje2));

        if(inscripcion.inscripcion(alumno1, lenguaje2)){
            System.out.println("Registro exítoso...");
            System.out.println("Alumno: " + alumno1.getNombre());
            System.out.println("Materia:" + lenguaje2.getNombre());
        }else{
            System.out.println("No se pudo inscribir, no cuenta con los requisitos");
        }

    }
}
