import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1566);
            System.out.println("服务端启动，等待客服链接");
            Socket client = server.accept();
            System.out.println("有客户链接，客户端IP为"+client.getInetAddress());
            server.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
