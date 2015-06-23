import java.rmi.*;
import java.rmi.server.*;

public class Calculate  extends UnicastRemoteObject
        implements CostsInterface {

    public Calculate () throws RemoteException {   }

    public double calculate(int route ,double price, double combustion) throws RemoteException {
        System.out.println("Droga: " + route);
        System.out.println("Cena: " + price);
        System.out.println("Spalanie: " + combustion);
        double result=(route/100)*price*combustion;
        return result;
    }
}
