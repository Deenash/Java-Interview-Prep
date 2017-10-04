package LongestCommonPrefix;

public class LongestCommonPrefix {

	public String getCommonString(String[] arr){

		char[] temp = arr[0].toCharArray();
		String result = "";

		for(int i=0;i<temp.length;i++)
		{
			boolean flag=true;

			for(int j=1; j < arr.length; j++){
				if(i >= arr[j].length()){//here you are checking if i i.e. length of the ith character 
					//in the temp array is greater than the min length of  elements of "j" array
					//for example length of Shr is 3. So when you compare Shridharannn the character 'i'
					//wil be in third index. But in Shr, the third index is null.
					//Wil result in exception. So i >= arr[j].length.
					// So for every iteration of j you wil find its size and check the above condition
					flag=false;
					break;
				}
				
				if( arr[j].charAt(i)== temp[i]  ){
					flag = true;
				}
				else{
					flag = false; //"Shridharannnnnn","Shriram","Shrikant","Shra","Shriniketh"
					break;
				}
			}

			if(flag==true){
				result = result + temp[i];
			}
			else
				break;
		}

		return result;

	}


	public static void main(String[] args) {

		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] arr = {"Shridharannnnnn","Shriram","Shrikant","Shr","Shriniketh"};
		
		String ans	=lcp.getCommonString(arr);
		System.out.println(ans);
		
//		String x = "Sumit Summation Summit Sum";
//		String[] arrA = x.split(" ");
//		lcp.findPrefix(arrA);
		
		

	}

}
