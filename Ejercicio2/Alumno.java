public class Alumno {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean equals(Alumno a) {
        return this.dni == a.getDni() && this.nombre.equals(a.getNombre()) && this.apellido.equals(a.getApellido()) && this.edad == a.getEdad();
    }
}