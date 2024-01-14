public class Persona {

    private String nombre;
    private int telefono;
    private String email;


    public Persona(String nombre, String email){

        if ((nombre != null) && (!dominioIncorrecto(email))) {
            this.nombre = nombre;
            this.email = email;
            this.telefono = 0;
        } else {
            throw new RuntimeException();
        }

    }
    public Persona(String nombre, String email, int telefono){

        if ((nombre != null) && (!dominioIncorrecto(email))) {
            this.nombre = nombre;
            this.email = email;
            this.telefono = telefono;
        } else {
            throw new RuntimeException();
        }


    }
    private boolean dominioIncorrecto(String email){

        return email.endsWith("gmail.com");

    }

}
