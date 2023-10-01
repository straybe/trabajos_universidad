package enrique.prserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Enriq
 */
public class PRserver {

    public static void main(String[] args) {
        try {
            RemoteInterface objPersona = new Persona();
            LocateRegistry.createRegistry(1099);
            
            Naming.rebind("MyRemoteObject", objPersona);
            
            System.out.println("Sever Ready>...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
