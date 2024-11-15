package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

public class FileDemo 
{
	@Test
     public void funA() throws FileNotFoundException
     {
    	 FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo\\abc");
    	 
    	 System.out.println("Done");
     }
}
