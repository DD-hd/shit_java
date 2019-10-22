import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket s;

    ClientThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream pw = new PrintStream(this.s.getOutputStream());
        InputStream s = this.s.getInputStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(s));
        String content = null;
        while (true) {
            while ((content = br.readLine()) != null) {
                pw.println(content);
            }
            while ((content = r.readLine()) != null) {
                System.out.println(content);
            }
        }

    }

    public static void main(String[] args) {
        Socket c = new Socket("127.0.0.1", 8080);
        new Thread(new ClientThread(c)).start();
    }
}