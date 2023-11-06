import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 8080);
            Services service = (Services) registry.lookup("Services");

            // Echo operation
            EchoRequest echoReq = new EchoRequest("Hello, RMI!");
            EchoResponse echoResp = service.echo(echoReq);
            System.out.println("Echoed Message: " + echoResp.getEchoedMessage());

            // Add operation
            AddRequest addReq = new AddRequest(5, 10);
            AddResponse addResp = service.add(addReq);
            System.out.println("Add Result: " + addResp.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
