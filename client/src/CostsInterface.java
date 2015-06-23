import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CostsInterface extends Remote {
    public double calculate(int route, double price, double combustion) throws RemoteException;
}
