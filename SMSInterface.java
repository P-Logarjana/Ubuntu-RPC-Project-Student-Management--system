import java.rmi.*;

public interface SMSInterface extends Remote{
	public String[] display() throws RemoteException;
	public String[] Grade() throws RemoteException;
	public String[] Grade_One() throws RemoteException;
	public String[] Grade_Two() throws RemoteException;
	public String[] Grade_Three() throws RemoteException;
	public String[] Grade_Four() throws RemoteException;
	public String[] Grade_Five() throws RemoteException;

	
	public String[] Teachers_Info() throws RemoteException;
	public String[] Herath() throws RemoteException;
	public String[] Gunatharshana() throws RemoteException;
	public String[] Vinothsehar() throws RemoteException;
	public String[] Hamanathi() throws RemoteException;

	
	public String[] Subject() throws RemoteException;
	public String[] SUBJECTS() throws RemoteException;
	public String[] ACTIVITY() throws RemoteException;
	public String[] Subject_Info() throws RemoteException;
	public String[] Activity_Info() throws RemoteException;


	public String[] contact() throws RemoteException;
	public String[] contact_info() throws RemoteException;
	

}
