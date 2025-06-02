import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


                    Sector frutales = new Sector("Frutales", "Sector de árboles frutales");
                    Sector aromaticas = new Sector("Aromáticas", "Sector de plantas aromáticas");

                    Cultivo manzano = new Cultivo("Manzano", TipoCultivo.FRUTAL, new Date());
                    Cultivo menta = new Cultivo("Menta", TipoCultivo.AROMATICA, new Date());

                    manzano.cosechas.add(new Cosecha(LocalDate.of(2024, 11, 15), 120.5));
                    menta.cosechas.add(new Cosecha(LocalDate.of(2025, 3, 22), 85.0));

                    Domicilio domicilioVoluntario1 = new Domicilio("Anzorena", "123", "Guaymallen", "Mendoza");
                    Domicilio domicilioVoluntario2 = new Domicilio("De la Serra", "237", "Guaymallen", "Mendoza");

                    Voluntario voluntario1 = new Voluntario("Nicolas Llaneza", "39378953", "nicolasllaneza@hotmail.com", domicilioVoluntario1);
                    Voluntario voluntario2 = new Voluntario("Emanuel Ortiz", "34567654", "emaortiz@gmail.com", domicilioVoluntario2);

                    Date fechaActual = new Date();
                    Tarea tarea1 = new Tarea("Poda de árboles", fechaActual, frutales, voluntario1);
                    Tarea tarea2 = new Tarea("Riego de menta", fechaActual, aromaticas, voluntario2);

                    Turno turno1 = new Turno(voluntario1,fechaActual,"18:00hs");
                    Turno turno2 = new Turno(voluntario2,fechaActual,"19:00hs");

                    Domicilio domicilioCapacitador = new Domicilio("Rodriguez", "456", "Ciudad", "Mendoza");
                    Capacitador capacitador = new Capacitador("Luis Gómez", "30987456", "luisGomnezz@yahoo.com", domicilioCapacitador, "Cultivo Orgánico");

                    Capacitacion capacitacion = new Capacitacion();
                    capacitacion.setTema("Buenas prácticas agrícolas");
                    capacitacion.setFecha(fechaActual);
                    capacitacion.capacitador = capacitador;
                    capacitacion.addVoluntarios(voluntario1);
                    capacitacion.addVoluntarios(voluntario2);


                    Domicilio domicilioDonante = new Domicilio("Belgrano", "789", "Godoy Cruz", "Mendoza");
                    Donante donante = new Donante("Jose Gutierrez", "29345876", "josecito@gmail.com", domicilioDonante);

                    Donacion donacion = new Donacion(TipoDonacion.SEMILLAS, "Semillas de tomate", LocalDate.now(), donante);
                    donante.donaciones.add(donacion);

                    // Mostrar donaciones
                    donante.mostrarDonaciones();
                    // Mostrar asistentes
                    capacitacion.mostrarAsistentes();
            }
}
