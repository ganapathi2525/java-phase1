package innerclass;

public class InnerClass2 {
	private String data="Indian Culture";
	
	 void display()
	 {  
		 class Inner
		 {  
			 void Ashish()
			 {
				 System.out.println(data);
			 }  
		}  
	  
	  Inner in=new Inner();  
	  in.Ashish();  
	 }   
public static void main(String[] args) 
		{
	 InnerClass2  ob=new  InnerClass2 ();  
		ob.display();  
		}

}
