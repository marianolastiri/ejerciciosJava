
public class Asistente extends Persona {
    private String localidad;

    public Asistente(String dni, String nombre, String localidad) {
        super(dni, nombre);
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +  this.localidad;
    }
}