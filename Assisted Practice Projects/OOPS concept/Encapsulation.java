package oopsconcepts;

public class Encapsulation {
	private String Name; 
	 private int Roll; 
	 private int Age;
	 
	  	public int getAge()  
	    { 
	      return Age; 
	    } 
	    public String getName()  
	    { 
	      return Name; 
	    } 
	    public int getRoll()  
	    { 
	       return Roll; 
	    } 
	    public void setAge( int newAge) 
	    { 
	      Age = newAge; 
	    } 
	    public void setName(String newName) 
	    { 
	      Name = newName; 
	    } 
	    public void setRoll( int newRoll)  
	    { 
	      Roll = newRoll; 
	    }    
	    
//Here we can only access in this class as it is PRIVATE type..If declared in other class it fails 
   public static void main (String[] args)  
   { 
       Encapsulation obj = new Encapsulation(); 
       obj.setName("Govind"); 
       obj.setAge(25); 
       obj.setRoll(61); 
       System.out.println("My name: " + obj.getName()); 
       System.out.println("My age: " + obj.getAge()); 
       System.out.println("My roll: " + obj.getRoll());      
   } 

}
