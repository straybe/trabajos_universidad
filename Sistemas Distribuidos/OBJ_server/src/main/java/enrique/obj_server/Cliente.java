package enrique.obj_server;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Enriq
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] A = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.1};
        double[] B = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.1};
        double res = 0;
        
        try {
            RemoteInterface objArray = (RemoteInterface) Naming.lookup("rmi://localhost/MyRemoteObject");
            
            int selection = 0;
            while (selection != 3) {
                System.out.println("1.- Suma de matrices");
                System.out.println("2.- Resta de matrices");
                System.out.println("3.- Cerrar");
                System.out.println("Ingresa una opcion>: ");
                selection = scanner.nextInt();
                
                switch (selection) {
                    case 1:
                        res = objArray.addAB(A, B);
                        System.out.println("Resultado del metodo remoto: " + res);
                        break;
                    case 2:
                        res = objArray.mulAB(A, B);
                        System.out.println("Resultado del metodo remoto: " + res);
                        break;
                    case 3:
                        System.out.println("Cerrando...");
                        break;
                    default:
                        System.out.println("Opcion no existente");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
