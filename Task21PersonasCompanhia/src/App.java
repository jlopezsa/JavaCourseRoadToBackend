import org.jlopezsa.personascompanhia.Empleado;
import org.jlopezsa.personascompanhia.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        Empleado mecanico = new Empleado();
        mecanico.setNombre("Julian");

        System.out.println("Su nombre es: " + mecanico.getNombre());

        System.out.println(persona.saludar() + " " + mecanico.saludar() + mecanico.getNombre());
    }
}
