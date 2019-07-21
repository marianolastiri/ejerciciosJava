public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private float nota;

    public Inscripcion() {

    }

    public void setAlumno(Alumno a) {
        this.alumno = a;
    }

    public void setCurso(Curso c) {
        this.curso = c;
    }

    public void setNota(float n) {
        this.nota = n;
    }

    public float getNota() {
        return nota;
    }
}