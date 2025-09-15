package Scripts;

import java.io.IOException;
import java.util.Properties;

import utilities.PropUtil;

public class propTest {

	public static void main(String[] args) throws IOException {

		Properties prop = PropUtil.readData("config.properties");
		System.out.println(prop.getProperty("APP_URL"));
		System.out.println(prop.getProperty("USERNAME"));
		System.out.println(prop.getProperty("PASSWORD"));
		
	}

}
