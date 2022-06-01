import java.net.*;
import java.io.*;

public class server{
    public static void main(){
        try{
            ServerSocket sock = new ServerSocket(6013);
            while(true){
                Socket client = sock.accept();
                InputStreamReader is = new InputStreamReader(client.getInputStream());
                OutputStream os = client.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                BufferedReader in = new BufferedReader(is);
                out.println(in);
                client.close();
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}