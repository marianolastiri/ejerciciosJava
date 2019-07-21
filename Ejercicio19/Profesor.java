import java.util.*;

public class Profesor extends Persona {
    private List<String> especialidades;
    private int distanciaASede;
    private String telefono;

    public Profesor(String dni, String nombre, int distanciaASede, String telefono) {
        super(dni, nombre);
        this.distanciaASede = distanciaASede;
        this.telefono = telefono;
        this.especialidades = new ArrayList<String>();
    }

    public List<String> getEspecialidades() {
        return this.especialidades;
    }

    public int getDistanciaASede() {
        return this.distanciaASede;
    }

    public void addEspecialidad(String especialidad) {
        this.especialidades.add(especialidad);
    }

    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.telefono + ", " + this.especialidades.size() + ", " + this.distanciaASede;
    }
}