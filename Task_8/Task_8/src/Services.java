import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Services extends Remote {
    EchoResponse echo(EchoRequest request) throws RemoteException;
    AddResponse add(AddRequest request) throws RemoteException;
}
