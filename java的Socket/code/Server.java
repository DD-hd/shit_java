import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

    }

    public static void run() {
        ServerSocket server = new ServerSocket(30000);
        while (true) {
            Socket s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("您好,您收到了服务器的新年服务！");
            ps.close();
            s.close();
        }
    }
}

class Client {
    public static void main(String[] args) {
        Socket socket = new Socket("127.0.0.1", 30000);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println("来自服务器的数据:" + line);
        br.close();
    }
}