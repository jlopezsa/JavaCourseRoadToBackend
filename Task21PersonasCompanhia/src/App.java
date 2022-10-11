import org.jlopezsa.personascompanhia.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Empleado mecanico = new Empleado();
        mecanico.setNombre("Julian");

        System.out.println("Su nombre es: " + mecanico.getNombre());
    }
}
