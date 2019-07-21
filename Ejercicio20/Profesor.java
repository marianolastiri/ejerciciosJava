import java.util.*;

public class Profesor extends Persona {
    private int horasRestantes;
    private List<Float> salarios;
    private List<Curso> cursosAsignados;

    public Profesor(String nombre, String apellido, int legajo, int horasRestantes) {
        super(nombre, apellido, legajo);
        this.horasRestantes = horasRestantes;
        this.salarios = new ArrayList<Float>();
        this.cursosAsignados = new ArrayList<Curso>();
    }

    public int getCantidadHoras() {
        return horasRestantes;
    }

    /**
    * el método agrega un curso a la lista de cursos 
    * de un profesor siempre y cuando no supere la 
    * cantidad de horas disponibles.
    * @param recibe un parámetro de tipo Curso.
    * @return retorna true en caso de poder completar * la asignación del curso y false en caso 
    * contrario.
    */
    public boolean addCurso(Curso curso) {
        Iterator<Curso> it = this.cursosAsignados.iterator();
        while(it.hasNext()) {
            Curso c1 = it.next();
            if (curso.getNombre().equals(c1.getNombre())) {
                return false;
            }
        }
        if (this.horasRestantes - curso.getHorasRequeridas() > 0) {
            this.cursosAsignados.add(curso);
            this.horasRestantes -= curso.getHorasRequeridas();
            return true;
        }
        return false;
    }

    public List<Float> getSalarios() {
        return salarios;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.horasRestantes + " " + this.cursosAsignados.size();
    }
}