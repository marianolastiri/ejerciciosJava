import java.util.*;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Profesor> suplentes;
    private List<Alumno> alumnos;
    private List<Float> notas;
    private int cupo;
    private String modalidad;

    public Curso() {}

    public Curso(String nombre, Profesor profesor, int cupo, String modalidad) {
        this.nombre = nombre;
        this.profesor = new Profesor();
        this.cupo = cupo;
        this.modalidad = modalidad;
        this.suplentes = new ArrayList<Profesor>();
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarSuplente(Profesor profesor) {
        suplentes.add(profesor);
    }

    public void setNota(Float nota, int indice) {
        notas.add(indice, nota);
    }


    public Profesor getMejorSuplente() {

        Profesor mejorSuplente = suplentes.get(0);

        for (int i = 0; i < suplentes.size(); i++) {
            if (suplentes.get(i).getTelefono() != "") {
                if (suplentes.get(i).getDistanciaASede() < mejorSuplente.getDistanciaASede()) 
                {
                    mejorSuplente = suplentes.get(i);
                
                } 

                //El problema está en esta condición. Funciona con >= pero no con >
                
                else if (suplentes.get(i).getDistanciaASede() == mejorSuplente.getDistanciaASede() && suplentes.get(i).getEspecialidades().size() > mejorSuplente.getEspecialidades().size()) 
                
                {
                    mejorSuplente = suplentes.get(i);
                }
            }
        }

        return mejorSuplente;
    }

    /** El método agrega un alumo a la lista de alumnos del curso
    * siempre que se cumplan las siguientes condiciones: 
    * 1) el curso es virtual o 
    * 2) es presencial pero no se supera el cupo de inscriptos y 
    * la localidad de residencia del alumno es Posadas.
    * @param alumno de tipo {@link Alumno}
    * @return true si agrega al alumno, false en caso contrario
    */

    public boolean agregarAlumno(Alumno alumno) {
        if ((modalidad.equals("presencial") && (cupo-alumnos.size() > 0) && alumno.getLocalidad().equals("Posadas")) || modalidad.equals("virtual")) {

            alumnos.add(alumno);
            return true;

        }

        return false;
    }
}