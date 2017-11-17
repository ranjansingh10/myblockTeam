package business_actions;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

import pageObject.ObjDashboard;
import pageObject.ObjMyDocmnt;
import pageObject.ObjTaxHistory;
import pageObject.ObjUploaddoc;
import utility.Constant_Class;

public class MydocumentAction {

	MyblockActions mblock;

	public MydocumentAction(MyblockActions myblockActions) {
		// TODO Auto-generated constructor stub
		this.mblock = myblockActions;
	}

	// Verify the My document Header text
	public void vrfyMydocheader() throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.txt_header);
		if (txt) {
			String val = mblock.Element(ObjMyDocmnt.txt_header).getText();
			if (val.equalsIgnoreCase("My Documents")) {
				mblock.ValidateTest(true, true, "My document Header Text is displayed correctly");
			} else {
				mblock.ValidateTest(false, true, "My document Header Text is displayed not correctly");
				Assert.assertFalse(true);
			}
		}

		else {
			mblock.ValidateTest(false, true, "My document Header is not displayed");
			Assert.assertFalse(true);
		}

	}

	// Verify the My document image(files ) text
	public void vrfyMydocBckImg() throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.img_mydoc);
		if (txt) {
			String val = mblock.Element(ObjMyDocmnt.img_mydoc).getCssValue("background-image");
			if (val.contains(Constant_Class.img_mydoc)) {
				mblock.ValidateTest(true, true, "My document Backround image(files) is displayed");
			} else {
				mblock.ValidateTest(false, true, "My document Backround image(files) is not displayed");
				Assert.assertFalse(true);
			}
		}

		else {
			mblock.ValidateTest(false, true, "My doc Header is not displayed");
			Assert.assertFalse(true);
		}

	}

	// Verify the My document year for 2016 as default
	public void vrfyDfltMydocYr2016() throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
		if (txt) {
			boolean val1 = mblock.ElementExists(ObjMyDocmnt.doc_year);

			String val = mblock.Element(ObjMyDocmnt.doc_year).getAttribute("innerText");

			if (val.contains(Constant_Class.tax_year)) {
				mblock.ValidateTest(true, true, "My document with 2017 as default year");
			} else {
				mblock.ValidateTest(false, true, "My document not with 2017 as default year");
				Assert.assertFalse(true);
			}
		}

		else {
			mblock.ValidateTest(false, true, "Tax year dropdown is not displayed");
			Assert.assertFalse(true);
		}

	}

	// Verify carousal is not display for the user
	public void vrfyCrsalNotDsply() throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
		if (txt) {
			mblock.ValidateTest(true, true, "Carousal is not displayed");
		}

		else {
			mblock.ValidateTest(false, true, "Carousal is displayed");
			Assert.assertFalse(true);
		}

	}

	// Verify the TY in My document is not present in Dropdown
	public void vrfyMydocYrNotDsply(String year) throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
		if (txt) {

			boolean val = mblock.Element(ObjMyDocmnt.drp_taxyear).ufxIsItemExistInDropdown(year);

			if (val == true) {
				mblock.ValidateTest(false, true, year + " is displayed");
			} else {
				mblock.ValidateTest(true, true, year + " is not displayed");

			}
		}

		else {
			mblock.ValidateTest(false, true, "Tax year dropdown is not displayed");
			Assert.assertFalse(true);
		}

	}

	// Click Tax year in my document from Dropdown
	public void clkMydocYrFrmDrpdwn(String year) throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
		if (txt) {
			mblock.Element(ObjMyDocmnt.drp_taxyear).ufxSelectFromDropdown("MY " + year + " DOCS");
			mblock.ElementExists(ObjDashboard.answr_col1, 5000); // Waiting
																	// purpose

			String val = mblock.Element(ObjMyDocmnt.doc_year).getAttribute("innerText");

			if (val.contains(year)) {
				mblock.ValidateTest(true, true, "User is successfully lands in TY" + year);
			} else {
				mblock.ValidateTest(false, true, "User is not successfully lands in TY" + year);
				Assert.assertFalse(true);
			}
		}

		else {
			mblock.ValidateTest(false, true, "Tax year dropdown is not displayed");
			Assert.assertFalse(true);
		}

	}

	// Upload the document
	public void clkMydocYrUpldDoc(String year) throws Exception {

		try {
			boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
			if (txt) {
				mblock.Element(ObjMyDocmnt.drp_taxyear).ufxSelectFromDropdown("MY " + year + " DOCS");
				mblock.ElementExists(ObjDashboard.answr_col1, 5000);

				String val = mblock.Element(ObjMyDocmnt.doc_year).getAttribute("innerText");

				if (val.contains(year)) {
					boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
					List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc)
							.findElements(ObjUploaddoc.count_doc1);
					int val01 = val1.size();
					mblock.Element(ObjUploaddoc.btn_adddoc).click();
					Thread.sleep(2000); // this line is only for waiting purpose
					Runtime.getRuntime().exec(Constant_Class.doc_uplScript);
					mblock.ElementExists(ObjDashboard.answr_col1, 8000);
					List<WebElement> val2 = mblock.Element(ObjUploaddoc.count_doc)
							.findElements(ObjUploaddoc.count_doc1);
					int val02 = val2.size();
					if (val02 > val01) {
						mblock.ValidateTest(true, true, "Document is uploaded for " + year);
					}

				}
			}

			else {
				mblock.ValidateTest(false, true, "My doc Drop down is not displayed");
				Assert.assertFalse(true);
			}
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	
	// verify the uploaded document position
		public void vrfyUpldDocPstn(String year) throws Exception {

			try {
				boolean txt = mblock.ElementExists(ObjMyDocmnt.drp_taxyear);
				if (txt) {
					mblock.Element(ObjMyDocmnt.drp_taxyear).ufxSelectFromDropdown("MY " + year + " DOCS");
					mblock.ElementExists(ObjDashboard.answr_col1, 5000);

					String val = mblock.Element(ObjMyDocmnt.doc_year).getAttribute("innerText");

					if (val.contains(year)) {
						boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
						List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc)
								.findElements(ObjUploaddoc.count_doc1);
						int val01 = val1.size();
						mblock.Element(ObjUploaddoc.btn_adddoc).click();
						Thread.sleep(2000); // this line is only for waiting purpose
						Runtime.getRuntime().exec(Constant_Class.doc_uplScript);
						mblock.ElementExists(ObjDashboard.answr_col1, 8000);
						List<WebElement> val2 = mblock.Element(ObjUploaddoc.count_doc)
								.findElements(ObjUploaddoc.count_doc1);
						int val02 = val2.size();
						if (val02 > val01) {
							String txt1 = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
							if(txt1.contains("test")){
								mblock.ValidateTest(true, true, "Document is displayed on the top of the list");	
							}
							
						}

					}
				}

				else {
					mblock.ValidateTest(false, true, "Document is not displayed on the top of the list");
					Assert.assertFalse(true);
				}
			}

			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	
	
	// Upload the document 10MB size
		public void clkMydocYrUpld0MB() throws Exception {

			try {

				boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
				List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val01 = val1.size();
				mblock.Element(ObjUploaddoc.btn_adddoc).click();
				Thread.sleep(2000); // this line is only for waiting purpose
				Runtime.getRuntime().exec("wscript" + " "+ System.getProperty("user.dir") + "\\resources\\File10MB.vbs");
				mblock.ElementExists(ObjDashboard.answr_col1, 8000);
				List<WebElement> val2 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val02 = val2.size();
				while(val02 <= val01){
					List<WebElement> val2_1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
					int val02_1 = val2_1.size();
					val02 = val02_1;
				}
				List<WebElement> val2_1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val02_1 = val2_1.size();
				if (val02_1 > val01) {
					mblock.ValidateTest(true, true, "Document is uploaded");
				}

				else {
					mblock.ValidateTest(false, true, "Document is not uploaded ");
					Assert.assertFalse(true);
				}
			}

			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	// Upload the document below 10MB size
	public void clkMydocYrUpldBlw10MB() throws Exception {

		try {

			boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
			List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
			int val01 = val1.size();
			mblock.Element(ObjUploaddoc.btn_adddoc).click();
			Thread.sleep(2000); // this line is only for waiting purpose
			Runtime.getRuntime().exec("wscript" + " "+ System.getProperty("user.dir") + "\\resources\\Below10MB.vbs");
			mblock.ElementExists(ObjDashboard.answr_col1, 8000);
			List<WebElement> val2 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
			int val02 = val2.size();
			while(val02 <= val01){
				List<WebElement> val2_1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val02_1 = val2_1.size();
				val02 = val02_1;
			}
			List<WebElement> val2_1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
			int val02_1 = val2_1.size();
			if (val02_1 > val01) {
				mblock.ValidateTest(true, true, "Document is uploaded");
			}

			else {
				mblock.ValidateTest(false, true, "Document is not uploaded ");
				Assert.assertFalse(true);
			}
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	
	// Upload the document above 10MB size
		public void clkMydocYrUpldAbv10MB() throws Exception {

			try {

				boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
				List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val01 = val1.size();
				mblock.Element(ObjUploaddoc.btn_adddoc).click();
				Thread.sleep(2000); // this line is only for waiting purpose
				Runtime.getRuntime().exec("wscript" + " "+ System.getProperty("user.dir") + "\\resources\\Above10MB.vbs");
				mblock.ElementExists(ObjDashboard.answr_col1, 5000);
				boolean err_msg = mblock.ElementExists(ObjMyDocmnt.err_msg, 5000);
				if (err_msg) {
					String msg = mblock.Element(ObjMyDocmnt.err_msg).getText();
					if(msg.equalsIgnoreCase("Uploaded files must be smaller than 10MB.")){
						mblock.ValidateTest(true, true, "Above 10 mb document is not uploaded");
					}
				}

				else {
					mblock.ValidateTest(false, true, "Error message is not displayed");
					Assert.assertFalse(true);
				}
			}

			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
		
		
	// Verify Add document button is present and '+' icon is not displayed
	public void vrfyAddDocmntBtn() throws Exception {

		boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
		if (btn) {
			mblock.ValidateTest(true, true, "Add document button is present and '+' icon is not displayed");
		} else {
			mblock.ValidateTest(false, true, "Add document button is not present and '+' icon is displayed");
		}

	}

	// Verify the verbiage content
	public void vrfyVerbiageTxt() throws Exception {

		boolean hdrtxt = mblock.ElementExists(ObjMyDocmnt.txt_hdr);
		if (hdrtxt) {
			String hdr = mblock.Element(ObjMyDocmnt.txt_hdr).getText();
			String lne1 = mblock.Element(ObjMyDocmnt.txt_lne1).getText();
			String lne2 = mblock.Element(ObjMyDocmnt.txt_lne2).getText();

			if (hdr.equalsIgnoreCase(Constant_Class.txt_hdr) && lne1.equalsIgnoreCase(Constant_Class.txt_lne1)
					&& lne2.contains(Constant_Class.txt_lne2)) {

				mblock.ValidateTest(true, true, "My document veribage content is displayed correctly");

			}

			else {
				mblock.ValidateTest(false, true, "My document veribage content is not displayed correctly");
			}

		} else {
			mblock.ValidateTest(false, true, "My document verpage text is not displayed");
		}

	}

	// Click Add document button

	public void clkAddDocmntBtn() throws Exception {

		boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
		if (btn) {
			mblock.Element(ObjUploaddoc.btn_adddoc).click();
			mblock.ElementExists(ObjDashboard.answr_col1, 2000);
			mblock.ValidateTest(true, true, "File explore is displayed");
		} else {
			mblock.ValidateTest(false, true, "Add document button is not displayed");
		}

	}

	// Click more button

	public void clkMoreBtn() throws Exception {

		List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
		int val01 = val1.size();
		if (val01 < 2) {
			mblock.Element(ObjUploaddoc.btn_adddoc).click();
			Thread.sleep(2000); // this line is only for waiting purpose
			Runtime.getRuntime().exec(Constant_Class.doc_uplScript);
			mblock.ElementExists(ObjDashboard.answr_col1, 8000);
		}
		boolean more = mblock.ElementExists(ObjMyDocmnt.lnk_more);
		if (more) {

			mblock.Element(ObjMyDocmnt.lnk_more).ufxClick();
			boolean edit = mblock.ElementExists(ObjMyDocmnt.lnk_edit);
			if (edit) {
				mblock.ElementExists(ObjDashboard.answr_col1, 3000);
			}

			else {
				mblock.ValidateTest(false, true, "Edit button is not displayed");
			}
		}

		else {
			mblock.ValidateTest(false, true, "More button is not displayed");
			Assert.assertFalse(true);
		}
	}

	// Click Edit option

	public void clkEditOptn() throws Exception {
		boolean more = mblock.ElementExists(ObjMyDocmnt.lnk_edit);
		if (more) {

			mblock.Element(ObjMyDocmnt.lnk_edit).ufxClick();
			boolean edit = mblock.ElementExists(ObjMyDocmnt.lnk_edit);
			if (edit) {
				mblock.ElementExists(ObjMyDocmnt.txt_flenme, 3000);
				mblock.ValidateTest(true, true, "Edit popup is displayed with edit options");

			}

			else {
				mblock.ValidateTest(false, true, "Edit button is not displayed");
			}
		}

		else {
			mblock.ValidateTest(false, true, "More button is not displayed");
			Assert.assertFalse(true);
		}
	}

	// Click Delete option

	public void clkDeleteOptn() throws Exception {
		boolean more = mblock.ElementExists(ObjMyDocmnt.lnk_delete);
		if (more) {
			List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
			int val01 = val1.size();
			String file = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
			mblock.Element(ObjMyDocmnt.lnk_delete).ufxClick();
			boolean del = mblock.ElementExists(ObjMyDocmnt.btn_ok);
			if (del) {
				String txt1 = mblock.Element(ObjMyDocmnt.txt_line1).getText();
				String txt2 = mblock.Element(ObjMyDocmnt.txt_line2).getText();
				if (txt1.equalsIgnoreCase("Are you sure you want to delete " + file + "?")
						&& txt2.equalsIgnoreCase(Constant_Class.txt_line2)) {
					mblock.ValidateTest(true, true, "delete popup is displayed with message");
					mblock.Element(ObjMyDocmnt.btn_ok).ufxClick();

				} else {

					mblock.ValidateTest(false, true, "delete popup is not displayed with correct message");
				}
				mblock.ElementExists(ObjDashboard.answr_col1, 5000);
				List<WebElement> val2 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val02 = val2.size();
				if (val02 < val01) {
					mblock.ValidateTest(true, true, "Document successfully deleted");
				}

				else {
					mblock.ValidateTest(false, true, "Document not deleted from the list");
				}

			}

			else {
				mblock.ValidateTest(false, true, "delete pop up is not displayed");
			}
		}

		else {
			mblock.ValidateTest(false, true, "delete button is not displayed");
			Assert.assertFalse(true);
		}
	}

	// Transfer the file
	public void clkEditBtnTrnsfrFile(String Year) throws Exception {

		boolean txt = mblock.ElementExists(ObjMyDocmnt.txt_filename);
		if (txt) {
			List<WebElement> val01 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
			int val_1 = val01.size();
			String file = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
			String trns_yr = mblock.Element(ObjMyDocmnt.doc_year).getAttribute("innerText");
			mblock.Element(ObjMyDocmnt.lnk_more).ufxClick();
			boolean edit = mblock.ElementExists(ObjMyDocmnt.lnk_edit);
			boolean view = mblock.ElementExists(ObjMyDocmnt.lnk_view);
			boolean del = mblock.ElementExists(ObjMyDocmnt.lnk_delete);
			if (edit && view && del) {
				mblock.ValidateTest(true, true, "VIEW,EDIT and DELETE menu options are displayed");
			}

			else {
				mblock.ValidateTest(false, true, "VIEW,EDIT and DELETE menu options are not displayed");
			}
			mblock.Element(ObjMyDocmnt.lnk_edit).ufxClick();
			mblock.ElementExists(ObjDashboard.answr_col1, 3000); // Waiting
																	// purpose
			mblock.objWebDriver.findElement(By.id("filenm")).click();
			mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.TAB, Keys.RETURN, Keys.RETURN);

			switch (Year) {
			case "2016":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.RETURN);

			case "2015":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.RETURN);

			case "2014":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN);

			case "2013":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN);

			case "2012":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN);

			case "2011":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.RETURN);

			case "2010":
				mblock.objWebDriver.findElement(By.id("filenm")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
						Keys.ARROW_DOWN, Keys.RETURN);

			default:
				break;
			}

			mblock.Element(ObjMyDocmnt.btn_save).ufxClick();

			mblock.ElementExists(ObjDashboard.answr_col1, 7000); // this line is
																	// only for
																	// waiting
																	// purpose
			String tbl_dsply = mblock.Element(ObjMyDocmnt.tble_cnt).getAttribute("style");
			if (tbl_dsply.contains("none")) {

				mblock.ValidateTest(true, true, "Document is transfered from " + trns_yr);
				mblock.Element(ObjMyDocmnt.drp_taxyear).ufxSelectFromDropdown("MY " + Year + " DOCS");
				mblock.ElementExists(ObjDashboard.answr_col1, 5000);
				mblock.ElementExists(ObjMyDocmnt.txt_filename, 5000);
				String file1 = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
				if (file.equalsIgnoreCase(file1)) {
					mblock.ElementExists(ObjDashboard.answr_col1, 5000);// waiting
																		// purpose
					mblock.ValidateTest(true, true, "Document is transfered to " + Year);
				}

				else {
					mblock.ValidateTest(false, true, "Document is not transfered");
				}

			} else {
				List<WebElement> val02 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
				int val_2 = val02.size();
				if (val_2 < val_1) {

					mblock.ValidateTest(true, true, "Document is transfered from " + trns_yr);
					mblock.Element(ObjMyDocmnt.drp_taxyear).ufxSelectFromDropdown("MY " + Year + " DOCS");
					mblock.ElementExists(ObjDashboard.answr_col1, 5000);
					mblock.ElementExists(ObjMyDocmnt.txt_filename, 5000);
					String file1 = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
					if (file.equalsIgnoreCase(file1)) {
						mblock.ElementExists(ObjDashboard.answr_col1, 5000);// waiting
																			// purpose
						mblock.ValidateTest(true, true, "Document is transfered to " + Year);
					}

					else {
						mblock.ValidateTest(false, true, "Document is not transfered");
					}

				} else {
					mblock.ValidateTest(false, true, "Document is not transfered");
					Assert.assertFalse(true);
				}

			}

		}

	}

	// Verify the Edit popup filed
	public void vrfyEditPopupFld() throws Exception {

		boolean trnsyr = mblock.ElementExists(ObjMyDocmnt.lnk_trnsfyear, 5000);
		boolean flenme = mblock.ElementExists(ObjMyDocmnt.txt_flenme, 5000);
		boolean catcry = mblock.ElementExists(ObjMyDocmnt.drp_catcry, 5000);
		if (trnsyr && flenme && catcry) {
			mblock.ValidateTest(true, true, "Filename,Category,tax year fileds are displayed");
		}

		else {
			mblock.ValidateTest(false, true, "Filename,Category,tax year fileds are not displayed");
			Assert.assertFalse(true);
		}

	}

	// Click on uploaded document and verify new windows is opened

	public void clkUpldDocVrfyNewWndwOpnd() throws Exception {

		boolean btn = mblock.ElementExists(ObjUploaddoc.btn_adddoc);
		List<WebElement> val1 = mblock.Element(ObjUploaddoc.count_doc).findElements(ObjUploaddoc.count_doc1);
		int val01 = val1.size();
		if (val01 < 2) {
			mblock.Element(ObjUploaddoc.btn_adddoc).click();
			Thread.sleep(2000); // this line is only for waiting purpose
			Runtime.getRuntime().exec(Constant_Class.doc_uplScript);
			mblock.ElementExists(ObjDashboard.answr_col1, 8000);
		}

		String txt = mblock.Element(ObjMyDocmnt.txt_filename).getAttribute("title");
		if (txt.isEmpty()) {
			mblock.Element(ObjUploaddoc.btn_adddoc).click();
			Thread.sleep(2000); // this line is only for waiting purpose
			Runtime.getRuntime().exec(Constant_Class.doc_uplScript);
			mblock.ElementExists(ObjDashboard.answr_col1, 8000);
		}
		mblock.ElementExists(ObjMyDocmnt.txt_filename, 7000);
		mblock.Element(ObjMyDocmnt.txt_filename).ufxClick();
		mblock.ElementExists(ObjDashboard.answr_col1, 5000);
		Set<String> window2 = mblock.objWebDriver.getWindowHandles();
		if (window2.size() == 2) {
			for (String window : window2) {
				mblock.objWebDriver.switchTo().window(window);
			}
			mblock.ValidateTest(true, true, "New window is opened");
		} else {
			mblock.ValidateTest(false, true, "New window is not opened");
			Assert.assertFalse(true);
		}

	}

	// Verify the TY in Tax history is not present in Dropdown
	public void vrfyTYyrNotDsply(String year) throws Exception {

		boolean txt = mblock.ElementExists(ObjTaxHistory.drp_taxyear);
		if (txt = true) {

			boolean val = mblock.Element(ObjTaxHistory.drp_taxyear).ufxIsItemExistInDropdown(year);

			if (val == true) {
				mblock.ValidateTest(false, true, year + " is displayed");
				Assert.assertFalse(true);
			} else {
				mblock.ValidateTest(true, true, year + " is not displayed");

			}
		}

		else {
			mblock.ValidateTest(false, true, "Tax year dropdown is not displayed");
			Assert.assertFalse(true);
		}

	}

}
