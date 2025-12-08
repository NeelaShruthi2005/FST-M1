package Examples;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\HariCharanDharmapuri\\Documents\\Shruthi\\Files\\newfile.txt");
		System.out.println("File created successfully!");
		
		FileUtils.writeStringToFile(file, "Some text in a file", Charset.defaultCharset());
		
		System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF8"));
		
		 File destDir = new File("C:\\Users\\HariCharanDharmapuri\\Documents\\Shruthi\\Files1");
         FileUtils.copyFileToDirectory(file, destDir);

         File newFile = FileUtils.getFile(destDir, "newfile.txt");
         String newFileData = FileUtils.readFileToString(newFile, "UTF8");
         System.out.println("Data in new file: " + newFileData);
	}

}
