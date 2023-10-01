package enrique.msg_server;

import java.net.*;
import java.io.*;

/**
 *
 * @author Enriq
 */
public class Msg_server {

    public static void main(String[] args) {
        ServerSocket server;
        DataInputStream dataInput;
        DataOutputStream dataOutput;
        Socket client;
        String text = "";
        
        try {
            server = new ServerSocket(9090);
            client = server.accept();
            dataInput = new DataInputStream(client.getInputStream());
            dataOutput = new DataOutputStream(client.getOutputStream());
            dataOutput.writeUTF("Escribe EXIT para salir>");
            
            while (!text.toUpperCase().equals("EXIT")) {                
                text = dataInput.readUTF();
                
                switch (text) {
                    case "Hola_servidor":
                        dataOutput.writeUTF("SERVER>: \n" + "");
                        break;
                    case "inicio_sesion":
                        dataOutput.writeUTF("SERVIDOR>: " + "Inicio de sesion correcto");
                        break;
                    case "estado_sesion":
                        dataOutput.writeUTF("SERVER>: " + "Sesion conectada");
                        break;
                   case "exit":
                        dataOutput.writeUTF("SERVIDOR>: " + "Conexion cerrada");
                        break;
                    default:
                        dataOutput.writeUTF("SERVIDOR>: " + "Error...");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
