/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author rhodio.alessandro
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("", 5000);
        PrintWriter    out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader   in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        boolean fine= false;
            
        
        while(!fine){
        String messaggio = in.readLine();
        in.close();
        out.close();
        clientSocket.close();
        out.println("");
        
        }
       
    }
    
}
