package IPAddressValidation;

public class IPAddressValidationMain {
	
	public static void main(String[] args)
	{
		String ip1 = "222.111.111.111";
		String ip2 = "5555..555";
		String ip3 = "0000.0000.0000.0000";
		String ip4 = "1.1.1.1";
		
		IPAddressVerification ip=new IPAddressVerification();
		
		System.out.println(ip.isValid(ip1));
		System.out.println(ip.isValid(ip2));
		System.out.println(ip.isValid(ip3));
		System.out.println(ip.isValid(ip4));
	}


}
