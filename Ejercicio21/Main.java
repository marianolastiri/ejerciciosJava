import java.util.*;

class Main {
  public static void main(String[] args) {

    CursoUniversitario curso=new CursoUniversitario("Inteligencia Artificial", "Presencial", 3);

    CursoUniversitario curso2 =new CursoUniversitario("Data Science", "Presencial", 25);

    
    Alumno alumno = new Alumno("Juan", "Pérez", 20546, 2019);

    Profesor profe = new Profesor("Rubén", "Pardo", 148659, 30);

    

    System.out.println("Horas disponibles: " + profe.getCantidadHoras());

    profe.addCurso(curso);

    System.out.println("Horas disponibles: " + profe.getCantidadHoras());

    profe.addCurso(curso2);

    System.out.println("Horas disponibles: " + profe.getCantidadHoras());



    alumno.addCurso(curso);

    alumno.addCurso(curso2);

    float a = alumno.getPromedioHoras("Presencial");

    
    System.out.println("Promedio de horas cursadas en la modalidad " + curso.getModalidad() + ", " + a);
  }
}