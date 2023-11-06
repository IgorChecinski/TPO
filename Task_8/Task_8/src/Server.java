import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Services service = new ServicesImpl();
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.bind("Services", service);
            System.out.println("Service bound to registry");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
