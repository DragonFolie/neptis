package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(4999)) {
            Socket socket = serverSocket.accept();

            System.out.println("connected");

            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader bf = new BufferedReader(in);

            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()) {

                String str = bf.readLine();
                if (str.equals("exit")) {
                    break;
                }
                System.out.println("client write:" + str);

            }
        }
    }
}

