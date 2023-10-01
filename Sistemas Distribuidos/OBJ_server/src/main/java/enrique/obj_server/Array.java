package enrique.obj_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Enriq
 */
public class Array extends UnicastRemoteObject implements RemoteInterface {
    public Array () throws RemoteException {
        double[] A = new double[10];
        double[] B = new double[10];
    }
    
    public double addAB(double[] A, double[] B) throws RemoteException {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += A[i] + B[i];
        }
        return sum;
    }
    
    public double mulAB(double[] A, double[] B) throws RemoteException {
        double mul = 0;
        for (int i = 0; i < 10; i++) {
            mul += A[i] * B[i];
        }
        return mul;
    }
}
