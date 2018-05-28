package JavaClientServerApp;
import java.net.*;
import java.io.*;

public class server{
	public static void main(String[] args) {
		System.out.println("hello world");
		serverMethod();
	}
	public static void serverMethod(){
		ServerSocket sSocket = null;
		String line;
		
		try{
			sSocket = new ServerSocket(3600);
		}
		catch(Exception e){
			System.out.println("Caught Exception while creating server socket, could not listen on port 3600  "+e);
			System.exit(1);
		}
		
		Socket cSocket = null;
		try{
			cSocket = sSocket.accept();
		}
		catch(Exception e){
			System.out.println("Accept failed "+e);
			System.exit(1);
		}
		try{
			PrintWriter out = new PrintWriter(cSocket.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
			while(true){
				try{
					line = in.readLine();
                                        System.out.println("Trying to read I/P from the client");
					out.print(line);
				
				}
				catch(Exception e){
					System.out.println("Receiving messages failed");
				}
			}	
		}
		catch(IOException e){
			System.out.println("IO Exception occurred");
		}
		
	}
}
