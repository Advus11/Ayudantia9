import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agencia {
    private List<Agente> agentes;
    private List<Cliente> clientes;

    public Agencia() {
        this.agentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void ejecutarPrograma() {
        System.out.println("Bienvenido a la Agencia");

        iniciarConsola();
    }

    public void iniciarConsola() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar Agente");
            System.out.println("2. Buscar Agente por Identificacion");
            System.out.println("3. Eliminar Agente por Identificacion");
            System.out.println("4. Agregar Cliente");
            System.out.println("5. Buscar Cliente por Identificacion");
            System.out.println("6. Generar Venta");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAgente();
                    break;
                case 2:
                    buscarAgentePorIdentificacion();
                    break;
                case 3:
                    eliminarAgentePorIdentificacion();
                    break;
                case 4:
                    agregarCliente();
                    break;
                case 5:
                    buscarClientePorIdentificacion();
                    break;
                case 6:
                    generarVenta();
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    break;
            }
        }

        scanner.close();
    }

    public void agregarAgente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del agente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del agente:");
        String apellido = scanner.nextLine();

        String identificacion = obtenerIdentificacionUnica("agente");

        System.out.println("Ingrese el codigo del agente:");
        String codigoAgente = scanner.nextLine();

        Agente agente = new Agente(nombre, apellido, identificacion, codigoAgente);
        agentes.add(agente);

        System.out.println("Agente agregado correctamente.");
    }

    public void buscarAgentePorIdentificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la identificacion del agente a buscar:");
        String identificacion = scanner.nextLine();

        Agente agenteEncontrado = null;

        for (Agente agente : agentes) {
            if (agente.getIdentificacion().equals(identificacion)) {
                agenteEncontrado = agente;
                break;
            }
        }

        if (agenteEncontrado != null) {
            System.out.println("Agente encontrado:");
            System.out.println("Nombre: " + agenteEncontrado.getNombre());
            System.out.println("Apellido: " + agenteEncontrado.getApellido());
            System.out.println("Identificacion: " + agenteEncontrado.getIdentificacion());
            System.out.println("Codigo del Agente: " + agenteEncontrado.getCodigoAgente());
        } else {
            System.out.println("No se encontro ningun agente con esa identificacion.");
        }
    }

    public void eliminarAgentePorIdentificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la identificacion del agente a eliminar:");
        String identificacion = scanner.nextLine();

        Agente agenteEncontrado = null;

        for (Agente agente : agentes) {
            if (agente.getIdentificacion().equals(identificacion)) {
                agenteEncontrado = agente;
                break;
            }
        }

        if (agenteEncontrado != null) {
            agentes.remove(agenteEncontrado);
            System.out.println("Agente eliminado correctamente.");
        } else {
            System.out.println("No se encontro ningun agente con esa identificacion.");
        }
    }

    public void agregarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del cliente:");
        String apellido = scanner.nextLine();

        String identificacion = obtenerIdentificacionUnica("cliente");

        System.out.println("Ingrese el origen del cliente:");
        String origenCliente = scanner.nextLine();

        System.out.println("Ingrese el destino del cliente:");
        String destinoCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, identificacion, origenCliente, destinoCliente);
        clientes.add(cliente);

        System.out.println("Cliente agregado correctamente.");
    }

    public void buscarClientePorIdentificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la identificacion del cliente a buscar:");
        String identificacion = scanner.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nombre: " + clienteEncontrado.getNombre());
            System.out.println("Apellido: " + clienteEncontrado.getApellido());
            System.out.println("Identificacion: " + clienteEncontrado.getIdentificacion());
            System.out.println("Origen del Cliente: " + clienteEncontrado.getOrigenCliente());
            System.out.println("Destino del Cliente: " + clienteEncontrado.getDestinoCliente());
        } else {
            System.out.println("No se encontro ningun cliente con esa identificacion.");
        }
    }

    public void generarVenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la identificacion del cliente:");
        String identificacionCliente = scanner.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacionCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("Venta realizada al cliente:");
            System.out.println("Nombre: " + clienteEncontrado.getNombre());
            System.out.println("Apellido: " + clienteEncontrado.getApellido());
            System.out.println("Identificación: " + clienteEncontrado.getIdentificacion());
            System.out.println("Origen del Cliente: " + clienteEncontrado.getOrigenCliente());
            System.out.println("Destino del Cliente: " + clienteEncontrado.getDestinoCliente());
            System.out.println("Pasaje de avion vendido correctamente!");
        } else {
            System.out.println("No se encontro ningun cliente con esa identificacion.");
        }
        return;
    }

    private String obtenerIdentificacionUnica(String tipo) {
        Scanner scanner = new Scanner(System.in);
        String identificacion;

        while (true) {
            System.out.println("Ingrese la identificacion del " + tipo + ":");
            identificacion = scanner.nextLine();

            boolean identificacionExistente = false;

            if (tipo.equalsIgnoreCase("agente")) {
                for (Agente agente : agentes) {
                    if (agente.getIdentificacion().equals(identificacion)) {
                        identificacionExistente = true;
                        break;
                    }
                }
            } else if (tipo.equalsIgnoreCase("cliente")) {
                for (Cliente cliente : clientes) {
                    if (cliente.getIdentificacion().equals(identificacion)) {
                        identificacionExistente = true;
                        break;
                    }
                }
            }

            if (!identificacionExistente) {
                break;
            }

            System.out.println("La identificacion ingresada ya existe. Por favor, ingrese una identificacion unica.");
        }

        return identificacion;
    }
}


