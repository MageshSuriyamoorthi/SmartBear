package util.Package;

import java.io.File;

public class Classpath {
	
	public static String Users_Home = System.getProperty("user.dir");

	
	public static String loc_file = Users_Home +File.separator+ "resource" + File.separator + "locators" + File.separator + "locators.properties";
	
}