package ReverseWordsInaString;

public class ReverseWordsInaString {
	
	public void reverseWordsInaString(String str)
	{
		int start_of_word = 0;
		int len = str.length();
		char[] str_array = str.toCharArray();
		for (int i = 0;i<len;i++)
		{
			if(str_array[i] == ' ' )
			{
				reverse(str_array,start_of_word,i-1);
				start_of_word = i+1;
			}
		}
		reverse(str_array,start_of_word,len-1);//This is because,the space after last word is
		//not there. So if you encounter last word u manually have to reverse it
		reverse(str_array,0,len-1);
		System.out.println(str_array);
		
	}
	
	public void reverse(char[] str, int start, int end) {
        while(start < end) {
            swap(str, start, end);
            start++;
            end--;
        }
    }
 
    public void swap(char[] str, int start, int end) {
        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInaString reverse = new ReverseWordsInaString();
		reverse.reverseWordsInaString("this is a string");
		
	}

}
