import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;


public class Tech {
public static void main(String[] args)
{
	
	System.out.println(null==null);
	
	
	System.out.println(M3());
	//M1(null);

	try
	{
		int x=4/0;
		//return 10;
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}



/*public static void M1(Integer s)
{
	System.out.println("Integer");
	
	}
*/
public static void M1(String s)
{
	
	String x=null;
	Integer n=null;
	
	System.out.println(x+n);
	System.out.println("String Null");
	
	}
/*public static void M1(Integer s)
{
	System.out.println("String Arithmatic");
	
	}
*/
public static void M1(Number s)
{
	System.out.println("String ");
	
	}
public static int M3()
{
try{
	return 10;
}	
catch (Exception e) {
	
	// TODO: handle exception
}
finally
{
	return 90;}
}


}
