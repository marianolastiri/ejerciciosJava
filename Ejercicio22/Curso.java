import java.util.*;

public class Curso {
    private String nombre;
    private int horasRequeridas;
    private List<AlumnoIngresante> alumnos;
    private List<Float> notas;
    private String modalidad;

    public Curso(String nombre, String modalidad, int horas) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.horasRequeridas = horas;
        this.alumnos = new ArrayList<AlumnoIngresante>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getHorasRequeridas() {
        return this.horasRequeridas;
    }

    public String getModalidad() {
        return this.modalidad;
    }

    public void addAlumno(AlumnoIngresante alumno) {
        this.alumnos.add(alumno);
    }
}