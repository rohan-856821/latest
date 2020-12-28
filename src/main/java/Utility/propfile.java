package Utility;


import java.util.*;
import java.io.*;

public class propfile {
	static Properties prop;
	static FileInputStream ip;
	public static Properties propertyfile() {
		try {
		ip = new FileInputStream("value.properties");
//(System.getProperty("user.dir") +"\\src\\main\\resources\\value.properties");("./src/main/resources/value.properties");
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
			System.out.println("Error in properties");
		e.printStackTrace();
	}
	  prop=new Properties();
	  try {
		prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return prop;
}
}
