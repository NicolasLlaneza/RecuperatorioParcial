public abstract class Persona {

    protected String nombre;
    protected String dni;
    protected String email;
    protected Domicilio domicilio;

    public Persona(String nombre, String dni, String email, Domicilio domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
    }
}
