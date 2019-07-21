import java.util.*;

public class CursoProgramacion {
    private String nombre;
    private int maximoAlumnos;
    private List<Alumno> alumnos;
    private List<Float> notas;

    public CursoProgramacion() {}

    public CursoProgramacion(String nombre, int maximoAlumnos) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }

    /** 
    * El método solo debe agregar al alumno a la lista 
    * alumnos si aun no se supero el número máximo del 
    * curso. 
    * En caso de cumplirse esta condición, el método 
    * además deberá agregar el curso en la lista 
    * cursos del alumno inscripto.
    * @param nuevoAlumno el alumno a inscribir. 
    * @return Retorna true si agrega al alumno. 
    * En caso contrario retornará false.
    */

    public boolean agregarAlumno(Alumno nuevoAlumno) {

        if (this.alumnos.size() < this.maximoAlumnos) {

            this.alumnos.add(nuevoAlumno);
            nuevoAlumno.addCurso(this);
            return true;
        }

        return false;
        
    }

    

    public boolean hayAlumnosAnterioresA(int año) {

        Iterator<Alumno> it = this.alumnos.iterator();

        while (it.hasNext()) {
            Alumno alumno = it.next();

            if (alumno.getAñoDeIngreso() < año) {
                return true;
            }            
        }

        return false;
    }
}