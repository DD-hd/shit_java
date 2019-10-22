import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread implements Runnable {
    ServerSocket s;
    ArrayList<Socket> clients;

    ServerThread(ServerSocket s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            Socket c = this.s.accept();
            this.clients.add(c);
        }
    }

    public static void main(String[] args) {
    }
}

class BoardSocket implements Runnable {
    private Socket c;
    private ArrayList<Socket> arr;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(this.c.getInputStream()));
        String content = null;
        while ((content = br.readLine()) != null) {
            for (Socket c : this.arr) {
                this.tryWrite(c, content);
            }
        }

    }

    BoardSocket(Socket c, ArrayList<Socket> arr) {
        this.c = c;
        this.arr = arr;
    }

    void tryWrite(Socket c, String content) {
        PrintWriter pt = new PrintWriter(c.getOutputStream());
        try {
            pt.println(content);
        } catch (IOException ex) {
            this.arr.remove(c);
        }
    }
}