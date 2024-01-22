package ru.baranets.homeworks20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String availableOperations = in.readLine();
            System.out.println(availableOperations);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Enter two numbers and an operation (e.g. 3 4 +): ");
                String input = reader.readLine();
                System.out.println(input);

                if (input.equals("exit")) {
                    break;
                }
                String result = in.readLine();
                System.out.println("Result: " + result);
            }
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
