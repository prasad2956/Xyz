package IODemo1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileDemo1 
{
	@Test
	public void fileTest() throws Throwable
	{
		File file = new File("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo2\\IODemo\\test3.txt");
		file.createNewFile();
		File file1 = new File("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo2\\IODemo\\abc");
		file1.mkdir();
		File file2 = new File("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo2\\IODemo\\x\\y\\z");
		file2.mkdirs();
		System.out.println("Done");
		
	}

}
