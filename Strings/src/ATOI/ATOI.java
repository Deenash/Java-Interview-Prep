package ATOI;

public class ATOI {
	
	public int atoi(String str) {
		if (str == null || str.length() < 1)
			return 0;
	 
		// trim white spaces
		str = str.trim(); //will remove white spaces after or before string
	 
		char flag = '+';
	 
		// check negative or positive integer
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';//if negative number(here string) then we will include - sign
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
	 
		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {//if we give a letter in input, it will be caught here .str.charAt(i) >= '0' && str.charAt(i) <= '9'
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
	 
		if (flag == '-')
			result = -result;
	 
		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
	 
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
	 
		return (int) result;//type casting
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATOI atoi = new ATOI();
		int ans = atoi.atoi("-567 ");
		System.out.println(ans);
		
		
		

	}

}
