import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Cliente> clientes;
    private List<Agente> agentes;

    public Agencia() {
        this.clientes = new ArrayList<>();
        this.agentes = new ArrayList<>();
    }

    //Metodo que agrega clientes
    public void agregarCliente(String nombre, String apellido, String identificacion, int edad) {
        if (!clienteExiste(identificacion)) {
            Cliente cliente = new Cliente(nombre, apellido, identificacion, edad);
            clientes.add(cliente);
            System.out.println("Cliente agregado correctamente.");
        } else {
            System.out.println("Ese cliente ya está registrado.");
        }
    }

    //Metodo que valida si un cliente existe
    public boolean clienteExiste(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    //Metodo que cuenta los clientes
    public int contarClientes() {
        return clientes.size();
    }

    //Metodo que agrega agentes
    public void agregarAgente(String nombre, String apellido, String identificacion, int edad) {
        if (!agenteExiste(identificacion)){
            Agente agente = new Agente(nombre, apellido, identificacion, edad);
            agentes.add(agente);
            System.out.println("Agente agregado correctamente.");
        }else {
            System.out.println("Ese agente ya esta registrado.");
        }
    }

    //Metodo que valida si un agente existe
    public boolean agenteExiste(String identificacion) {
        for (Agente agente : agentes) {
            if (agente.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    //Metodo que despide un agente
    public void despedirAgente(String identificacion) {
        Agente agente = buscarAgentePorIdentificacion(identificacion);
        if (agente != null) {
            agentes.remove(agente);
            System.out.println("Agente despedido correctamente.");
        } else {
            System.out.println("No se encontró ningún agente con la identificación proporcionada.");
        }
    }

    //Metodo que busca un agente por identificacion
    public Agente buscarAgentePorIdentificacion(String identificacion) {
        for (Agente agente : agentes) {
            if (agente.getIdentificacion().equals(identificacion)) {
                return agente;
            }
        }
        return null;
    }

    //Metodo que cuenta agentes
    public int contarAgentes() {
        return agentes.size();
    }

    //Metodo que muestra tanto clientes como agentes mayores a 30
    public void mostrarMayoresDe30() {
        System.out.println("Personas mayores de 30 años:");

        for (Cliente cliente : clientes) {
            if (cliente.getEdad() > 30) {
                cliente.mostrarInformacion();
            }
        }

        for (Agente agente : agentes) {
            if (agente.getEdad() > 30) {
                agente.mostrarInformacion();
            }
        }
    }
}


