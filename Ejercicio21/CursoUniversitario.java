import java.util.*;

public class CursoUniversitario {
    private String nombre;
    private int horasRequeridas;
    private List<Alumno> alumnos;
    private List<Float> notas;
    private String modalidad;

    public CursoUniversitario(String nombre, String modalidad, int horas) {
        this.nombre = nombre;
        this.horasRequeridas = horas;
        this.modalidad = modalidad;
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasRequeridas() {
        return horasRequeridas;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public String getModalidad() {
        return modalidad;
    }
}