package core.programs;

public class Multiplecatchblock {
	public static void mainS(String[] args) {
		
	try{    
        int a[]=new int[5];    
        a[5]=30/0; 
        a[6]=9;                                                        
       }    
      catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }  
   
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs");  
          }    
   
       catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs");  
          }     
   finally{
	   System.out.println("rest of the code");
   }
   
           
}  
}  

