package CaseCombinations;


	import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

	/**
	 * Assumption: the letters passed are all lowercase. If not, need additional checkings using isLowerCase()/isUpperCase()
	 *
	 */

	public class CaseCombinations {

	    public List convert(String s) {
	        LinkedList list = new LinkedList();
	        if(s.length() == 0 || s == null) return list;
	        if(s.length() == 1) {
	        list.add(s);
	        list.add(s.toUpperCase());
	        return list;
	        }
	        char c = s.charAt(0);
	        List returnList = convert(s.substring(1));
	        Iterator it = returnList.iterator();
	        String partial;
	        while(it.hasNext()) {
	            partial = (String) it.next();
	            list.add(c + partial);
	            if(Character.isLetter(c))
	                list.add(Character.toUpperCase(c) + partial);
	        }
	        return list;
	    }

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        CaseCombinations cc = new CaseCombinations();
	        List list = cc.convert("0ab");
	        System.out.println(list);
	    }

	}


