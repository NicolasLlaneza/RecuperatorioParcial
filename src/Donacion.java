import java.time.LocalDate;

public class Donacion {

    private TipoDonacion tipo;
    private String descripcion;
    private LocalDate fecha;

    public Donacion(TipoDonacion tipo, String descripcion, LocalDate fecha, Donante donante) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}
