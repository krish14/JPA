package sampleProgram;
	 
	import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
	 
	public class Delete {
	 
	    public Delete(String path) {
	    	try
	    	{
	    	URL urlImage = new URL(path);
	        BufferedImage image = ImageIO.read(urlImage);
	        String imageName = urlImage.getFile().split("/")[1];
System.out.println(imageName);
	        File file = new File(path);
	        if(file.exists())
	        {
	            do{
	                delete(file);
	            }while(file.exists());
	        }else
	        {
	            System.out.println("File or Folder not found : "+path);
	        }
	    	}catch (Exception e) {
				// TODO: handle exception
	    		e.printStackTrace();
			}
	         
	    }
	    public static void main(String args[])
	    {
	        Delete dff = new Delete("http://www.sndynamics.tk/index.html");
	         
	        Map m=new HashMap();
	        
	        m.put(1, "A");
	        m.put(2, "B");
	        
	        Iterator it=m.entrySet().iterator();
          
	        while(it.hasNext())
	        {
	        	Map.Entry v=(Map.Entry)it.next();
	        	
	        	System.out.println(v.getKey()+""+v.getValue());
	        	
	        }
	         
	        
	        
	    }
	    
	    private void delete(File file)
	    {
	        if(file.isDirectory())
	        {
	            String fileList[] = file.list();
	            if(fileList.length == 0)
	            {
	                System.out.println("Deleting Directory : "+file.getPath());
	                file.delete();              
	            }else
	            {
	                int size = fileList.length;
	                for(int i = 0 ; i < size ; i++)
	                {
	                    String fileName = fileList[i];
	                    System.out.println("File path : "+file.getPath()+" and name :"+fileName);
	                    String fullPath = file.getPath()+"/"+fileName;
	                    File fileOrFolder = new File(fullPath);
	                    System.out.println("Full Path :"+fileOrFolder.getPath());
	                    delete(fileOrFolder);
	                }
 	            }
	        }else
	        {
	            System.out.println("Deleting file : "+file.getPath());
	            file.delete();
	        }
	    }
	}

