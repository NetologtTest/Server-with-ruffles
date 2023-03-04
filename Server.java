import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {


    public static void main(String[] args) throws Exception {
        System.out.println("Сервер стартовал");
        int port = 80;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    out.println("Вы лоялист или хаосит");
                    final String name = in.readLine();
                    final String name2 = in.readLine();

                    if (name.equals("Лоялист")) {
                        out.println("Привет , гардеиц вот твой лазган ты на верной стороне " + name);
                        out.println("Варповы отродья приближаются, что делать?");
                        if (name2.equals("Примкнуть штыки, вперед за Императора")) {
                            out.println("когти отверженнго хорнита впиваются в вас, вы умираете " + name);
                        } else {
                            out.println("Камисар зол он, стреляет вам в затылок " + name);
                        }
                    } else {
                        out.println("Вы хоасит нравится вам это или нет , вот держи мутацию рук кхорнит " + name);
                        out.println("Впереди слуги трупа на троне, что делать? ");
                        if (name2.equals("Крови богу крови, черепов трону черепов, в атаку")) {
                            out.println("оглущитильный залп лазганов убил вас, " + name);
                        } else {
                            out.println("старший демон не доволе, тебя седают " + name);
                        }
                    }
                }

            }

        }
    }
}







