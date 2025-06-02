import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona {
    List<Donacion> donaciones = new ArrayList<>();

    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public void addDonaciones(List<Donacion> donaciones){
        if(this.donaciones == null){
            this.donaciones = donaciones;
        }
    }

    public void removeDonaciones(Donacion donaciones){
        this.donaciones.remove(donaciones);
    }


    public void mostrarDonaciones() {
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }
}
