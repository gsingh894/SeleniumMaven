package tests;

import org.testng.annotations.Test;

import Utility.ExcelDataConfig;
import baseclass.Baseclass;
import pages.FacebookAssignmentPage;

public class FacebookAssignmentTest extends Baseclass{
	
	FacebookAssignmentPage fbp;
	String[][] loginData, postFeedData;
	String FilePath = "src/test/resources/testData/Login_data.xlsx";
	
	@Test
	public void executeTestScenarios() throws Exception {
		fbp = new FacebookAssignmentPage(driver);
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = workingDirectory + "/" + FilePath; 
		ExcelDataConfig config = new ExcelDataConfig(absoluteFilePath);
		loginData = config.getDatafromExcel("Login", 0);
		fbp.loginTofacebook(loginData[0][0], loginData[0][1]);
		postFeedData = config.getDatafromExcel("PostFeed", 0);
		fbp.writePost(postFeedData[0][0]);
	}
}