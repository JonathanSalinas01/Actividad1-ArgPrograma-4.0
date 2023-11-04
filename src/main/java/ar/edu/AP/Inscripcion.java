package ar.edu.AP;

public class Inscripcion {
    Alumno alumno;
    Materia materia;


    public boolean inscripcion(Alumno alumno, Materia materia){
        if(materia.isAprobada()){
            this.alumno = alumno;
            this.materia = materia;
            return true;
        }else{
            return false;
        }

    }
}
