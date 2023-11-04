package ar.edu.AP;

public class Materia {
    private String nombre;
    private double nota;
    private Materia materiaCorrelativa;
    private boolean aprobada;

    public Materia(String nombre, double nota){ //Pensado para crear materias sin correlatividad
        this.nombre = nombre;
        this.nota = nota;
    }
    public Materia(String nombre){ //Pensado para crear materias con correlatividad
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void agregarCorrelativa(Materia materiaBase){ //Permite saber si la materia correlativa está aprobada
        aprobada = (materiaBase.getNota() >= 6);
    }
}

