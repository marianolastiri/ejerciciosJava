import java.util.*;

class Main {
  public static void main(String[] args) {

      Profesor p1 = new Profesor("0", "Zulma", 10, "111");
    

    Profesor p2 = new Profesor("1", "Ana", 10, "112");
    Profesor p3 = new Profesor("2", "Beatriz", 10, "");
    Profesor p4 = new Profesor("3", "Clara", 15, "114");
    Profesor p5 = new Profesor("4", "Diana", 10, "115");
    Profesor p6 = new Profesor("5", "Esther", 22, "116");

    Curso algebra = new Curso("álgebra", p1, 10, "presencial");

    algebra.agregarSuplente(p2);
    algebra.agregarSuplente(p3);
    algebra.agregarSuplente(p4);
    algebra.agregarSuplente(p5);
    algebra.agregarSuplente(p6);
    
    p2.addEspecialidad("análisis");
    p5.addEspecialidad("álgebra");
    p5.addEspecialidad("física");

    Profesor suplente = algebra.getMejorSuplente();
    
    System.out.println("\nEspecialidades Ana = " + p2.getEspecialidades().size());
    System.out.println("\nDistancia Ana = " + p2.getDistanciaASede());
    
    System.out.println("\nEspecialidades Diana = " + p5.getEspecialidades().size());
    System.out.println("\nDistancia Diana = " + p5.getDistanciaASede());

    System.out.println("\nEl mejor suplente es " + suplente);
  }
}