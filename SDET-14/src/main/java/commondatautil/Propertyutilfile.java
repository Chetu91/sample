package commondatautil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyutilfile {
	

	public String readDataFromPropertyFfile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}