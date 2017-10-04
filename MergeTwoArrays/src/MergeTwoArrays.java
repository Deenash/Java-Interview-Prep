
public class MergeTwoArrays {
	
	public void merge(int [] A,int [] B)
	{
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeTwoArrays mta = new MergeTwoArrays();
		int [] A = new int[10];
		int [] B = new int[4];
		for (int i = 0; i<= A.length-1;i++)
		{
			A[i] = A[i]+1;
			System.out.println(A[i]);
		}
		
		for(int i = 0; i <= B.length-1;i++)
		{
			B[i] = B[i] + 1;
			System.out.println(B[i]);
		}
		

		//mta.merge(A, B);
		

	}
	
	
	int merge(int A[], int a, int B[], int b )
	{
	    int tot_Len = a + b - 1; // fill resulting array from the end
	    
	    while (b >= 0 && a >= 0)
	    
	        if (A[a] >= B[b])
	        {
	            A[tot_Len] = A[a];
	            --a;
	        }
	        else
	        {
	            A[ind] = B[b];
	            --b;
	        }
	        --totLen;
	    }


}
