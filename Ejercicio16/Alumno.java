import java.util.*;

public class Alumno extends Persona {
    private int añoDeIngreso;
    private List<CursoProgramacion> cursadas;

    public Alumno() {}

    public Alumno(String nombre, String apellido, int dni, int añoDeIngreso) {
        super(nombre, apellido, dni);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas = new ArrayList<CursoProgramacion>();
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void addCurso(CursoProgramacion curso) {
        this.cursadas.add(curso);
    }

    @Override
    public String toString() {
        return super.toString() + " " +  this.añoDeIngreso + " " + this.cursadas.size();
    }
}