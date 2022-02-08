package oopsconcepts;

public class ClassObjConcept {
	String name; 
    String brand; 
    int cost; 
    String color; 
    
public ClassObjConcept(String name, String brand, int cost, String color) 
    { 
        this.name = name; 
        this.brand = brand; 
        this.cost = cost; 
        this.color = color; 
    } 
public String getName() 
    { 
        return name; 
    } 
public String getBrand() 
    { 
        return brand; 
    } 
public int getCost() 
    { 
        return cost; 
    } 
public String getColor() 
    { 
        return color; 
    } 
@Override
    public String toString() 
    { 
        return("Hi I'm Santosh and my car is "+ this.getName()+ ".\nIts brand,cost and color are " + this.getBrand()+", " + this.getCost()+ ","+ this.getColor() + "."); 
    } 
public static void main(String[] args) 
    { 
	    ClassObjConcept Hero = new ClassObjConcept("Hero","RangeRover",10000000, "Black"); 
        System.out.println(Hero.toString()); 
    } 

}
