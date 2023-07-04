package Pratim;
import java.util.regex.*;
class IPAddress{
	
	int a,b,c,d;
	
	Boolean IPAddCheck(String S) {
		
		String zeroTo255
        = "(\\d{1,2}|(0|1)\\"
          + "d{2}|2[0-4]\\d|25[0-5])";
		
		String regex
        = zeroTo255 + "\\."
          + zeroTo255 + "\\."
          + zeroTo255 + "\\."
          + zeroTo255;

		Pattern p = Pattern.compile(regex);
		
		 if (S == null) {
	            return false;
	        }
		
		 Matcher m = p.matcher(S);
		 
	        // Return if the IP address
	        // matched the ReGex
	        return m.matches();
	        
	}
	
	
}

public class IPCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPAddress ip=new IPAddress();
	
		System.out.println(ip.IPAddCheck("172"));
	}

}
