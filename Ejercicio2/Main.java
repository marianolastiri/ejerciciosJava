import java.util.*;

class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso(7.0f, 15, "programación");
    Alumno alumno1 = new Alumno(123, "Juan", "Pérez", 20);
    Alumno alumno2 = new Alumno(124, "Martín", "Suárez", 19);
    Alumno alumno3 = new Alumno(125, "Mabel", "Gutiérrez", 18);
    Inscripcion inscripcion1 = new Inscripcion();
    Inscripcion inscripcion2 = new Inscripcion();
    Inscripcion inscripcion3 = new Inscripcion();
    
    inscripcion1.setAlumno(alumno1);
    inscripcion2.setAlumno(alumno2);
    inscripcion3.setAlumno(alumno3);

    inscripcion1.setNota(8.5f);
    inscripcion2.setNota(6f);
    inscripcion3.setNota(9.0f);

    curso1.setInscripcion(inscripcion1);
    curso1.setInscripcion(inscripcion2);
    curso1.setInscripcion(inscripcion3);

    int total = curso1.cantidadEstudiantes(curso1);

    int aprobados = curso1.getAlumnosAprobados(curso1);

    System.out.println("Alumnos inscriptos: " + total + "\nCantidad de alumnos aprobados: " + aprobados);

    
  }
}