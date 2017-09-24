package TestCases.Dashboard;

import business_actions.MyblockActions;
import utility.Config;

public class TC_1013815_POM_TPBioPage {
	public static void main(String[] args) {
		try {

			// Configuration settings
			Config objConfig = new Config();
			MyblockActions mblock = new MyblockActions(objConfig.GetConfig());
			
			

			// Browser navigation
			mblock.NavigateToURL();
			mblock.actLogin.login();
			
		
			mblock.actDashboard.Product_Services_Launch();
			mblock.actDashboard.POM_Launch();
			mblock.actDashboard.POM_ApptLink();
			mblock.actDashboard.POM_LetterFromAuthority();
			
			mblock.Finalize(true);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
