package org.academiadecodigo.agicultores;

import java.io.*;
import java.net.*;

public class MainServer {
    public static void main(String[] args) throws IOException {
        // STEP1: Get parameters from command line arguments
        int portNumber = 4020;

        // STEP2: Bind to local port and block while waiting for client connections

        ServerSocket serverSocket = new ServerSocket(portNumber);
        Socket clientSocket = serverSocket.accept();
        while (clientSocket.isBound()) {
            // STEP3: Setup input and output streams
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // STEP4: Read from/write to the stream

            String s = in.readLine();
            System.out.println(s);

        }
        // STEP5: Close the streams
        // STEP6: Close the sockets
    }
}
