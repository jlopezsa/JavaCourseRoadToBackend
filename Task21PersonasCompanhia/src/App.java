import org.jlopezsa.personascompanhia.Empleado;
import org.jlopezsa.personascompanhia.Gerente;
import org.jlopezsa.personascompanhia.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        Empleado mecanico = new Empleado();
        Gerente financiero = new Gerente("Julian Jair", "Lopez Salamanca", "123", "1020", 1800, 999, 1550);
        mecanico.setNombre("Julian");

        System.out.println("Su nombre es: " + mecanico.getNombre());

        System.out.println(persona.saludar() + " " + mecanico.saludar() + mecanico.getNombre());

        System.out.println(persona.toString());
        System.out.println(mecanico.toString());

        System.out.println(financiero.saludar() + financiero.toString());
        
    }
}
