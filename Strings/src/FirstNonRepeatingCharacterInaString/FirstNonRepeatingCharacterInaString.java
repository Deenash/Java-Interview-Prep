package FirstNonRepeatingCharacterInaString;

public class FirstNonRepeatingCharacterInaString {
	
	     
	    public char getFirstNonRepeatingCharacter(String string) {
	        if(string == null || string.length() == 0) {
	            return (Character) null;
	        }
	         
	        int n = string.length();
	        if(n == 1) {
	            return string.charAt(0);
	        }
	         
	        int[] charIdx = new int[256];   // Index of non repeating characters. If repeating, then index = -2
	        // Initialize character index of all characters to -1
	        for(int i = 0; i < 256; i++) {
	            charIdx[i] = -1;
	        }
	         
	        for(int i = 0; i < n; i++) {
	            if(charIdx[string.charAt(i)] == -1) {
	                // character seen first time
	                charIdx[string.charAt(i)] = i;//we are putting the index value so that we can find the smallest index to get first repeating character
	            } else {
	                // Repeated character
	                charIdx[string.charAt(i)] = -2;
	            }
	        }
	         
	        int minIdx = n; // Index of first non repeating character
	        for(int i = 0; i < 256; i++) {
	            if(charIdx[i] >= 0 && 
	                    minIdx > charIdx[i]) {
	                minIdx = charIdx[i];
	            }
	        }
	        return (minIdx >= 0 && minIdx < n) ? string.charAt(minIdx) : null;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonRepeatingCharacterInaString fnrc = new FirstNonRepeatingCharacterInaString();
		char ans = fnrc.getFirstNonRepeatingCharacter("ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB");
		System.out.println(ans);
		
		
		

	}

}
