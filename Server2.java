import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Server2 {


    public static void main(String[] args) {

        String host = "netology.homework";

        int port = 80;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {


            out.println("Лоялист");

            out.println("Примкнуть штыки, вперед за Императора");
            for (int i = 0; i < 4; i++) {
                String resp0 = in.readLine();
                System.out.println(resp0);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
