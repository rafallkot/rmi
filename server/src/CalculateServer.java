import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class CalculateServer {
    public static void main (String[] argv) {
        try {
            System.setSecurityManager(new RMISecurityManager());
            LocateRegistry.createRegistry(2020);

            Calculate Hello = new Calculate();
            Naming.rebind("rmi://192.168.0.100:2020/ABC", Hello);

            System.out.println("Calculate Server is ready.");
        }catch (Exception e) {
            System.out.println("Calculate Server failed: " + e);
        }
    }
}
