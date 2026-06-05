import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            System.out.println("FactorialServer started! Waiting for clients...");
            ServerSocket serverSocket = new ServerSocket(9805);
            Socket clientSocket = serverSocket.accept();
            BufferedReader userInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Factorial of " + number + " is " + factorial(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
