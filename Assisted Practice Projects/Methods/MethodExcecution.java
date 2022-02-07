package methods.com;

public class MethodExcecution {
	public int Addnumbers(int a,int b) 
	{
		int z=a+b;
		return z;
	}

public static void main(String[] args) 
	{
		MethodExcecution c = new MethodExcecution();
		int res= c.Addnumbers(12,13);
		System.out.println("Addition is:"+res);
	}

}
