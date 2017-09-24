package TestCases.TaxHistory;

import business_actions.MyblockActions;
import utility.Config;

public class Tc_1015831_ValidateBannerInTaxHistoryForAOLUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Configuration settings
			Config objConfig = new Config();
			MyblockActions mblock = new MyblockActions(objConfig.GetConfig());

			// Browser navigation
			mblock.NavigateToURL();

			// login with AOL user
			mblock.actLogin.login();

			// click Tax history under My tax life in global navigation
			mblock.actGnrlNvgtn.clkTaxHstryFrmGlobalNav();

			//Verify the history banner
			mblock.actTaxhstry.vrfyTaxHstryBckImg();
			
			// Verify the Tax History header
			mblock.actTaxhstry.vrfyTaxheader();

			// close the browser
			mblock.Finalize();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
