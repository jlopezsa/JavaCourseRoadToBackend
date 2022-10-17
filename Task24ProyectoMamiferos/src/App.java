import org.jlopezsa.mamiferos.Tigre;

public class App {
    public static void main(String[] args) throws Exception {
        Tigre bengala = new Tigre("Selvas africanas", 120.50F, 200.00F, 50.25F, "FelinsVelocirraptor", 50.00F, 60, "bengala");

        System.out.println(bengala.comer());
        System.out.println(bengala.correr());
        System.out.println(bengala.dormir());
        System.out.println(bengala.comunicarse());
    }
}
