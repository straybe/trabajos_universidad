package enrique.prserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Enriq
 */
public class Persona extends UnicastRemoteObject implements RemoteInterface {
    String nombre;
    String apellidoPa;
    String apellidoMa;
    int edad;
    boolean sexo;
    
    public Persona() throws RemoteException {
        
    }
    
    public void setInfo(String n, String p, String m, int e, boolean s) throws RemoteException {
        this.nombre = n;
        this.apellidoPa = p;
        this.apellidoMa = m;
        this.edad = e;
        this.sexo = s;
        System.out.println("Datos actualizados");
    }
}
