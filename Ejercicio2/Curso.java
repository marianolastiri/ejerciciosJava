import java.util.*;
public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion> inscripciones;

    public Curso(float nota, int cupo, String nombre) {
        this.notaAprobacion = nota;
        this.cupo = cupo;
        this.nombreCurso = nombre;
        this.inscripciones = new ArrayList<Inscripcion>();
    }

    public void setNombreCurso(String n) {
        this.nombreCurso = n;
    }

    public int getCupo() {
        return cupo;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripciones.add(inscripcion);
    }

    public int getAlumnosAprobados(Curso curso) {
        Iterator<Inscripcion> it = this.inscripciones.iterator();
        int cantidadAprobados = 0;

        while(it.hasNext()) {
            Inscripcion incripto = it.next();
            if(incripto.getNota() >= this.notaAprobacion) {
                cantidadAprobados += 1;
            }
        }
        return cantidadAprobados;
    }

    public int cantidadEstudiantes(Curso curso) {
        int cantidad = curso.inscripciones.size();
        return cantidad;
    }
}