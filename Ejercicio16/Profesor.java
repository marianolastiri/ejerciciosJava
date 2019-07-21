import java.util.*;

public class Profesor extends Persona {
    private int cantidadHoras;
    private float sueldo;
    private List<CursoProgramacion> cursosDictados;

    public Profesor() {}

    public Profesor(String nombre, String apellido, int dni){
        super(nombre, apellido, dni);
        this.cursosDictados = new ArrayList<CursoProgramacion>();
    }

    public void setCantidadHoras(int horas) {
        this.cantidadHoras = horas;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void addCurso(CursoProgramacion curso) {
        this.cursosDictados.add(curso);
    }

    public List<CursoProgramacion> getCursos(int anteriorAlAño) {

        List<CursoProgramacion> cursosBuscados = new ArrayList<CursoProgramacion>();

      Iterator<CursoProgramacion> it = this.cursosDictados.iterator();

      while (it.hasNext()) {
          CursoProgramacion curso = it.next();

          if (curso.hayAlumnosAnterioresA(anteriorAlAño)) {
                  cursosBuscados.add(curso);             
          }
      }

      return cursosBuscados;

    }
}