package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public static Properties readData(String filename) throws IOException {
		Properties prop = new Properties();
		//Read properties from any specific file
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\config\\"+filename);
		
		//copy the data from file and store it into 'prop' variable
		prop.load(fis);;
		return prop;
		
		
	}

}
