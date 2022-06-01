import java.net.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class server{
    public static void main(){
        try{
            ServerSocket sock = new ServerSocket(6013);
            while(true){
                Socket client = sock.accept();
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                out.println(new java.util.Date().toString());
                client.clos
            }
        }catch(IOException e){
            
        }
    }
}