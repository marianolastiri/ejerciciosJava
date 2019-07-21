import java.util.*;

public class Profesor extends Persona {
    private int horasRestantes;
    private List<Float> salarios;
    private List<CursoUniversitario> cursosAsignados;

    public Profesor(String nombre, String apellido, int legajo, int horasRestantes) {
        super(nombre, apellido, legajo);
        this.horasRestantes = horasRestantes;
        this.salarios = new ArrayList<Float>();
        this.cursosAsignados = new ArrayList<CursoUniversitario>();
    }

    public int getCantidadHoras() {
        return horasRestantes;
    }

    /** El método agrega un curso a la lista de cursos * dictados por un determinado profesor siempre y 
    * cuando la carga de horas requeridas para el 
    * dictado de la materia no supere las horas 
    * restantes semanales de que dispone el docente.
    * @param recibe un parámetro de tipo 
    * CursoUniversitario
    * @return si se cumplen las condiciones indicadas, 
    * retorna true. En caso contrario, retorna false.
    */

    public boolean addCurso(CursoUniversitario curso) {

        if (this.horasRestantes - curso.getHorasRequeridas() > 0) {
            this.cursosAsignados.add(curso);
            horasRestantes -= curso.getHorasRequeridas();
            return true;
        }

        return false;
    }

    public List<Float> getSalarios() {
        return salarios;
    }
}