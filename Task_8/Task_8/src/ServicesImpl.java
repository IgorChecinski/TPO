import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ServicesImpl extends UnicastRemoteObject implements Services {

    public ServicesImpl() throws RemoteException {
        super();
    }

    @Override
    public EchoResponse echo(EchoRequest request) throws RemoteException {
        return new EchoResponse(request.getMessage());
    }

    @Override
    public AddResponse add(AddRequest request) throws RemoteException {
        double result = request.getOperand1() + request.getOperand2();
        return new AddResponse(result);
    }
}
