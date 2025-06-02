import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Capacitacion {

    private String tema;
    private Date fecha;
    private List<Voluntario> voluntarios;
    Capacitador capacitador;

    public Capacitacion() {
    }

    public Capacitacion(String tema, Date fecha, List<Voluntario> voluntarios) {
        this.tema = tema;
        this.fecha = fecha;
        this.voluntarios = voluntarios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void addVoluntarios(Voluntario voluntarios) {
        if (this.voluntarios == null) {
            this.voluntarios = new ArrayList<>();
        }
    }
    public void removeVoluntarios(Voluntario voluntarios) {
        this.voluntarios.remove(voluntarios);
    }

    public void mostrarAsistentes() {
        for (Voluntario v : voluntarios) {
            System.out.println(v.nombre);
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "tema='" + tema + '\'' +
                ", fecha=" + fecha +
                ", voluntarios=" + voluntarios +
                '}';
    }
}
