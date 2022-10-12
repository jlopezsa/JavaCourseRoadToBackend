import org.jlopezsa.personascompanhia.Cliente;
import org.jlopezsa.personascompanhia.Empleado;
import org.jlopezsa.personascompanhia.Gerente;
import org.jlopezsa.personascompanhia.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        Empleado mecanico = new Empleado("Maria", "Gonzales", "555", "calle 123", 125.5, 222);
        Gerente financiero = new Gerente("Julian Jair", "Lopez Salamanca", "123", "1020", 1800, 999, 1550);
        Cliente deportivo = new Cliente("Luis", "Mariano", "999", "Calle Siempre viva", 888);

        System.out.println("----- Imprimiedo con método toString propio de cada clase ");

        System.out.println(persona.toString());
        System.out.println(financiero.toString());
        System.out.println(mecanico.toString());
        System.out.println(deportivo.toString());

        System.out.println("----- Imprimiedo con método único de la clase padre ");

        informacion(persona);
        informacion(financiero);
        informacion(mecanico);
        informacion(deportivo);
    }

    public static void informacion(Persona persona) {
        System.out.println(persona.toString());
    }
}
