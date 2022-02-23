/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import static java.io.FileDescriptor.in;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author rhodio.alessandro
 */
public class Client {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        Socket clientSocket = new Socket("", 5000);
        PrintWriter    out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader   in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        boolean fine= false;
        
      
        int x;
        System.out.println("MENU");
        System.out.println("1- Registrati");
        System.out.println("2-Loggati");
        x= sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Inserisci la tua email");
        String y = sc.next();
                System.out.println("Inserisci una tua password");
        String z = sc.next();
        {
            boolean messaggio = false;
            out.println(messaggio);
        }
        System.out.println("Il server risponde: " + in.readLine());
                break;
          
            case 2:
                System.out.println("Inserisci la tua email");
            String   a=sc.next();
                System.out.println("Inserisci una tua password");
            String b  = sc.next();
                break;
        }
    }
    
}
