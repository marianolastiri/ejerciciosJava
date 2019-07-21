import java.util.*;

public class Alumno extends Persona {
    private int añoDeIngreso;
    private List<Curso> cursadas;

    public Alumno(String nombre, String apellido, int legajo, int añoDeIngreso) {
        super(nombre, apellido, legajo);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas = new ArrayList<Curso>();
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void addCurso(Curso curso) {
        this.cursadas.add(curso);
    }

    public float promedioHorasCursadas(String modalidad) {
        Iterator<Curso> it = this.cursadas.iterator();
        float cantidadMaterias = 0;
        int cantidadHoras = 0;

        while (it.hasNext()) {
            Curso curso = it.next();
            if(modalidad.equals(curso.getModalidad())) {
                cantidadHoras += curso.getHorasRequeridas();
                cantidadMaterias += 1;
            }

            
        } 
        return cantidadHoras/cantidadMaterias;
    }
}