//TCP Client Server Chat
/*Server*/
import java.io.*;
import java.net.*;
public class TCPChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is running. Waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String clientMsg, serverMsg;
            while ((clientMsg = input.readLine()) != null) {
                System.out.println("Client: " + clientMsg);
                System.out.print("You: ");
                serverMsg = console.readLine();
                output.println(serverMsg);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*Client*/
import java.io.*;
import java.net.*;
public class TCPChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server!");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String serverMsg, clientMsg;
            while (true) {
                System.out.print("You: ");
                clientMsg = console.readLine();
                output.println(clientMsg);

                serverMsg = input.readLine();
                if (serverMsg == null) break;
                System.out.println("Server: " + serverMsg);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}