package ReverseASentence;

public class ReverseASentence {
	
	public void reverse(char[] str, int start, int end) {
        while(start < end) {
            swap(str, start, end);
            start++;
            end--;
        }
        System.out.println(str);
    }
 
    public void swap(char[] str, int start, int end) {
        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseASentence reverse = new ReverseASentence();
		String str = "How are you";
		char[] str_array = str.toCharArray();
		int len = str_array.length;
		reverse.reverse(str_array,0,len-1);
		

	}

}
