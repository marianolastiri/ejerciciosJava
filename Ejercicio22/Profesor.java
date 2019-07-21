import java.util.*;

public class Profesor extends Persona {

    private int horasRestantes;
    private List<Float> salarios;
    private List<Curso> cursosAsignados;

    public Profesor(String nombre, String apellido, int legajo, int horasRestantes) {
        super(nombre, apellido, legajo);
        this.horasRestantes = horasRestantes;
        salarios = new ArrayList<Float>();
        cursosAsignados = new ArrayList<Curso>();
    }

    public int getCantidadHoras() {
        return horasRestantes;
    }

    /**
    * El método addCurso agrega un curso a la lista de * cursos que dicta un profesor siempre y cuando la * carga horaria del curso no exceda la cantidad de * horas semanales disponibles para ese profesor. 
    * 
    * @param curso tipo Curso
    * @return true si agrega el curso, false en caso 
    * contrario
    */

    public boolean addCurso(Curso curso) {

        if (horasRestantes - curso.getHorasRequeridas() > 0) {
            this.cursosAsignados.add(curso);
            horasRestantes -= curso.getHorasRequeridas();
            return true;
        }

        return false;
    }

    public List<Float> getSalarios() {
        return salarios;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ this.horasRestantes+" "+ this.cursosAsignados.size();
    }
}