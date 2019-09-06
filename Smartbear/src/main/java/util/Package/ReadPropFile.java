package util.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropFile {
	
	public String readPropertiesFile(String elements) throws FileNotFoundException {
		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(Classpath.loc_file);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
}
