package keywords;

public class ThrowsDemo {
	void Division() throws ArithmeticException
    {
        int a=45,b=0,c;
        c = a/b;
        System.out.print("\n\tThe result is : " + c);
    }

public static void main(String[] args)
    {
      ThrowsDemo T = new ThrowsDemo();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("\nCan't execute as there is error");
    }

}
