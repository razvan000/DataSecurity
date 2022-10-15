import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Printer{
	public Server() {}
	public static void main(String[] args) {
		try { 
	         Printer printer = new Printer(); 
	         PrinterInterface stub = (PrinterInterface) UnicastRemoteObject.exportObject(printer, 0);   
	         Registry registry = LocateRegistry.createRegistry(1099); 

	         registry.bind("PrinterInterface", stub);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 

	}

}
