package TestCases.MyDocmnt;

import business_actions.MyblockActions;
import utility.Config;

public class TC_940233_MoveDocmntFrmTY2015ToTY2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Configuration settings
			Config objConfig = new Config();
			MyblockActions mblock = new MyblockActions(objConfig.GetConfig());

			// Browser navigation
			mblock.NavigateToURL();

			// login with retail user
			mblock.actCtracnt.crtacnt();

			// Click my document link from Global nav
			mblock.actGnrlNvgtn.clkMydocFrmGlobalNav();

			// Verify default year as 2016
			mblock.actMydoc.vrfyDfltMydocYr2016();

			// Upload the documnet for the mentioned year
			mblock.actMydoc.clkMydocYrUpldDoc("2015");

			// Transfer the file which upload in previous step to mentioned
			// below year
			mblock.actMydoc.clkEditBtnTrnsfrFile("2016");

			// Close the browser
			mblock.Finalize();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
