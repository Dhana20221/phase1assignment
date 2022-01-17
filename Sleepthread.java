package core.programs;

public class Sleepthread extends Thread{
	public void run(){  
		  for(int i=1;i<3;i++){  
		    try{
		    		Thread.sleep(2000);  
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
		 }  
		 
		 public static void main(String args[]){  
		  Sleepthread t1=new Sleepthread();  
		  t1.setName("IT");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  Sleepthread t2=new Sleepthread();  
		  t2.setName("FINANCE");
		  
		  Sleepthread t3=new Sleepthread(); 
		  t3.setName("HR");
		  
		   
		  t1.start();  
		  t2.start(); 
		  t3.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());
		 }  

}

