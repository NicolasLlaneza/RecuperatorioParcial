import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cultivo {

    private String especie;
    private TipoCultivo tipo;
    private Date fechaSiembra;
    private List<Cosecha> cosechas;

    public Cultivo() {
    }

    public Cultivo(String especie, TipoCultivo tipo, Date fechaSiembra) {
        this.especie = especie;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(Date fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public void addCosechas(Cosecha cosechas) {
        if (this.cosechas == null) {
            this.cosechas = new ArrayList<>();
        }
    }

    public void removeCosechas(Cosecha thisCosechas) {
        this.cosechas.remove(thisCosechas);
    }

    @Override
    public String toString() {
        return "Cultivo{" +
                "especie='" + especie + '\'' +
                ", tipo=" + tipo +
                ", fechaSiembra=" + fechaSiembra +
                ", cosechas=" + cosechas +
                '}';
    }
}
