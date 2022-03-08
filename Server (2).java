
package sever;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Sever {

   
    public static void main(String[] args) {
        String cred = "C:/credenziali.txt";
           try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            File file = new File(cred);
            FileWriter fw = new FileWriter(file);
            fw.flush();
            fw.close();
            String user = in.readLine();
            String password = in.readLine();
            if ("credenziali.txt".equals(user)) {
                if("credenziali.txt".equals(password))
                out.println("OK, login effetuato");
            } else {
                out.println("NO, login fallito");
            }
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }    
}
