package oopsconcepts;

public class ShapeTest {
	public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Blue", 3.2); 
        Shape s2 = new Rectangle("Orange", 4, 7);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 

}
