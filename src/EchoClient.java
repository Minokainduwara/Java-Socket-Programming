import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {

        try {
            System.out.println("EchoClient started!");
            Socket soc = new Socket("localhost", 9804);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
