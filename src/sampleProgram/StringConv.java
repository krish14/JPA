
public class StringConv {
	public static void main(String[] args)
	{
		
		
		
		
		int[] intArray=new int[]{5,90,35,45,150,3};
		
		 int n = intArray.length;
         int temp = 0;
        
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                        
                         if(intArray[j-1] < intArray[j]){
                                 //swap the elements!
                                 temp = intArray[j-1];
                                 intArray[j-1] = intArray[j];
                                 intArray[j] = temp;
                         }
                        
                 }
         }
		
         
         for(int i=0; i < intArray.length; i++){
             System.out.print(intArray[i] + " ");
     }
		/*
		String A="A";
		String value="";


		try
		{
			//Integer B=Integer.parseInt(A);
			int number = 5681;
			int reversedNumber = 0;
			int temp = 0;

			while(number > 0){

				//use modulus operator to strip off the last digit
				temp = number%10;

				//create the reversed number
				reversedNumber = reversedNumber * 10 + temp;
				
				//System.out.println(reversedNumber);
				number = number/10;
          
				System.out.println(number);
			}

			int  P=10008;
			while (P>0)
			{
				
				P=P/10;
				
				System.out.println(P);
			}
			
			//output the reversed number
			System.out.println("Reversed Number is: " + reversedNumber);


			System.out.println((int)"A".charAt(0));

			value="vaule 44";
		}
		catch(NumberFormatException n)
		{
			value="AA";
		}

		System.out.println(value);

	*/}
}
