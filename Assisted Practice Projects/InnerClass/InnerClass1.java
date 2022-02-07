package innerclass;

public class InnerClass1 {
	private String info="We Have To Respect Elders"; 
	
	class Inner
		{  
		  void Ashish()
		  {System.out.println(info+",That is our Indian Culture");}  
		 }  
	public static void main(String[] args) 
		{
			InnerClass1 obj=new InnerClass1();
			InnerClass1.Inner in=obj.new Inner();  
			in.Ashish();  
		}

}
