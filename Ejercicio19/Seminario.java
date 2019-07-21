import java.util.*;

public class Seminario {
    private String nombre;
    private Profesor profesor;
    private List<Profesor> suplentes;
    private List<Asistente> asistentes;
    private List<Float> notas;
    private int cupo;
    private String modalidad;

    public Seminario(String nombre, Profesor profesor, int cupo, String modalidad) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.suplentes = new ArrayList<Profesor>();
        this.cupo = cupo;
        this.modalidad = modalidad;
        this.asistentes = new ArrayList<Asistente>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public List<Asistente> getAsistentes() {
        return this.asistentes;
    }

    public void agregarSuplente(Profesor suplente) {
        this.suplentes.add(suplente);
    }

    /** El método verifica que, si la modalidad del 
    * seminario es “presencial”, no se supere el cupo
    * establecido y que la localidad del Asistente sea
    * “Mendoza”. En caso de que la modalidad del
    * seminario sea “virtual”, no hay cupo máximo ni
    * verificación de localidad.
    * @param recibe un parámetro de tipo Asistente
    * @return retorna true en caso de agregar al 
    * asistente y false en caso contrario
    */

    public boolean agregarAsistente(Asistente asistente)  {

        if (this.modalidad.equals("presencial") && this.asistentes.size() < cupo && asistente.getLocalidad().equals("Mendoza") || this.modalidad.equals("virtual")) {
            this.asistentes.add(asistente);
            return true;
        }
        
        return false;
    }

    public void setNota(Float nota, int indice) {
        this.notas.add(indice, nota);
    }

    public Profesor getMejorSuplente() {

        Profesor mejorSuplente = suplentes.get(0);

        for (int i = 0; i < suplentes.size(); i++) {

            if (suplentes.get(i).getTelefono() != "") {

                if (suplentes.get(i).getDistanciaASede() < mejorSuplente.getDistanciaASede()) {
                    mejorSuplente = suplentes.get(i);
                } else if (suplentes.get(i).getEspecialidades().size() > mejorSuplente.getEspecialidades().size()) {
                    mejorSuplente = suplentes.get(i);
                }

            }

        }

        return mejorSuplente;
    }
}