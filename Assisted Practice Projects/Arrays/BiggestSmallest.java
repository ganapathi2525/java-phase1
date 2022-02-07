package arrays;

public class BiggestSmallest {
public static void main(String[] args) {
		
		int numb[]=new int[] {43,21,59,345,527,971,275};
		
		//Assigning first element of an array to Biggest&Smallest
		int Smallest=numb[0];
		int Biggest=numb[0];
		
		for(int i=1;i<numb.length;i++)
		{	
			if(numb[i]>Biggest)
				Biggest=numb[i];
			else if(numb[i]<Smallest)
				Smallest=numb[i];
		}
	System.out.println("Largest number is:" + Biggest);
	System.out.println("Smallest number is:" + Smallest);
	}

}
