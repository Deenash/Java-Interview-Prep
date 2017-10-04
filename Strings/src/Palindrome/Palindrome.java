package Palindrome;

public class Palindrome {
	public boolean palindrome(String str)
	{
		int i = 0;
		int j = str.length()-1;
		char[] str_array = str.toCharArray();
		while (i <=j)
		{
			if(str_array[i] == str_array[j])
			{
				i++;
				j--;
			}
			else
			{
				break;

			}
			return true;
		}


		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		boolean ans = palindrome.palindrome("civici");
		System.out.println(ans);



	}

}
