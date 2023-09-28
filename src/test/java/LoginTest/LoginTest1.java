package LoginTest;

//public class LoginTest1 {
	

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Home.P4_Home;
	import Login.P2_Mobno;
	import Login.P3_Password;
	import MyACC.P5_MyACC;
	import MyProfile.P6_MyProfile;
	import SignIn.P1_Login;
	import libraryFiles.BaseClass;
	import libraryFiles.UtilityClass;

	public class LoginTest1 extends BaseClass {

		
		P1_Login login;
		P2_Mobno mob;
		P3_Password pass;
		P4_Home home;
		P5_MyACC acc;
		P6_MyProfile profile;
		int TCID;
		

		@BeforeClass
		public void OpenBrowser() throws IOException
		{
			initializeBrowser();
			
			login=new P1_Login(driver);
			mob=new P2_Mobno(driver);
			pass=new P3_Password(driver);
			home=new P4_Home(driver);
			acc=new P5_MyACC(driver);
			profile=new P6_MyProfile(driver);
			
		}
		
		@BeforeMethod
		public void login() throws InterruptedException, EncryptedDocumentException, IOException
		{
			login.ClicOnSignInBtn();                              
			//Thread.sleep(3000);
			mob.EnterMOBno(UtilityClass.PropertyFileTD("UN"));
			mob.clickonSinginwithPWD();
			Thread.sleep(3000);

			pass.EnterPWD(UtilityClass.PropertyFileTD("PWD"));
			pass.PWDClickOnSignIn();
			Thread.sleep(3000);

		}
		
		@Test
		public void verifyname() throws EncryptedDocumentException, IOException
		{
			home.MoveToMyAcc();
			acc.ClickOnMyProfile();
			profile.SwitchtoWindow();
			String actname=profile.verifyname();
			String expname=UtilityClass.getTestData(1, 2);
			Assert.assertEquals(actname, expname,"Failed: both results are diff");
			
		}
		
		
		@AfterMethod
		public void name(ITestResult s1) throws IOException
		{
			TCID=101;
			
			if(s1.getStatus()==ITestResult.FAILURE)
			{
				UtilityClass.screenshotoffailTC(driver, TCID);
			}		
			
			
			
		}
		
		@AfterClass
		public void closebrowser()
		
		{
			driver.quit();
		
		}
		
		
	

	}

