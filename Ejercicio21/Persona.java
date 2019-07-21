public class Persona {
    private int legajo;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getLegajo() {
        return legajo;
    }
}