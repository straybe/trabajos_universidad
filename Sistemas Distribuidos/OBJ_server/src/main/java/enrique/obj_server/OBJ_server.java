package enrique.obj_server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Enriq
 */
public class OBJ_server {

    public static void main(String[] args) {
        try {
            RemoteInterface objArray = new Array();
            
            LocateRegistry.createRegistry(1099);
            
            Naming.rebind("MyRemoteObject", objArray);
            
            System.out.println("Servidor OBJR ready>...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
