import java.util.ArrayList;
import java.util.List;

public class Sector {

    private String nombre;
    private String descripcion;
    private List<Cultivo> cultivos;
    private Tarea tarea;

    public Sector() {
    }

    public Sector(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void addCultivos(Cultivo cultivos) {
        if (this.cultivos == null) {
            this.cultivos = new ArrayList<>();
        }
    }

    public void removeCultivos(Cultivo cultivos) {
        this.cultivos.remove(cultivos);
    }

    //public void getCosechasDelSector();{


    @Override
    public String toString() {
        return "Sector{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cultivos=" + cultivos +
                '}';
    }
}



