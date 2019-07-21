import java.util.*;

class Main {
  public static void main(String[] args) {
    Profesor profesor = new Profesor("30.000.001", "profesor", 100, "+54 (0375) 123456789");
    Seminario c1 = new Seminario("400 Metros Crol", profesor, 2, "virtual");
    Seminario c2 = new Seminario("Seminario Básico Natación", profesor, 3, "presencial");
    Seminario c3 = new Seminario("Waterpolo", profesor, 1, "presencial");
    Asistente a1 = new Asistente("12.345.671", "Juan", "Mendoza");
    Asistente a2 = new Asistente("12.345.672", "Mirta", "San Martín");
    Asistente a3 = new Asistente("12.345.673", "María", "Mendoza");
    c1.agregarAsistente(a1);
    c1.agregarAsistente(a2);
    c1.agregarAsistente(a3);

    c2.agregarAsistente(a1);
    c2.agregarAsistente(a2);
    c2.agregarAsistente(a3);

    c3.agregarAsistente(a1);
    c3.agregarAsistente(a2);
    c3.agregarAsistente(a3);

    System.out.println(c1.getAsistentes().size());
    System.out.println(c2.getAsistentes().size());
    System.out.println(c3.getAsistentes().size());
  }
}