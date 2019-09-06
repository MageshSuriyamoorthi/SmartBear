package base;

public class PageTwoBase extends PageOneBase {
	public void cutpopup() throws InterruptedException {

		help.ClickElement("locators.close.popup");
	}

	public void contactsalesclick() throws InterruptedException {
		help.ClickElement("locators.contactsales.button");
		help.entertext("locators.firstname.text", "AAA");
		help.entertext("locators.lastname.text", "BBB");
		help.entertext("locators.email.text", "AAABBB@gmail.com");
		help.entertext("locators.compnay.text", "XYZ Techonologies");
		help.entertext("locators.number.text", "9999999999");
		help.ClickElement("locators.contactsales.button");
	}
}
