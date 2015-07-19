import java.util.*;


public class Removedup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*List<Pojo> ll =new ArrayList<Pojo>();
		
		 ll.add(new Pojo("1","hari"));
		 ll.add(new Pojo("1","hari"));
         ll.add(new Pojo("2","jappan"));  
		
         List<Pojo> ll1=new ArrayList<Pojo>(new HashSet<Pojo>(ll));
         
         Iterator<Pojo> it=ll1.iterator();
         
         while(it.hasNext())
         {
        	 Pojo p=(Pojo)it.next();
        	 
        	 System.out.println(p.getA()+""+p.getB());
        	 
         */
		List ll =new ArrayList();
		
		 ll.add("hari");
		 ll.add("hari");
        ll.add("jappan");  
		
      
        
        ll.add("33");
       
      
        
        System.out.println(ll);
        
        List ll1=new ArrayList(new HashSet(ll));
        Collections.unmodifiableList(ll1);
        
        ll1.remove("33");
        
        Iterator it=ll1.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
       	 
       	 //System.out.println(p.getA()+""+p.getB());
       	 
        }
         
         
         
		
		
	}

}
