public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {}

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    @Override

    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.dni;
    }
}