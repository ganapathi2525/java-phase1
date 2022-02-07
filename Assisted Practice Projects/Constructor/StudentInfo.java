package constructors;

public class StudentInfo {
	int id;
	String name;

	StudentInfo(int i,String n)
	{
	id=i;
	name=n;
	}
	
void display() 
	{
	System.out.println(id+" "+name);
	}

public static void main(String[] args) 
	{
	StudentInfo std1=new StudentInfo(17,"Arun");
	StudentInfo std2=new StudentInfo(68,"Teja");
	std1.display();
	std2.display();
	}

}
