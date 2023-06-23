class Cliente extends Persona {


    public Cliente(String nombre, String apellido, String identificacion, int edad) {
        super(nombre, apellido, identificacion, edad);
    }


    @Override
    public String getProfesion() {
        return "Cliente";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(getProfesion() + ": " + nombre + " " + apellido + " - Identificacion: " + identificacion
                + " - Edad: " + edad + " - Profesion: " + getProfesion());
    }
}