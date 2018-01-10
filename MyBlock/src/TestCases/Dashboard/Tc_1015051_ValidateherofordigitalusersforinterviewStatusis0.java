package TestCases.Dashboard;

import business_actions.MyblockActions;
import utility.Config;

public class Tc_1015051_ValidateherofordigitalusersforinterviewStatusis0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Configuration settings
			Config objConfig = new Config();
			MyblockActions mblock = new MyblockActions(objConfig.GetConfig());

			// Browser navigation
			mblock.NavigateToURL();

			// login with digital user
			mblock.actLogin.login();

			// Verify Upload my document button is not displayed
			mblock.actDashboard.Digitalstart();
			// close the browser
			mblock.Finalize();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
