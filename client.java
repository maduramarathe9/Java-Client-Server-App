//package serverClient;
package JavaClientServerApp;
import java.io.*;
import java.net.*;


public class client{
	public static void main(String[] args) {
		clientMethod();
	}
	public static void clientMethod(){
		Socket cSock = null;
		try{
			cSock = new Socket("127.0.0.1",3600);// connect to the server
                        System.out.println("connected to the server");
		}
		catch (IOException e){
			System.out.println("unknown host exception");
		}
		try{
			PrintWriter pw = new PrintWriter(cSock.getOutputStream(),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			pw.write("Hello");
		}
		catch(IOException e){
			System.out.println("IO exception");
		}
		
	}
	
	
	
	
}
