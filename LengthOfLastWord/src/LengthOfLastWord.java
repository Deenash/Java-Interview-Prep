import java.util.ArrayList;
import java.util.List;


public class LengthOfLastWord {
	
	public String lastWord(String sentence){
		
		if(sentence.equals("")){
			return "";
		}
		
		List<String> words = new ArrayList<String>();
		
		String word = "";
		
		for(int i=0;i<sentence.length();i++){
			if(!(sentence.charAt(i) == ' ')){
				word = word + sentence.charAt(i);
				continue;
			}
			
			words.add(word);
			word="";
		}
		
		String lastword = words.get(0);
		
		for(int i = 1; i < words.size(); i++){
			if(words.get(i).length()>1)
				lastword = words.get(i);
		}
		
		return lastword;
	}

	public static void main(String[] args) {
		LengthOfLastWord lcd = new LengthOfLastWord();
		String ans = lcd.lastWord("How are yourSSS a a");
		System.out.println(ans);
		

	}

}
