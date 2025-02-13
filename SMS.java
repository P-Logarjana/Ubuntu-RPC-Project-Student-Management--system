import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class SMS extends UnicastRemoteObject implements SMSInterface {
	public SMS() throws RemoteException {
	}

	public String[] display() {
		String[] a = { "Grade", "Teachers_Info", "Subjects","Contact" ,"Exit" };
		return a;
	}

	public String[] Grade() {
		String[] b = { "Grade_One", "Grade_Two", "Grade_Three", "Grade_Four", "Grade_Five", "Back" };
		return b;
	}

	public String[] Grade_One() {
		String[] b = { "1-S.Shahra", "2-K.Keshanth", "3-P.Priya", "4-S.Suja", "5-V.Vanith", "6-T.Premanth", "7-D.Dilan", "8-R.Reena", "9-K.Archana", "10-T.Thushan"};
		return b;
	}

	public String[] Grade_Two() {
		String[] b = { "1-P.Priya", "2-S.Suja", "3-V.Vanith", "4-T.Premanth", "5-S.Sujan", "6-P.Ann", "7.D.John", "8-H.Harshan", "9-P.Farhan", "10-R.Rahul"};
		return b;
	}

	public String[] Grade_Three(){
		String[] b = { "1-S.Shahra", "2-K.Keshanth", "3-T.Premanth", "4-S.Sujan", "5-H.Harshan", "6-P.Farhan", "7-D.Dilan", "8-R.Reena", "9-S.A.Anna", "10-J.Jaanu"};
		return b;

	}

	public String[] Grade_Four() {
		String[] b = { "1-T.Premanth", "2-S.Sujan", "3-H.Harshan", "4-K.Hamsath","5-P.Farhan", "6-V.Vanith", "7-T.Premanth", "8-V.Vanith", "9-T.Premanth", "10-G.Dilshan"};
		return b;
	}

	public String[] Grade_Five() {
		String[] b = { "1-P.Farhan", "2-V.Vanith", "3-Y.Yuvash", "4-H.Harshan", "5-P.Farhan", "6-T.Thushan", "7.D.John", "8-H.Harshan", "9-K.Arthiyan", "10-H.Harsha"};
		return b;

	}

	//................................................................................................................................
	public String[] Teachers_Info() {
		String[] x = { "Herath", "Gunatharshana", "Vinothsehar", "Hamanath", "BACK" };
		return x;
	}

	public String[] Herath() {
		String[] y = {"Teacher ID: T001","Full Name: Mr.S.M.L.Herath","E-mail: Herathi@gmail.com","Phone Number: 078 88877012"};
		return y;
	}

	public String[] Gunatharshana() {
		String[] z = {"Teacher ID: T002","Full Name: Mr.H.R.I.Gunatharshana","E-mail: Gunatharshana@gmail.com","Phone Number: 078 99972312"};
		return z;
	}

	public String[] Vinothsehar() {
		String[] q = {"Teacher ID: T003","Full Name: Mr.E.Vinothsehar","E-mail: Vinothsehar@gmail.com","Phone Number: 078 99972312"};
		return q;
	}
	
	public String[] Hamanathi() {
		String[] r = {"Teacher ID: T004","Full Name: Miss.E.Hamanathi","E-mail: Hamanathi@gmail.com","Phone Number: 078 1111102312"};
		return r;
	}

//...........................................................................................................................................................................
	public String[] Subject() {
		String[] s = { "SUBJECTS", "ACTIVIY", "BACK" };
		return s;
	}

	public String[] SUBJECTS() {
		String[] t = { "1.Subject_Info", "2.BACK" };
		return t;
	}

	public String[] ACTIVITY() {
		String[] u = { "1.Activity_Info", "2.BACK" };
		return u;
	}

	public String[] Subject_Info() {
		String[] v = { "\nTamil:Miss.E.Hamanathi", "Religion:Mr.S.M.L.Herath", "Methematics:Mr.H.R.I.Gunatharshana", "English:Mr.E.Vinothsehar", "Sinhala:Miss.E.Hamanathi"};
		return v;
	}

	public String[] Activity_Info() {
		String[] w = { "\nArt:Mr.E.Vinothsehar","Dance:E.Hamanathi","Sports:Mr.S.M.L.Herath","Music:Mr.H.R.I.Gunatharshana" };
		return w;

	}

	//...........................................................................................................................................................................
	public String[] contact() {
		String[] j = {"INFORMATION", "BACK"};
		return j;
	}

	public String[] contact_info() {
		String[] k = {"************ CONTACT US **************** \n\n  Principal Name: M.S.M.Perera \n Principal Telephone Number : 023 2331115 \n Email Address : abcmahavidyalaya@gmail.com"};
		return k;
	}

}
