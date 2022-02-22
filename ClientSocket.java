/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author rhodi
 */
public class ClientSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String resp = null;
      do{
          try{ 
       Socket clientSocket = new Socket("192.168.56.1", 5000);
    PrintWriter    out = new PrintWriter(clientSocket.getOutputStream(), true);
     BufferedReader   in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    out.println("hello server");
        resp = in.readLine();
        in.close();
        out.close();
        clientSocket.close();
            serverSocket.close();
        } catch (IOException ex){
       } 
        
        }while(!resp.equals("fine"));

        
    }

      } 

    

