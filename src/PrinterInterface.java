import java.rmi.Remote;
import java.rmi.RemoteException; 

public interface PrinterInterface extends Remote{
	void printMsg() throws RemoteException;
}
