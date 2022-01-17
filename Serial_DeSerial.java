package core.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serial_DeSerial{
		public static void main(String args[])  
		  {
			Employe obj = new Employe("Dhana",101, 25,"Finance","Dhana@gmail",709523);
		    FileOutputStream fos= null;
		    ObjectOutputStream oos= null;
		    
		    try{ 
		      fos = new FileOutputStream("C://Users//Dhana//Desktop//eclipse//Phase_1//src//Emp.ser"); 
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(obj);
		      System.out.println("Serialzation Done!!");
		   }catch(IOException ioe){
		      System.out.println(ioe);
		  
		    }
	     
	     //Deserialization
	     Employe o=null;
	     try{
	       FileInputStream fis = new FileInputStream("C://Users//Dhana//Desktop//eclipse//Phase_1//src//Emp.ser");
	       ObjectInputStream ois = new ObjectInputStream(fis);
	       o = (Employe)ois.readObject();
	       ois.close();
	       fis.close();
	     }
	     catch(IOException ioe)
	     {
	        ioe.printStackTrace();
	        return;
	     }catch(ClassNotFoundException cnfe)
	      {
	        System.out.println("Employe Class is not found.");
	        cnfe.printStackTrace();
	        return;
	      }
	     System.out.println("Employe Name:"+o.getName());
	     System.out.println("Employe ID:"+o.getID());
	     System.out.println("Employe Age:"+o.getAge());
	     System.out.println("Employe Dept:"+o.getDept());
	     System.out.println("Employe Mail:"+o.getMail());
	     System.out.println("Employe Contact:"+o.getContact());
	  }
	}

	//------------------------------Student-------------------------//
	class Employe implements java.io.Serializable{
		  
		  private String Name;
		  private int ID;
		  private int Age;
		  private transient String Dept;
		  private String Mail;  
		  private transient int Contact;  //
		  
		  public Employe(String Name, int ID, int age, String Dept,String Mail, int Contact) {
		    this.Name = Name;
		    this.ID = ID;
		    this.Dept = Dept;
		    this.Mail = Mail;
		    this.Contact = Contact;
		  }
		  
		public String getName() {
		    return Name;
		  }
		  public int getID() {
		    return ID;
		  }
		  public int getAge() {
			    return Age;
		  }
		  public String getDept() {
		    return Dept;
		  }
		  public String getMail() {
		    return Mail;
		  }
		  public int getContact() {
		    return Contact;
		  }


	}
	
	


