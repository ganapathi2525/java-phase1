package stringsfull;

public class StringProgramme {
	public static void main(String[] args) {
		//To define string length	
				System.out.println("Operations and arrays and strings :");
				
				String sl=new String("This is a String Program");
				System.out.println(sl.length());

		//To generate substring
				String sub=new String("RadheShyam");
				System.out.println(sub.substring(2));

		//To Compare Strings
				String s1="Knight";
				String s2="Night";
				System.out.println(s1.compareTo(s2));

		//To check whether a string is Empty
				String s4="Fill";
				System.out.println(s4.isEmpty());

		//To convert to LowerCase
				String s5="HighVoltage";
				System.out.println(s5.toLowerCase());
				
		//To replace letters
				String s6="virat";
				String replace=s6.replace('r', 't');
				System.out.println(replace);

		//to check if equals
				String x="Teja loves geeta";
				String y="Geeta loves Ganesh";
				System.out.println(x.equals(y));
		 	
			}

}
