public class Agente extends Persona {
    private String codigoAgente;

    public Agente(String nombre, String apellido, String identificacion, String codigoAgente) {
        super(nombre, apellido, identificacion);
        this.codigoAgente = codigoAgente;
    }

    public String getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }
}
