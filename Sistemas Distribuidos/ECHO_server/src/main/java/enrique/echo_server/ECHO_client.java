package enrique.echo_server;

import java.net.*;
import java.io.*;

/**
 *
 * @author Enriq
 */
public class ECHO_client {
    public static void main (String[] args) {
        Socket server;
        DataInputStream dataInput;
        DataOutputStream dataOutput;
        String textInput;
        String textOutput = "";
        BufferedReader console;
        
        try {
            server = new Socket("127.0.0.1", 9090);
            dataInput = new DataInputStream(server.getInputStream());
            dataOutput = new DataOutputStream(server.getOutputStream());
            console = new BufferedReader(new InputStreamReader(System.in));
            
            while (!textOutput.toUpperCase().equalsIgnoreCase("EXIT")) {                
                textInput = dataInput.readUTF();
                System.out.println(textInput);
                textOutput = console.readLine();
                dataOutput.writeUTF(textOutput);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
