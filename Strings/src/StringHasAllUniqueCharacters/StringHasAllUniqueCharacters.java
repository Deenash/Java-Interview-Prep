package StringHasAllUniqueCharacters;

public class StringHasAllUniqueCharacters {
	
	public boolean allUnique(String str)
	{
		if(str.length() > 128)
		{
			return false;
		}
		boolean[] characters = new boolean[256];
		
		for (int i = 0;i<str.length();i++)
		{
			int value = str.charAt(i);
			
			if(characters[value] == true)
			{
				return false;
			}
			characters[value] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHasAllUniqueCharacters unique = new StringHasAllUniqueCharacters();
		boolean ans = unique.allUnique("shriam");
		System.out.println(ans);

	}

}
