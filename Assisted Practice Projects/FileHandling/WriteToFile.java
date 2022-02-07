package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
	 public static void main(String[] args) {  
	      
		    try {  
		        FileWriter fwrite = new FileWriter("C:\\Users\\Ganapathi\\Downloads\\FileCreation.txt");  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("Hello and Welcome to my World");   
		   
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Matter is successfully written to the file.");  
		    	} 
		    catch (IOException e) {  
		        System.out.println("Unexpected error occurred");  
		        e.printStackTrace();  
		        }  
		    }  

}
