package IODemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

public class FileInputOutputDemo1 
{
	@Test
	public void fileInputOutputTest() throws Throwable
	{//test write
		FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo2\\IODemo\\test1.txt");
		//FileInputStream fileinput = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\FrameWorkDemo2\\\\IODemo\\\\test2.txt");
		File file = new File("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo2\\IODemo\\test3.txt");
		System.out.println("Done");
	}
   
}
