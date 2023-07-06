package IPAddressValidation;

	
	
class IPAddressVerification {	


	int octet1,octet2,octet3,octet4;
	

		public boolean inRange(int octet)
		{ // check if every split is in range 0-255
			if (octet >= 0 && octet <= 255) {
				return true;
			}
			return false;
		}

		
		public  boolean hasLeadingZero(String octet)
		{ // check if every split has leading zero or not.
			if (octet.length() > 1) {
				if (octet.charAt(0) == '0') {
					return true;
				}
			}
			return false;
		}
		
		

		void storeEachOctet(String S) {
			
			String[] parts=S.split("\\.");
			
			octet1=Integer.parseInt(parts[0]);
			octet2=Integer.parseInt(parts[1]);
			octet3=Integer.parseInt(parts[2]);
			octet4=Integer.parseInt(parts[3]);
			
			System.out.println("The IP is : "+octet1+"."+octet2+"."+octet3+"."+octet4);
			
		}
		
		

		public  int isValid(String s)
		{
			String[] parts = s.split("\\.");
			if (parts.length
				!= 4) { // if number of splitting element is not
						// 4 it is not a valid IP address
				return 0;
			}
			for (String part : parts) {
				if (hasLeadingZero(part)) {
					return 0;
				}
				if (part.length() == 0) {
					return 0;
				}
				try {
					int num = Integer.parseInt(part);
					if (!inRange(num)) {
						return 0;
					}
				}
				catch (NumberFormatException e) {
					return 0;
				}
			}
			storeEachOctet(s);
			return 1;
		}
		
		

}








