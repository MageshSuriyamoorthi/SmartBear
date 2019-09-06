package base;

import java.io.FileNotFoundException;
import java.io.IOException;



import util.Package.Helper;
import util.Package.ReadPropFile;

public class PageOneBase  {
	Helper help = new Helper();
	ReadPropFile read=new ReadPropFile();

	public void geturl1() throws FileNotFoundException {

		help.geturl(read.readPropertiesFile("locators.url"));
	}
		public void page1() throws FileNotFoundException, InterruptedException {
		help.ClickElement( read.readPropertiesFile("locators.products.button"));
		help.ClickElement( read.readPropertiesFile("locators.loadui.button"));
		help.ClickElement( read.readPropertiesFile("locators.freetrail.button"));
		help.entertext( read.readPropertiesFile("locators.firstname.text"),"AAA");
		help.entertext( read.readPropertiesFile("locators.lastname.text"), "BBB");
		help.entertext( read.readPropertiesFile("locators.email.text" ),"AAABBB@gmail.com");
		help.entertext( read.readPropertiesFile("locators.company.text"), "XYZ PVT Techonology");
		help.entertext( read.readPropertiesFile("locators.number.text"), "9999999999");
		help.ClickElement( read.readPropertiesFile("locators.startFreetrail"));
		
	}

}
