import java.time.LocalDate;
import java.util.Date;

public class Tarea {

    private String descripcion;
    private Date fecha;
    private Sector sector;
    private Voluntario voluntario;

    public Tarea(String descripcion, Date fecha, Sector sector, Voluntario voluntario) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
        this.voluntario = voluntario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", sector=" +
                '}';
    }
}
