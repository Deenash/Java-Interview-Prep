package CheckIfTwoStringsArePermutation;



public class CheckIfTwoStringsArePermutation {

	public boolean permutation(String s,String t)
	{
		if(s.length()!= t.length())
		{
			return false;
		}
		int [] letters = new int[256];
		
		char [] char_array = s.toCharArray();
		
		for (char c :char_array)
		{
			letters[c]++;
		}
		
		for(int i = 0; i < t.length();i++)
		{
			int value = t.charAt(i);
			if(--letters[value] < 0)
			{
				return false;
			}
		}
		
	return true;	
	}
	
public static void main(String[] args) {
		
	CheckIfTwoStringsArePermutation perm = new CheckIfTwoStringsArePermutation();
	boolean answer = perm.permutation("SHRIRAM", "SHRAMRI");
	System.out.println(answer);

	}

	
}
