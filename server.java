import java.net.*;
import java.io.*;

public class ServerClass{
	public static void main(String[] args) {
		
	}
	public static void ServerMethod(){
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
		except(Exception e){
			System.out.println("Accept failed "+e);
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		while(true){
			try{
				line = in.readLine();
				out.print(line);
				
			}
		}
		
		
		
	}
}
