import java.net.*;
import java.io.*;

public class client {
    public static void main(){
        try{
            Socket sock = new Socket("127.0.0.1", 6013);
            InputStream is = sock.getInputStream();
            OutputStream os = sock.getOutputStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = bin.readLine()) != null)
                System.out.println(line);
                sock.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}