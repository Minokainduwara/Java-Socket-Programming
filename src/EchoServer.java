import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients...");
            ServerSocket serverSocket = new ServerSocket(9804);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
