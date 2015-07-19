
public class Feb {
public static void main(String args[])
{
	
	int A=0;
	
	int[] find = new int[9];
	
	for (int i=0;i<=8;i++)
	{
		A=A+i;
		System.out.println(A);
		
		find[i]=A;
	}
	
	System.out.println("find value"+find[3]);
	
	}
}
