package testScript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.GmailPage;

public class GmailTest extends BaseClass {

	GmailPage gmailPage;

	@Test(priority = 1, enabled = true)
	@Parameters(value = { "browser", "url" })
	public void gmailLogin() throws Exception {
		try {
		gmailPage = new GmailPage();
		gmailPage.gmailLogin("avnishc226@gmail.com","Chauhan@226"); //method for sending email and password credentials
		gmailPage.ComposeMail();// method for composing message and save it into draft section
		gmailPage.openDraftMailandSend("avnishc226@gmail.com"); // method for open draft mail and send to inbox after putting recipient mail 
		gmailPage.moveToInbox();// method for open the inbox
		Assert.assertTrue(gmailPage.verifyMailReceived(), "Mail received");//Damco Mail received
		gmailPage.openMain();
		Assert.assertTrue(gmailPage.verifySubject(), "subject verified");
		Assert.assertTrue(gmailPage.verifyMailBody(), "mail body verified");
		Assert.assertTrue(gmailPage.verifyAttachmentDownloaded(), "attachment downloaded successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
