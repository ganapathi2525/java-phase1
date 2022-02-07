package regularexpre;
import java.util.regex.*;
public class RegularExpressions {
	public static void main(String[] args) {

		String pattern = "[A-Z]+";
		String check = "Fahad Khanna";
		Pattern ptr = Pattern.compile(pattern);
		Matcher mtc = ptr.matcher(check);
		
		while (mtc.find())
	      	System.out.println( check.substring( mtc.start(), mtc.end() ) );
		}

}
