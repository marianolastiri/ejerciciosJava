import java.util.*;

public class AlumnoIngresante extends Persona {
    private int añoDeIngreso;
    private List<Curso> cursadas;

    public AlumnoIngresante(String nombre, String apellido, int legajo, int añoDeIngreso) {
        super(nombre, apellido, legajo);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas = new ArrayList<Curso>();
    }

    public int getAñoDeIngreso() {
        return this.añoDeIngreso;
    }

    public void addCurso(Curso curso) {
        this.cursadas.add(curso);
    }

    public float promedioCursada(String modalidad) {
        int totalHoras = 0;
        float materiasModalidadRequerida = 0f;

        Iterator<Curso> it = this.cursadas.iterator();

        while(it.hasNext()) {
            Curso curso = it.next();
            if (curso.getModalidad().equals(modalidad)) {
                totalHoras += curso.getHorasRequeridas();
                materiasModalidadRequerida += 1;
            }
        }

        return totalHoras/materiasModalidadRequerida;
    }
}