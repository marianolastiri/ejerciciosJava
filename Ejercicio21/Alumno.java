import java.util.*;

public class Alumno extends Persona {
    private int añoDeIngreso;
    private List<CursoUniversitario> cursadas;

    public Alumno(String nombre, String apellido, int legajo, int añoDeIngreso) {
        super(nombre, apellido, legajo);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas = new ArrayList<CursoUniversitario>();
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void addCurso(CursoUniversitario curso) {
        this.cursadas.add(curso);
    }

    public float getPromedioHoras(String modalidad) {
        int cantidadHoras = 0;
        float cantidadCursos = 0;

        Iterator<CursoUniversitario> it = this.cursadas.iterator();

        while (it.hasNext()) {
            CursoUniversitario curso = it.next();

            if(curso.getModalidad().equals(modalidad)) {
                cantidadHoras += curso.getHorasRequeridas();
                cantidadCursos += 1;
            }
        }

        return cantidadHoras/cantidadCursos;
    }
}