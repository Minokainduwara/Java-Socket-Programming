import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients...");
            ServerSocket serverSocket = new ServerSocket(9804);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Server Says " + message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
