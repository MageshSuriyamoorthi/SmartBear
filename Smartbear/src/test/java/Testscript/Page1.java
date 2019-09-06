package Testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageOneBase;
import util.Package.Helper;
import util.Package.utilityfiles;

public class Page1 {
	PageOneBase base = new PageOneBase();
	utilityfiles util = new utilityfiles();
	Helper help = new Helper();

	@BeforeTest
	public void setup() {
		util.BrowserSelect();
	}

	@Test(priority = 0)
	void page1() throws IOException, Exception {
		base.geturl1();
		help.maximize();
		base.page1();
		
		//help.closeDriver();
	}
}
