package filehandling;
import java.io.File;
public class DeletingFile {
	public static void main(String[] args) {  
		
		File f0 = new File("C:\\Users\\Ganapathi\\Downloads\\FileCreation.txt");   
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	}

}
