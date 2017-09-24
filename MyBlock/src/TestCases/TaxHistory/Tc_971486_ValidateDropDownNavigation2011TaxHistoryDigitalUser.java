package TestCases.TaxHistory;

import business_actions.MyblockActions;
import utility.Config;

public class Tc_971486_ValidateDropDownNavigation2011TaxHistoryDigitalUser {

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
			
			//click Tax history under My tax life
			mblock.actGnrlNvgtn.clkTaxHstryFrmGlobalNav();
			
			//Verify the tax history year with 2016 as default
			mblock.actTaxhstry.vrfyDfltTaxhstryYr2016();
			
			//Choose Tax History year as 2011 from dropdown
			mblock.actTaxhstry.clkTaxhstryYrFrmDrpdwn("2011");
			
			//click Tax return doc and verify new window is opened
			mblock.actTaxhstry.clkRtrnDocDgtlUsr();
			
			// close the browser
			mblock.Finalize();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
