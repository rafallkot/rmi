import java.rmi.*;
import java.util.Scanner;

public class CalculateClient {
    public static void main (String[] args) {
        CostsInterface hello;
        try {
            System.setSecurityManager(new RMISecurityManager());
            Scanner s=new Scanner(System.in);
            System.out.println("Podaj droge:");
            String r=s.nextLine().trim();
            System.out.println("Podaj cene za litr");
            String p=s.nextLine().trim();
            System.out.println("Podaj spalanie");
            String c=s.nextLine().trim();
            hello = (CostsInterface)Naming.lookup("rmi://localhost:2020/ABC");
            double result=hello.calculate(new Integer(r), new Double(p), new Double(c));
            System.out.println("Koszty podrozy :"+result);

        }catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
}
