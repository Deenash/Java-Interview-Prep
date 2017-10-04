package MissingNumberFromGivenConsecutiveNumbers;

public class MissingNumber {

	//Find one missing number from given set of consecutive numbers from 1 to n
	//For example, if the given sequence is 1,2,4,5,6,7,8 then the missing number is 3. 
	//If the given sequence is 1,3,4,5 then the missing number is 2. 
	//For the input 2,3,4,5 output returned should be 1 as it is the missing number.

	public int missingNumber(int [] arr,int start, int end)
	{
		while(start<end)
		{
			int mid = (start + end)/2;

			if(arr[mid-1] == mid)
			{
				start = mid + 1;   //search right
			}

			else
			{

				if ( arr[mid - 1 -1] == mid -1)
				{
					return mid;
				}

				else{

					end = mid - 1;//search left

				}

			}

		}

		return 0;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber ms = new MissingNumber();

		int [] input_array = {1,2,4,5,6,7,8};
		int length = input_array.length;

		int ans = ms.missingNumber(input_array,0,length-1);
		System.out.println(ans);



	}

}
