package enrique.prserver;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Enriq
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellidoPa;
        String apellidoMa;
        int edad;
        boolean sexo = true;
        
        try {
            RemoteInterface objPersona = (RemoteInterface) Naming.lookup("rmi://localhost/MyRemoteObject");
            
            System.out.println("<Ingrese datos>");
            System.out.println("Ingrese nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Ingrese apellido paterno: ");
            apellidoPa = scanner.nextLine();
            System.out.println("Ingrese apellido materno: ");
            apellidoMa = scanner.nextLine();
            System.out.println("Ingrese edad: ");
            edad = scanner.nextInt();
            
            
            objPersona.setInfo(nombre, apellidoPa, apellidoMa, edad, sexo);
            System.out.println("Informacion actualizada");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
