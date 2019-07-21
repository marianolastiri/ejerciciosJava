class Main {
  public static void main(String[] args) {
    Profesor p1 = new Profesor("Juan Carlos", "Pérez Loiseau", 12345, 40);

    Curso c1 = new Curso("programación", "virtual", 10);

    p1.addCurso(c1);

    p1.addCurso(c1);

    System.out.println(p1);
  }
}