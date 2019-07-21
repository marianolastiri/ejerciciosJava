import java.util.*;

class Main {
  public static void main(String[] args) {
    AlumnoIngresante alumno = new AlumnoIngresante("Pepe", "Sánchez", 1234, 1998);

    Curso curso1 = new Curso("programación", "virtual", 5);
    Curso curso2 = new Curso("algoritmos", "virtual", 8);
    Curso curso3 = new Curso("álgebra", "presencial", 10);
    Curso curso4 = new Curso("análisis matemático", "virtual", 12);
    Curso curso5 = new Curso("ipc", "virtual", 4);

    Profesor profesor = new Profesor("Rubén", "Pardo", 148659, 10);

    profesor.addCurso(curso5);

    System.out.println(profesor);

    profesor.addCurso(curso1);

    System.out.println(profesor);
        
    alumno.addCurso(curso1);
    alumno.addCurso(curso2);
    alumno.addCurso(curso3);
    alumno.addCurso(curso4);
    alumno.addCurso(curso5);

    System.out.println(alumno.promedioCursada("virtual"));
    
  }
}