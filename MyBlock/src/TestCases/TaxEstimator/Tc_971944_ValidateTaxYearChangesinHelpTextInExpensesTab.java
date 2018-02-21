package TestCases.TaxEstimator;

import business_actions.MyblockActions;
import utility.Config;

public class Tc_971944_ValidateTaxYearChangesinHelpTextInExpensesTab {

	public static void main(String[] args) {
		try {
			
			// Configuration settings
						Config objConfig = new Config();
						MyblockActions mblock = new MyblockActions(objConfig.GetConfig());

						// Browser navigation
						mblock.NavigateToURL();

						// login with retail user
						mblock.actLogin.login();

						// Click Tax Estimator under Calculators and Taxes
						mblock.actTaxEstimator.clkTaxEstmrLnkFrmStusBar();

						// Entering basic detail of About you and click next
					//	mblock.actTaxEstimator.entrAboutDetailandClkNext();
						
						//Entering Detail of Income and Click next
					//	mblock.actTaxEstimator.entrincomeDetailandClkNext();
						
						//Verify the Expense tab heading text
					//	mblock.actTaxEstimator.vrfyHelpTextExpensTabforTY2016();
						
						//close the browser
						mblock.Finalize();

						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
