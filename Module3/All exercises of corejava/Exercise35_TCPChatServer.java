import java.io.*;
import java.net.*;

public class Exercise35_TCPChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket clientSocket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client: " + inputLine);
            out.println(stdIn.readLine());
        }

        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
