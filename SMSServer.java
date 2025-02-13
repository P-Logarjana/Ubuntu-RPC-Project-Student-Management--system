import java.rmi.Naming;

public class SMSServer{
	public static void main(String[] args) {
			try{
				SMSInterface ob=new SMS();
				Naming.rebind("SMS",ob);
				System.out.println("**************WELCOME TO STUDENT MANAGEMENT SYSTEM****************");

		}
		catch(Exception e){
			System.out.print("Error"+e);
		}
	}
}
