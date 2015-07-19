public class VolatileTest {
    private static volatile boolean val = true;
    
    private static int count=0;
    
    
    public static void main(String[] args) {
        new VolatileTest().new First().start();
        new VolatileTest().new Second().start();
       
    }
    class First extends Thread {
        @Override
        public void run() {
            while (true){
            	if(val){
	            	System.out.println("Thread one is working.");
	            	count++;
	            	val=false;
            	}
       
            	
            }
        }
    }
    class Second extends Thread{
        @Override
        public void run() {
           while (true){
        	   if(!val){
        		   count++;
	        	   System.out.println("Thread two is working.");
	                try {
	                	
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) { e.printStackTrace(); }
	                val=true;
        	   } 
            }
        }
    }
}