import java.util.*;

public class Cliente {
    private List<Orden> ordenes;
    private String nombre;
    private int dni;

    public Cliente(String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
        ordenes=new ArrayList<Orden>();
    }

    public void addOrden(Orden o) {
        ordenes.add(o);
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
}