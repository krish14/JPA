
public class Testsingle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Singleobject sng=new Singleobject().getsingle();
		
		Singleobject sng1=new Singleobject().getsingle();
		
		Singleobject sng2=new Singleobject().getsingle();
		
		Singleobject sng3=new Singleobject().getsingle();
		
		System.out.println(sng.M1());
		
		
		//string pool
		String st="AAA";
		
		String ss2="AAA";
		
		//heap 
		String st1=new String("AAA");
		
		
		System.out.println(st.equals(st1));
		
/*		
		System.out.println(st==ss2);
		
		System.out.println(st.equals(st1));
		
		
		
		String ss="";
		int j=0;
		for(int i=st.length()-1;i>=0;i--)
		{
		       ss=ss+st.charAt(i);
		       if(st.charAt(i)=='B')
		       {
		    	   j++;
		       }
		       
		       System.out.println(st.charAt(i));
		}
		System.out.println(ss+"=="+j);
		
	}*/}

}
