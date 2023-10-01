package enrique.obj_server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Enriq
 */
public interface RemoteInterface extends Remote {
    public double addAB(double[] A, double[] B) throws RemoteException;  
    public double mulAB(double[] A, double[] B) throws RemoteException;
}
