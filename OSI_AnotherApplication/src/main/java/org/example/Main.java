package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 10300;

        try (Socket clientSocket = new Socket(host,port); // ждем подключения
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            out.println("Netology");
            String resp = in.readLine();
            System.out.printf(resp);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

