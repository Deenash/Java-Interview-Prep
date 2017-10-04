package IsomorphicStrings;

import java.util.HashMap;

public class IsomorphicStrings {

	public boolean isomorphicStrings(String s,String t)
	{
		boolean flag = false;

		if(s == null && t == null)
		{
			return true;
		}
		if (s.length() != t.length())
		{
			return false;
		}

		HashMap<Character,Character> hm = new HashMap<Character,Character>();

		for(int i = 0; i < s.length();i++)
		{

			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			System.out.println(c1+"---"+c2);
			if(!(hm.containsKey(s.charAt(i))))
			{
				//System.out.println(c1+"-%%-"+c2);
				hm.put(c1, c2);
			}
			else
			{
				char c = hm.get(c1);
				//System.out.println(c+"-~--"+c2);
				if (c == c2)
				{
					//	System.out.println(c+"-~--"+c2);
					flag = true;
					

				}
				else
				{	
					flag = false;
					break;
				}

			}

		}
		return flag;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsomorphicStrings iso = new IsomorphicStrings();
		boolean ans = iso.isomorphicStrings("abbba", "vttvv");
		System.out.println(ans);


	}

}
