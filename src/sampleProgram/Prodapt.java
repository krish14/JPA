
public class Prodapt {
	public static void main(String args[])
	{

		System.out.println("a"+1);

		String t="a";

		int as=t.charAt(0)+1;

		System.out.println((char)(t.charAt(0)+1));

int[] a={1,5,4,2,9};


bubbleSort(a);



	}


	private static void bubbleSort(int[] intArray) {

		/*
		 * In bubble sort, we basically traverse the array from first
		 * to array_length - 1 position and compare the element with the next one.
		 * Element is swapped with the next element if the next element is greater.
		 *
		 * Bubble sort steps are as follows.
		 *
		 * 1. Compare array[0] & array[1]
		 * 2. If array[0] > array [1] swap it.
		 * 3. Compare array[1] & array[2]
		 * 4. If array[1] > array[2] swap it.
		 * ...
		 * 5. Compare array[n-1] & array[n]
		 * 6. if [n-1] > array[n] then swap it.
		 *
		 * After this step we will have largest element at the last index.
		 *
		 * Repeat the same steps for array[1] to array[n-1]
		 *  
		 */

		int n = intArray.length;
		int temp = 0;

		for(int i=0; i < n; i++){
			
		//System.out.println(i);
			int o=0;
			
			for(int j=1; j < (n-i); j++){

				 System.out.println(intArray[j-1]+""+">"+ intArray[j]);
				if(intArray[j-1] > intArray[j]){
					//swap the elements!
					temp = intArray[j-1];
					intArray[j-1] = intArray[j];
					intArray[j] = temp;
					
			o++;
				}

				//System.out.println("o-->"+o);
			}
		
		
		
			for(int k=0;k<n;k++)
			{
				
				for(int z=1;z<(n-k);z++)
				{
					
					if(intArray[z-1]>intArray[z])
					{
						temp=intArray[z-1];
						intArray[z-1]=intArray[z];
						intArray[z]=temp;
						
					}
					
				}
				
			}
			
			
		}

		//System.out.println(intArray);
		
		for(int k=0;k<intArray.length-1;k++)
		{
			
			//System.out.println(intArray[k]);
		}
		
	}
}



