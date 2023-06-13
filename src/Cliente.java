public class Cliente extends Persona {
    private String origenCliente;
    private String destinoCliente;

    public Cliente(String nombre, String apellido, String identificacion, String origenCliente, String destinoCliente) {
        super(nombre, apellido, identificacion);
        this.origenCliente = origenCliente;
        this.destinoCliente = destinoCliente;
    }

    public String getOrigenCliente() {
        return origenCliente;
    }

    public void setOrigenCliente(String origenCliente) {
        this.origenCliente = origenCliente;
    }

    public String getDestinoCliente() {
        return destinoCliente;
    }

    public void setDestinoCliente(String destinoCliente) {
        this.destinoCliente = destinoCliente;
    }
}