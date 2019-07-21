import java.util.*;

public class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

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
        return this.legajo;
    }

    @Override
    public String toString() {
        return this.nombre+" "+ this.apellido+" "+ this.legajo;
    }
}