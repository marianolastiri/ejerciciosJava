public class Persona {
    private String nombre;
    private String dni;

    public Persona() {}

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.dni + ", " + this.nombre;
    }
}