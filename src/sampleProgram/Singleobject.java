import java.sql.SQLException;


public class Singleobject {

	private static Singleobject single=null;
	
	 static int x=5;
	
	public static Singleobject getsingle()
	{
	
		
			
			
			System.out.println("test");
			single=new Singleobject();
		
		
		return single;
	}
	
	public static void M4(int x)
	{
	//static	int y=0;
	x=x+x;	
	
	
	}
	

	public String M1()
	{
		
		return "success";
	}
	
	public static void main(String[] args)
	{
		
		
	 	M4(7);
		
	 	
	 	//for()
	 	{
	 		System.out.println("called");
	 	}
	 	
	 	
	 	
		System.out.println(x);
	}
    class A{  
        public  void msg() throws SQLException{System.out.println("Hello java");}  
        }  
          
        public class Simple extends A{  
          public void msg()  throws SQLException   {System.out.println("Hello java");}//C.T.Error  
       /*  public static void main(String args[]){  
           Simple obj=new Simple();  
           obj.msg();  
           }  */
        }  
	
}
