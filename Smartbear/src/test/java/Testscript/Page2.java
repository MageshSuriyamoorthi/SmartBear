package Testscript;

import org.testng.annotations.Test;

import base.PageTwoBase;

public class Page2 extends Page1 {
	PageTwoBase base = new PageTwoBase();
@Test(priority=2)
	public void test2() throws InterruptedException {
		base.cutpopup();
		base.contactsalesclick();
	}
}
