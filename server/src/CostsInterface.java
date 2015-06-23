import java.rmi.*;

public interface CostsInterface extends Remote {
    public double calculate(int route ,double price, double combustion) throws RemoteException;
}
