import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {

        try {
            System.out.println("EchoClient started!");
            Socket soc = new Socket("localhost", 9804);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a message to send to the server:");
            String message = userInput.readLine();

            //Send the String to the User
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(message);

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
