import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Persona{

    private List<Tarea> tareas;
    private Turno turno;


    public Voluntario(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public void addTareas (Tarea tareas) {
        if (this.tareas == null) {
            this.tareas = new ArrayList<Tarea>();
        }
    }

    public void removeTareas (Tarea tareas) {
        this.tareas.remove(tareas);
    }



    @Override
    public String toString() {
        return "Voluntario{" +
                "tareas=" + tareas +
                ", turno=" + turno +
                '}';
    }
}
