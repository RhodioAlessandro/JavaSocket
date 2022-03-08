
package clientsocket;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientSocket {

   
    public static void main(String[] args) {
       try {
            Socket clientSocket = new Socket("192.168.56.1", 5000);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner sc = new Scanner(System.in);
            String decisione;
            String user;
            String password;
            BufferedReader reader = new BufferedReader(new FileReader("credenziali.txt"));
            System.out.println("- login"
                    + "- crea nuovo utente\n"
                    + "ricoda! scrivi reg o log\n");
            decisione = sc.next();

            if (decisione == "log") {
                System.out.print("inserisci l'user");
                user = sc.next();
                user = in.readLine();
                System.out.print("inserisci la password");
                password = sc.next();
                password = in.readLine();
            } else {
                if (decisione == "reg") {
                    System.out.print("inserisci un user");
                    user = sc.next();
                    System.out.print("inserisci una password");
                    password = sc.next();
                    user = reader.readLine();
                    password = reader.readLine();
                    while (user != null) {
                        System.out.println(user);
                        user = reader.readLine();
                    }
                    while (password != null) {
                        System.out.println(password);
                        password = reader.readLine();
                    }
                }
            }
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}