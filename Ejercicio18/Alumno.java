public class Alumno extends Persona {
    private String localidad;
    private int añoIngreso;

    public Alumno() {}

    public Alumno(String dni, String nombre, String localidad, int añoIngreso) {
        super(dni, nombre);
        this.localidad = localidad;
        this.añoIngreso = añoIngreso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + localidad + ", " + añoIngreso;
    }


}