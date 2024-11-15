package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

public class FileInputOutputDemo1 
{
	@Test
     public void funA() throws FileNotFoundException
     {
    	 FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\FrameWorkDemotest1.txt");
    	 System.out.println("Done");
     }
}
