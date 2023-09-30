package enrique.echo_server;

import java.net.*;
import java.io.*;

/**
 *
 * @author Enriq
 */
public class ECHO_server {

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
                dataOutput.writeUTF("ECO> " + text);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
