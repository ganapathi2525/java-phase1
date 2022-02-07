package innerclass;

abstract class AnnonymousInner {
	public abstract void display();
	}

public class AnnonymousClass
	{
		
	public static void main(String[] args) {
			AnnonymousInner i = new AnnonymousInner() 
			{
	public void display() 
			         {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }

}
