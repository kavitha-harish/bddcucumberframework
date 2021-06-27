package com.qa.util;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;



public class FileUtility {
	/*
	 * this method used to read data from properties
	 * returns the values based on key specified
	 * @para key
	 * @para return value
	 * @throws throwable
	 */
	
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file=new FileInputStream("data\\commondata.properties");
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
	
}
