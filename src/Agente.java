class Agente extends Persona {
    public Agente(String nombre, String apellido, String identificacion, int edad) {
        super(nombre, apellido, identificacion, edad);
    }

    @Override
    public String getProfesion() {
        return "Agente";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(getProfesion() + ": " + nombre + " " + apellido + " - Identificacion: " + identificacion
                + " - Edad: " + edad + " - Profesion: " + getProfesion());
    }
}
