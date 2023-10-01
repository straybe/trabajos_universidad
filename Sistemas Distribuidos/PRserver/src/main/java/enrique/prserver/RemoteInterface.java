package enrique.prserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Enriq
 */
public interface RemoteInterface extends Remote {
    public void setInfo(String n, String p, String m, int e, boolean s) throws RemoteException;
}
