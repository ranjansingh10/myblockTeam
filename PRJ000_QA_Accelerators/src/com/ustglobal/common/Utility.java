package com.ustglobal.common;
import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.xml.sax.InputSource;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.ustglobal.common.Utility.ConfigData.PROPERTY_FILETYPES;



public class Utility {
	static int nIndexStatistics = 0;
	
	public static void main(String[] args) throws Exception {
		
		//String sTest = Utility.RegExpExtract("An interstingly long sentence of maximum descriptiveness", "^((?:\\S+\\s+){3}\\S+).*");
		//String sTest = Utility.RegExpExtract("Short step", "^((?:\\S+\\s+){3}\\S+).*");
		//System.out.println(sTest.length());
		
		//System.out.println(BaseColor.MAGENTA.hashCode());
		
		//Utility.sendMail("Tech-at-Block <Tech-at-Block@ust-global.com>", "padmakumar.nair@ust-global.com; gr.padmakumar@hrblock.com", "Automated test report", "This is an automated email. Please do not reply back", "C:\\Windows\\iis7.log");

		
		/*Date d1 = new Date();
		
		String sCurrentTestReportName = "Debug.pdf";
		//String sSharedReportFolder = "\\\\172.20.2.198\\c\\MobileTestAutomation\\SharedTestReports\\";
		String sSharedReportFolder = "C:\\SeeTestReports\\";
		
		CustomReporter Reporter = new CustomReporter ("Test Case Name, Regression cycle", sSharedReportFolder+sCurrentTestReportName);
		
		Date d2 = new Date();
		
		Reporter.Log("hrblock.com page", "This is the initial launch page. Sign In button on top right corner",
					"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\25.PNG");
		
		Reporter.Log("Login page", "Expecting a login page. License agreement banner displayed",
				"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\26.PNG");
		
		Reporter.Log("Confirm identity page[FONT:Bold]", "Extra security question validation page",
				"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\27.PNG");
		
		Reporter.Log("Just Testing horizontal", "Expecting a login page. License agreement banner displayed",
				"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\28.PNG");
		
		Reporter.Log("Just testing vertical[FONT:Italic]", "Extra security question validation page",
				"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\29.PNG");
		
		Reporter.Log("Final page[FONT:Bold]", "Final page",
				"C:\\Users\\x109449\\AppData\\Roaming\\seetest\\rundata\\8889_TEST\\30.PNG");
		
		Date d3 = new Date();
		
		Reporter.AddToSummary("Device", "iPhone");
		Reporter.AddToSummary("OS", "iOS");
		Reporter.Finalize();
		
		Date d4 = new Date();
		
		System.out.println("Initializing time (millis): " + (d2.getTime()-d1.getTime()));
		System.out.println("Reporting time (millis): " + (d3.getTime()-d2.getTime())/5);
		System.out.println("Finalizing time (millis): " + (d4.getTime()-d3.getTime()));
		*/
		
		//KillAllBrowsers();
		//DesktopMsgBox("Browser type: " + SUtility.RegExpExtract("IE x 10.3", "[A-z]*"));
		
		/*System.out.println(QueryFromXML(
				"<resp><status>Success</status><msg>Testing</msg></resp>", 
				"/resp/status"));
		*/
		
		//TestFileMetadata("C:\\TestReport_ExampleJUnitTestCase[1]_04-11-2016_11.22.08.pdf");
		
		/*String str[]={"some","again"};
		DisplaySystemTrayMenu((DisplaySystemTrayMenu_FinalizeClass)str);*/
		
		//System.out.println(GetUniqueNumber());
		//ScaleImageFile("C:\\Users\\u11501\\Desktop\\screenshot3.png",0,380);
		
		//Utility.PrintFileMetadata("\\\\g884DTRV\\Common folder\\Sample PDF Reports\\TC_MyBlock_EmeraldCard_ViewCardBalance[18]_09-21-2016_04.21.25[PASS].pdf");
		
	}	
	
	
	public static void KillAllBrowsers() throws Exception {
		String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			Runtime.getRuntime().exec("taskkill /F /IM conehost.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
			Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
			Runtime.getRuntime().exec("taskkill /F /IM safari.exe");
			Runtime.getRuntime().exec("taskkill /F /IM opera.exe");		
			Runtime.getRuntime().exec("taskkill /F /IM operadriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} else {
			Runtime.getRuntime().exec("kill `ps -ef | grep -i firefox | grep -v grep | awk '{print $2}'`");
			Runtime.getRuntime().exec("kill `ps -ef | grep -i chrome | grep -v grep | awk '{print $2}'`");
			Runtime.getRuntime().exec("kill `ps -ef | grep -i safari | grep -v grep | awk '{print $2}'`");
		}
	}
	
	public static String ConvertUnicodeToNormal(String zawgyi) throws Exception{
		//return URLDecoder.decode(str, "UTF-8");
		//return str.replaceAll("%20", " ");
		//return str.replaceAll("\\u0020'", " ");		
	    String output = "";
	    char[] charArray = zawgyi.toCharArray();

	    for (int i = 0; i < charArray.length; i++) {
	        char a = charArray[i];
	        if (a > 255) {
	            output += "\\u" + Integer.toHexString(a) + "--";
	        } else {
	            output += a;
	        }
	    }       
	    return output;
	}	
	
	public static void MessageBox( final String strMessage) throws Exception{
    	java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	JFrame frmOpt = new JFrame();
        frmOpt.setVisible(false);
        frmOpt.setLocation(screenSize.width/2, screenSize.height/2);
        frmOpt.setAlwaysOnTop(true);
        String strHtml = "<html><body width='300'>"+
            "<h2>Selenium Interface</h2>" +
            "<p>" + strMessage.replaceAll("\n","<br>") + "<br><br><p>DLQAAutomationteam.hrblock.com";
        JOptionPane.showMessageDialog(frmOpt, strHtml);  
        frmOpt.dispose();
	}
	
	public static Dimension GetScreenSize(){
		return Toolkit.getDefaultToolkit().getScreenSize(); //returns java.awt.Dimension object
	}
	
	public static interface FinalizableInterface { //this is the interface declaration	
		public void Finalize(String strFinalStatus) throws Exception;
	}
	
	public static void CreateFolder(String strPathOfDirectory, boolean boolDeleteExistingFiles){
		File files = new File(strPathOfDirectory);
		if (!files.exists()) {
			if (files.mkdirs()) { //Create a directory and all its sub-directories "/Sub1" and /Sub1/Sub2" together
				System.out.println("SUtility.CreateFolder() - Multiple directories are created!");
			} else {
				System.out.println("SUtility.CreateFolder() - Failed to create multiple directories!");
			}
		}
	}	
	
	//Added by Anil
	public static boolean IsFileOrFolderExist(String sPath){
		if (sPath==null) return false;
		try{
			return Files.exists(Paths.get(sPath));
		}
		catch(Exception e){
			return false;
		}
	}
	
	public static void DeleteFile(String strFilePath){
		File file = new File(strFilePath);	
		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}   
	}
	
	public static String RegExpExtract(String sSource, String sPattern){
		Pattern p = Pattern.compile(sPattern);
		Matcher m = p.matcher(sSource);
		if (m.find()) {
			return m.group(m.groupCount());
			//return ((m.groupCount()>1)?m.group(1):m.group(0));			
		}		
		return "";		
	}
	
	public static int GetRandomNumber(int nMin, int nMax){
		return new java.util.Random().nextInt(nMax-nMin) + nMin;
	}
	
	public static String GetRandomNumber(int iLength) {
		 return RandomStringUtils.randomNumeric(iLength);
	}
	
	public static String GetUniqueNumber(){
		String sTimeStamp = (++nIndexStatistics) + new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		return sTimeStamp;
	}
	
	public static String GetUniqueTestNameIdentifier(ITestContext context){		
		  String sTimeStamp = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss").format(new Date());
		  String sIterationCount = "" + (1+context.getCurrentXmlTest().getIndex()); 
		  String sTestName = context.getCurrentXmlTest().getName().replaceAll("[^a-zA-Z0-9 ]", ".");
		  return (sTestName+"."+sIterationCount+"iter."+sTimeStamp);
	}
	
	public static String GetUniqueTestNameIdentifier(){	
		String sTestName = "";
		try
		{
			throw new Exception("Who called me?");
		}
		catch( Exception e )
		{
			for (StackTraceElement eleStackTrace : e.getStackTrace()) {	    		
				//System.out.println("I was called by " + eleStackTrace.getFileName());
				if (eleStackTrace.getFileName()==null){
					break;
				}
				if (eleStackTrace.getFileName().equals("NativeMethodAccessorImpl.java")) {
					break;
				}
				sTestName = eleStackTrace.getFileName(); //Take the one just before NativeMethodAccessorImpl
			}
		}		
		nIndexStatistics = nIndexStatistics + 1;		
		String sTimeStamp = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss").format(new Date());
		return (sTestName.replace(".java", "") + "["+nIndexStatistics+"]_"+sTimeStamp);
	}
	
	public static String GetTestCaseClassName(){
		String sTestCaseClassName = "undefined";
		StackTraceElement[] arrEx = new Exception().getStackTrace();
		for (int i=0; i <arrEx.length; i++){
			if(arrEx[i].toString().contains(".main")){
				sTestCaseClassName=arrEx[i].toString().split("\\(")[arrEx[i].toString().split("\\(").length-2];
			}
		}
		return sTestCaseClassName;
	}
	
	/* static boolean CheckStackTrace(String strPatternToDetect){
		for (StackTraceElement eleStackTrace : Thread.currentThread().getStackTrace()) {
			System.out.println("STACKTRACE:" + eleStackTrace.toString());
			if(eleStackTrace.toString().contains(strPatternToDetect)){
				return true;
			}
		}
		return false;
	}*/
	public static String GetStackTrace(Thread objThread){
		String strReturnValue = "";
		for (StackTraceElement eleStackTrace : ((objThread==null)?Thread.currentThread():objThread).getStackTrace()) {
			strReturnValue = strReturnValue + eleStackTrace.toString() + "\r\n";
		}		
		return strReturnValue;
	}
	
	public static class CustomReporter{
		private Document document;
		private PdfWriter writer;
		private PdfReader reader;
		private PdfStamper stamper;
		private ArrayList<HashMap<String, Object>> arraylistBookmark = new ArrayList<HashMap<String, Object>>();	 
		private LinkedHashMap<String, String> summaryItems = new LinkedHashMap<String, String>();
		private LinkedHashMap<String, String> listMetadata = new LinkedHashMap<String, String>();
		public boolean boolDeletePNGs = false;
		public int nTimeoutImageFile = 3000;
		public int nTableCellPadding = 2;
		public float nImageScalePercentage = 100; //A value outside the range 0<x<100 implies original size (no scaling, no compression)
		public int nPieChartSize = 100;
		public String sCustomReportDataPropertiesFile="CustomReportData";
		
		private int nIndexBookmark = 0;
		private int nCountSuccess=0;
		public  int nCountFailure=0;
		
		private int nPageCount=0;
		private String sPathPDF = null;
		private String sPathPDFTemp = null;
		private float nPositionSummaryTable = 0;
		private float nLeftMargin = 0;
		private float nPageWidth = 0;
		private BaseColor colorTheme = new BaseColor(230,250,220); //red,green,blue	
		private long nThreadIDConstruction = 0;
		final HashMap<String, BaseColor> hashmapBaseColor = new HashMap<String, BaseColor>() {{
		    put("RED",BaseColor.RED);
		    put("GREEN",BaseColor.GREEN);
		    put("DARK_GREEN",BaseColor.GREEN.darker());//Custom added
		    put("BLUE",BaseColor.BLUE);
		    put("BLACK",BaseColor.BLACK);
		    put("CYAN",BaseColor.CYAN);
		    put("DARK_GRAY",BaseColor.DARK_GRAY);
		    put("GRAY",BaseColor.GRAY);
		    put("LIGHT_GRAY",BaseColor.LIGHT_GRAY);
		    put("MAGENTA",BaseColor.MAGENTA);
		    put("ORANGE",BaseColor.ORANGE);
		    put("ORANGE",BaseColor.ORANGE);
		    put("PINK",BaseColor.PINK);
		    put("WHITE",BaseColor.WHITE);
		    put("YELLOW",BaseColor.YELLOW);
		}};
		public Date date = new Date();
		public long lStartTime;
		public long lEndTime;
		
		public CustomReporter(String sTestDetails, String sPathPDF) throws Exception{ //init on construct			
			nThreadIDConstruction = Thread.currentThread().getId();
			BatchRunner.mapThreadsMonitor.put("THREAD_ID" + nThreadIDConstruction + "_TEST_STATUS", ""); //This is an access point for BatchRunner to the test report
			lStartTime=date.getTime();
			
			this.sPathPDF = sPathPDF;
			this.sPathPDFTemp = sPathPDF+".tmp";
			Document.compress = true;
			document = new Document();
			writer = PdfWriter.getInstance(document, new FileOutputStream(sPathPDFTemp));			
			
	        document.open();
	        nLeftMargin = document.leftMargin(); 
	        nPageWidth = document.getPageSize().getWidth() - document.rightMargin() - document.leftMargin();
	        nPositionSummaryTable = writer.getVerticalPosition(true);
	        
	        PdfPTable objTable = new PdfPTable(1);
	        objTable.getDefaultCell().setPadding(nTableCellPadding);
	        objTable.addCell(MakeBookmark("Test summary", "Test summary", "BOLD", BaseColor.BLACK));
	        objTable.getRow(0).getCells()[0].setBackgroundColor(colorTheme);
	        objTable.addCell(sTestDetails);
	        String sPathIMG =  URLDecoder.decode(CustomReporter.class.getResource("/images/Logo.jpg").getPath(), "UTF-8");
	        objTable.addCell(Image.getInstance(sPathIMG));
	        objTable.addCell("Executed by: " + System.getProperty("user.name"));	        
	        	        
	        objTable.setTotalWidth(nPageWidth);
	        objTable.writeSelectedRows(0, objTable.getRows().size(), nLeftMargin, nPositionSummaryTable, writer.getDirectContent());
	        nPositionSummaryTable = nPositionSummaryTable - objTable.getTotalHeight() - 10;
	        objTable = null;
	        
	        document.newPage();	          
		}
		
		public void Log (String sStepDesc) throws Exception {			
			Log(sStepDesc, sStepDesc);
		}
		
		public void Log (String sStepName, String sStepDesc) throws Exception {
			Log(sStepName,sStepDesc,null);
		}
		
		public void Log (String sStepName, String sStepDesc, String sPathIMG) throws Exception{
			
			String strColor = "BLACK", strFontStyle = "Normal"; //Default styles
			BaseColor objColor = hashmapBaseColor.get(strColor.trim().toUpperCase()); 
			if(Pattern.compile("\\[COLOR:(.*?)\\]|\\[FONT:(.*?)\\]").matcher(sStepName).find()){ //Check if any format specifier exist
				Matcher objFontSpecMatcher = Pattern.compile("\\[COLOR:(.*?)\\]").matcher(sStepName);
				if(objFontSpecMatcher.find()){
					strColor = objFontSpecMatcher.group(1);			
					sStepName = objFontSpecMatcher.replaceAll("");
					objColor = hashmapBaseColor.get(strColor.trim().toUpperCase());
					if(objColor==null){
						objColor = BaseColor.BLACK;
					}
				}
				objFontSpecMatcher = Pattern.compile("\\[FONT:(.*?)\\]").matcher(sStepName);
				if(objFontSpecMatcher.find()){
					strFontStyle = objFontSpecMatcher.group(1);
					sStepName = objFontSpecMatcher.replaceAll("");
				}
				//Specifications in description are ignored (stripped off)
				objFontSpecMatcher = Pattern.compile("\\[COLOR:(.*?)\\]|\\[FONT:(.*?)\\]").matcher(sStepDesc);			
				if(objFontSpecMatcher.find()){
					sStepDesc = objFontSpecMatcher.replaceAll("");
				}
			}
			
			PdfPTable objTable = new PdfPTable(1); 
			objTable.setSplitLate(false);
			objTable.setSplitRows(false);		
			objTable.setKeepTogether(true);
	        objTable.getDefaultCell().setPadding(nTableCellPadding);
	        
	        String sStepNameForBookmark = sStepName;
			if(sStepName.equals(sStepDesc)){
				sStepNameForBookmark = Utility.RegExpExtract(sStepName, "^((?:\\S+\\s+){3}\\S+).*"); //Match first 4 words alone
				if(sStepNameForBookmark.length() > 0){ //Has text with greater than or equal to 4 words
					if(sStepName.length() > sStepNameForBookmark.length()){
						sStepNameForBookmark = sStepNameForBookmark + " ...";
					}
				}
				else { //Reassign, since the regexp returns empty string if the text has less than 4 words
					sStepNameForBookmark = sStepName;
				}
			}
			objTable.addCell(MakeBookmark(sStepNameForBookmark,sStepName,strFontStyle,objColor));
			objTable.getRow(0).getCells()[0].setBackgroundColor(colorTheme);
			
			if(!sStepName.equals(sStepDesc)){
				Font font=new Font();
				font.setColor(objColor);
				//font.setStyle(strFontStyle); //This is not working - perhaps font.setStyle("BOLD") does not, but font.setStyle(Font.BOLD) works
				objTable.addCell(new Phrase(sStepDesc,font));
			}
			
			if(sPathIMG!=null){
		        File file = new File(sPathIMG);
		        int nTimeCheck = 0; //milliseconds
		        while(!file.exists()&&((nTimeCheck+=500) < nTimeoutImageFile)){	        	
		        	Thread.sleep(500);
		        }
		        if(file.exists()){
		        	if(nImageScalePercentage<0 || nImageScalePercentage >100){ //No scaling or compression
		        		objTable.addCell(Image.getInstance(sPathIMG));
		        	}
		        	else{ //Scale the image and also convert to compressed format
		        		try{
			        		sPathIMG = ScaleDownImageFile(sPathIMG, nImageScalePercentage);
			        		PdfPCell oCell = new PdfPCell();
			        		Image objImage = Image.getInstance(sPathIMG);
			        		objImage.scalePercent(nImageScalePercentage);			        		
			        		objImage.setScaleToFitHeight(false);
			        		objImage.setAlignment(Element.ALIGN_CENTER);
			        		oCell.addElement(objImage);		        		
				        	oCell.setPadding(nTableCellPadding);
				        	oCell.setGrayFill(0.5f);
				        	objTable.addCell(oCell);
				        	objImage = null;
				        	oCell = null;
				        	new File(sPathIMG).delete();
		        		}
		        		catch(Exception e){
		        			objTable.addCell("Unable to add Image");
		        			System.out.println("Error while adding image to pdf, Exception caught : " + e.getMessage());
		        		}			        	        	
			  	    }	        	
		        	if(boolDeletePNGs){
			        	file.delete();
			        }
		        }
		        else {	
		        	objTable.addCell("Image missing: " + sPathIMG + " [Time of wait: " + nTimeCheck + "ms]");
		        }
	        }
	        else{
	        	//objTable.addCell(" ");
	        	//objTable.getRow(2).getCells()[0].setGrayFill(90f); //f for float. 0=black 100=white
	        }
	        document.add(objTable);
	        document.add(new Paragraph("\n"));
	        //document.newPage();
		}
		
		private Paragraph MakeBookmark(String strTitleForBookmark, String strContentForBookmark, String strFontStyle, BaseColor objColorSpec){			
			Font fontContent = new Font();
			fontContent.setColor(objColorSpec);
			//fontContent.setStyle(strFontStyle); //This is not working - perhaps font.setStyle("BOLD") does not, but font.setStyle(Font.BOLD) works
			String strColorSpec = (float)objColorSpec.getRed()*10/255/10 + " " + (float)objColorSpec.getGreen()*10/255/10 + " " + (float)objColorSpec.getBlue()*10/255/10;
			HashMap<String, Object> bookmarkitem = new HashMap<String, Object>();
	        Anchor anchorTarget = new Anchor(strContentForBookmark,fontContent);
	        anchorTarget.setName("Bookmark"+nIndexBookmark);
	        Paragraph paragraph = new Paragraph();
	        paragraph.add(anchorTarget);
	        bookmarkitem.put("Title", strTitleForBookmark);
	        bookmarkitem.put("Action", "GoTo");
	        bookmarkitem.put("Style", strFontStyle);
	        bookmarkitem.put("Color", strColorSpec); //Expects in the format "0 0 0", say for black
	        bookmarkitem.put("Named", "Bookmark"+nIndexBookmark);
	        arraylistBookmark.add(bookmarkitem);
	        nIndexBookmark++;
	        return paragraph;
		}
		
		public void Finalize() throws Exception{			
			if(!document.isOpen()){
				return; //Calling Finalize() multiple times yields no effect
			}
			
			AddToMetadata("Overall Status", nCountFailure>0?"FAIL":"PASS");
	        AddToMetadata("Total Validations", (nCountSuccess+nCountFailure)+"");
	        AddToMetadata("Pass", nCountSuccess+"");
	        AddToMetadata("Fail", nCountFailure+"");
	        
			writer.setOutlines(arraylistBookmark);
			writer.setViewerPreferences(PdfWriter.PageModeUseOutlines);
			writer.setViewerPreferences(PdfWriter.PageModeFullScreen|PdfWriter.PageLayoutOneColumn ); //|PdfWriter.PageLayoutSinglePage
			document.close();	
			writer.close();			
			
			sPathPDF = sPathPDF.substring(0, sPathPDF.indexOf(".pdf")) + "["+ (nCountFailure>0?"FAIL":"PASS") +"]" +".pdf";			
			reader = new PdfReader(sPathPDFTemp);	    
		    stamper = new PdfStamper(reader, new FileOutputStream(sPathPDF));	
		    
			PdfPTable objTable = new PdfPTable(2);
			objTable.setKeepTogether(true);
	        objTable.getDefaultCell().setPadding(nTableCellPadding);
	        
	        objTable.addCell("Overall Status:");
	        Font font=new Font(); //Create new font, else last font setting will be applied to all
	        font.setColor(nCountFailure>0?BaseColor.RED:BaseColor.GREEN.darker());
	        objTable.addCell(nCountFailure>0?(new Phrase("FAIL",font)): (new Phrase("PASS",font)));	        
	        objTable.addCell("Total Validations:");
	        objTable.addCell((nCountSuccess+nCountFailure)+"");
	        objTable.addCell("Pass:");
	        font=new Font(); //Create new font, else last font setting will be applied to all
	        font.setColor(nCountSuccess>0?BaseColor.GREEN.darker():BaseColor.BLACK);
	        objTable.addCell(new Phrase(nCountSuccess+"",font));
	        objTable.addCell("Fail:");
	        font=new Font(); //Create new font, else last font setting will be applied to all
	        font.setColor(nCountFailure>0?BaseColor.RED:BaseColor.BLACK);
	        objTable.addCell(new Phrase(nCountFailure+"",font));
	        
	        objTable.addCell("Statistics Graph:");	        
	        font=new Font();
	        font.setColor(BaseColor.BLACK);	        
	        PdfContentByte cb = stamper.getOverContent(1);	        
	        PdfTemplate template = cb.createTemplate(nPieChartSize+50, nPieChartSize);
	        template.setLineWidth(0.1f);
	        template.setColorFill(BaseColor.GREEN.darker()); //
	        template.circle(nPieChartSize/2, nPieChartSize/2, nPieChartSize/2-2);
	        template.rectangle(nPieChartSize,nPieChartSize-12,10,10);
	        ColumnText.showTextAligned(template, Element.ALIGN_LEFT,new Phrase("PASS", font), nPieChartSize+12, nPieChartSize-12, 0);
	        template .fillStroke();	        
	        template .setColorFill(BaseColor.RED);
	        template .moveTo(nPieChartSize/2,nPieChartSize-2);
	        if(nCountFailure>0){	        	
	        	template .arc(2, 2, nPieChartSize-2, nPieChartSize-2, 90, 360*nCountFailure/(nCountSuccess+nCountFailure) );	        	
	        }	        
	        template .lineTo(nPieChartSize/2,nPieChartSize/2);	        
	        template .lineTo(nPieChartSize/2,nPieChartSize-2);
	        template.rectangle(nPieChartSize,nPieChartSize-12-12,10,10);
	        ColumnText.showTextAligned(template, Element.ALIGN_LEFT,new Phrase("FAIL", font), nPieChartSize+12, nPieChartSize-12-12, 0);
	        template .fillStroke();
	        template .stroke();
	        Image imgGraph = Image.getInstance(template);       
	        PdfPCell cellPie = new PdfPCell(imgGraph,true);
	        cellPie.setPadding(1f);
	        cellPie.setFixedHeight(nPieChartSize);
	        cellPie.setHorizontalAlignment(Element.ALIGN_CENTER);
	        objTable.addCell(cellPie);
	        
	        //Insert the main highlights table
	        objTable.setTotalWidth(nPageWidth);
	        objTable.writeSelectedRows(0, objTable.getRows().size(), nLeftMargin, nPositionSummaryTable, stamper.getUnderContent(1));
	        nPositionSummaryTable = nPositionSummaryTable - objTable.getTotalHeight() - 10;
	        objTable = null;
	        
	        //For showing the total execution time of the test case
	        lEndTime=new Date().getTime();
    	    long diffSec = (lEndTime-lStartTime) / 1000;
    	    long min = diffSec / 60;
    	    long sec = diffSec % 60;
    	    AddToSummary("Date and Time",new Date().toString());
	        AddToSummary("Duration", min +" mins and "+sec+" secs");
	        AddReportDataFromPropertiesFile();
	        
	        //Insert the full summary table
	        if(!summaryItems.isEmpty()){		        
		        objTable = new PdfPTable(2);
				objTable.setKeepTogether(true);
		        objTable.getDefaultCell().setPadding(nTableCellPadding);
		        for (String sNameItem:summaryItems.keySet()){	        	
		        	objTable.addCell(sNameItem + ":");
			        objTable.addCell(summaryItems.get(sNameItem));
		        }	        
		        objTable.setTotalWidth(nPageWidth);
		        objTable.writeSelectedRows(0, objTable.getRows().size(), nLeftMargin, nPositionSummaryTable, stamper.getUnderContent(1));
		        nPositionSummaryTable = nPositionSummaryTable - objTable.getTotalHeight() - 10;
		        objTable = null;
	        }
	        
	        stamper.close();
	        reader.close();	        
	        File file = new File(sPathPDFTemp);	 
	        file.delete();	 
	        
			Path path = new File(sPathPDF).toPath();
	        for (String sNameItem:listMetadata.keySet()){	        	
	        	try {
		        	Files.setAttribute(path, sNameItem, listMetadata.get(sNameItem).getBytes(StandardCharsets.UTF_8));
		        }
	        	catch(IOException e){
		            System.out.println(e.getMessage());
		        }
	        }
	        PrintFileMetadata(sPathPDF);
			BatchRunner.mapThreadsMonitor.put("THREAD_ID" + nThreadIDConstruction + "_REPORT_PATH", sPathPDF); //This is an access point for BatchRunner to the test report
	        BatchRunner.mapThreadsMonitor.put("THREAD_ID" + nThreadIDConstruction + "_TEST_STATUS", nCountFailure>0?"FAIL":"PASS"); 
		}
		
		public void ValidateTest(boolean boolIsSuccess) throws Exception{
			if(boolIsSuccess){
				++nCountSuccess;
				Log("Validation succeeded[COLOR:DARK_GREEN]", "An implicit test validation succeeded");
			}
			else {
				++nCountFailure;
				Log("Validation failed[COLOR:RED]", "An implicit test validation failed");
			}
		}
		public void ValidateTest(boolean boolIsSuccess,String sLogMessage) throws Exception{
			if(boolIsSuccess){
				++nCountSuccess;
				Log(sLogMessage+"[COLOR:DARK_GREEN]", sLogMessage);
			}
			else {
				++nCountFailure;
				Log(sLogMessage+"[COLOR:RED]", sLogMessage);
			}
		}
		public void ValidateTest(boolean boolIsSuccess,String sLogMessage,String sImgPath) throws Exception{
			if (!IsFileOrFolderExist(sImgPath)){
				sImgPath=null;
			}
			if(boolIsSuccess){
				++nCountSuccess;
				Log(sLogMessage+"[COLOR:DARK_GREEN]", sLogMessage,sImgPath);
			}
			else {
				++nCountFailure;
				Log(sLogMessage+"[COLOR:RED]", sLogMessage,sImgPath);
			}
		}
		public void ValidateTest(String strActual, String strExpected) throws Exception{
			//Didn't call ValidateTest(boolean) since we indeed needed a different log message here
			boolean boolIsSuccess = strActual.trim().toUpperCase().equals(strExpected.trim().toUpperCase());
			if (boolIsSuccess){
				++nCountSuccess;
				Log("Validation succeeded[COLOR:DARK_GREEN]", "Expected: " + strExpected + "\r\nActual: " + strActual);
			}
			else{
				++nCountFailure;
				Log("Validation failed[COLOR:RED]", "Expected: " + strExpected + "\r\nActual: " + strActual);
			}
		}		
		public void AddToSummary(String sName, String sValue){
			summaryItems.put(sName, sValue);
			AddToMetadata(sName, sValue);
		}
		//Add static data to Report Summary from properties file
		private void AddReportDataFromPropertiesFile(){
			try{
				ConfigData configReporter=new ConfigData(PROPERTY_FILETYPES.REPORTER);
				Enumeration ReportFields = configReporter.GetKeys();
				while (ReportFields.hasMoreElements()) {
				    String sFieldName = (String)ReportFields.nextElement();
				    String sFieldValue = configReporter.GetProperty(sFieldName);
				    AddToSummary(sFieldName, sFieldValue);
				}
			}
			catch(Exception e){
				//Report Data properties file not found
			}
		}
		public void AddToMetadata(String sName, String sValue){
			listMetadata.put("user:" + sName, sValue); //keyword 'user' is mandatory standard
		}	
		
	}
	
	public static void CompressPDFFile(String sPathPDF) throws IOException, DocumentException{
		//This function is not proven to be effective. Reduced 1458 KB to just 1 KB (27 pages and plenty of images)
		//Reference: http://what-when-how.com/itext-5/pdf-and-compression-itext-5/
		PdfReader reader = new PdfReader(sPathPDF);
		reader.removeAnnotations();
		reader.removeFields();
		reader.removeUnusedObjects();
		reader.removeUsageRights();
		Document.compress = true;		
		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(sPathPDF+".compress.pdf"), PdfWriter.VERSION_1_5);
		stamper.getWriter().setCompressionLevel(9);
		int total = reader.getNumberOfPages() + 1;
		for (int i=1; i < total; i++){
			reader.setPageContent(i, reader.getPageContent(i));
		}
		stamper.setFullCompression();
		stamper.close();
		reader.close();
	}
	
	public  static void PrintFileMetadata(String sPathPDF){
		Path path = new File(sPathPDF).toPath();
    	try{
    		final UserDefinedFileAttributeView view = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
    	    System.out.println("\nSUtility.PrintFileMetadata()");    	 
    	    for (String attribute : view.list()) {

    	    	ByteBuffer buffer = ByteBuffer.allocateDirect(view.size(attribute));
    	        view.read(attribute, buffer);
    	        buffer.flip();
    	        System.out.println(attribute + ":" + StandardCharsets.UTF_8.decode(buffer).toString());
    	    }
    	    System.out.println("File size: " + Files.getAttribute(path, "size") + " B");  		      	    
    	}
    	catch(IOException e){
            System.out.println(e.getMessage());
        }
	}
	//Class to read configuration from properties file
	public static class ConfigData{
		public static enum PROPERTY_FILETYPES{REPORTER,DEBUGGER,BATCHRUNNER};
		private ResourceBundle objBundle=null;
		private final String sCustomReportPropertiesFile="Reporter";
		//Read data from given properties file
		public ConfigData(String sPropertiesFileName){
			objBundle=ResourceBundle.getBundle(sCustomReportPropertiesFile);
		}
		//Read data from standard properties file
		public ConfigData(PROPERTY_FILETYPES enumPropertiesFileType ){
			switch(enumPropertiesFileType){
				case REPORTER:
					objBundle=ResourceBundle.getBundle(sCustomReportPropertiesFile);
					break;
				}
		}
		public int Length(){
			return objBundle.keySet().size();
		}
		public String GetItem(int iIndex){
			return objBundle.keySet().toArray(new String[Length()])[iIndex];
		}
		public Enumeration GetKeys(){
			return objBundle.getKeys();
		}
		public String GetProperty(String sProperty){
			return objBundle.getString(sProperty);
		}
	}
	
	
	//Implementation to read data from excel table and drive the test
	public static class DataTable{
		private ArrayList <String> listNames=null;
		private ArrayList <ArrayList <String>> listListValues=null;
		private int nActiveRow=0;
		public int nCountRows=0;
		public int nCountColumns=0;
		public int nRowStart=0;
		public int nRowEnd=0;
		public int nTestIndex = -1;
		public int nCountTests=0;
		public String sFilePath="";
		
		private static String GetCellData(Cell oCell){
			if(oCell==null){
				return ""; //"<NULL DATA>";
			}
			oCell.setCellType(Cell.CELL_TYPE_STRING);
			return oCell.getStringCellValue();
			/*
			
			if(oCell==null){
				return ""; //"<NULL DATA>";
			}
            switch (oCell.getCellType()) 
            {
				case Cell.CELL_TYPE_NUMERIC:
					return ""+oCell.getNumericCellValue(); 
				case Cell.CELL_TYPE_STRING:
					return oCell.getStringCellValue();
				default:
					return ""; //"<UNDEF CELL TYPE ERROR:"+oCell.getCellType()+">";
            }
            */
		}
		public void SetActiveRow(int nRow) throws Exception{
			if(nRow<0 || nRow>=listListValues.size()){
				throw new Exception("Out of bound exception for fnSetActiveRow("+nRow+"). Limit: [0 to "+ (listListValues.size()-1) + "]");
			}
			nActiveRow = nRow;
		}
		public void SetActiveColumn(int nColumn) throws Exception{
			if(nColumn<0 || nColumn>=listListValues.size()){
				throw new Exception("Out of bound exception for fnSetActiveColumn("+nColumn+"). Limit: [0 to "+ (listListValues.size()-1) + "]");
			}
			//Setting Column means setting row in array list since column wise data is also strored as row wise in array of array list
			nActiveRow = nColumn;
		}
		//Move active row to next data set
		public boolean MoveToNextRecord(){
			if (IsEndOfRecord())
				return false;
			nActiveRow++;
			return true;
		}
		//Move active row to first data set
		public boolean MoveToFirstRecord(){
			nActiveRow=0;
			return true;
		}
		//Check if active row beyond last data set
		public boolean IsEndOfRecord(){
			return (nActiveRow>=listListValues.size());
		}
		public String GetValue(String strColumnName) throws Exception{
			if(nCountRows==0){
				return ""; //"<ERROR: NO ROWS TO RETURN";
			}
			if(listNames.indexOf(strColumnName)==-1){
				throw new Exception("DataTable: Invalid column specified: "+ strColumnName);
			}
			return listListValues.get(nActiveRow).get(listNames.indexOf(strColumnName));
		}
		public void SetValue(String strColumnName, String strValue) throws Exception{
			if(nCountRows==0){
				return; 
			}
			if(listNames.indexOf(strColumnName)==-1){
				throw new Exception("DataTable: Invalid column specified: "+ strColumnName);
			}
			listListValues.get(nActiveRow).set(listNames.indexOf(strColumnName), strValue);
		}
		@Override
		public String toString(){			
			return listListValues.toString();
			//return listNames.toString() + "\n" + listListValues.toString();
		}
		
		public DataTable(String strPathToExcelFile,String strSheetName,boolean bReadDataRowWise) throws Exception{
			LoadDataTable(strPathToExcelFile,strSheetName,bReadDataRowWise);
		}
		public DataTable(String strPathToExcelFile,String strSheetName) throws Exception{
			LoadDataTable(strPathToExcelFile,strSheetName,true);
		}
		public DataTable(String strPathToExcelFile,boolean bReadDataRowWise) throws Exception{
			LoadDataTable(strPathToExcelFile,"",bReadDataRowWise);
		}
		public DataTable(String strPathToExcelFile) throws Exception{
			LoadDataTable(strPathToExcelFile,"",true);
		}
		
		private void LoadDataTable(String strPathToExcelFile, String sExcelSheetName, boolean bReadDataRowWise) throws Exception{

			sFilePath = strPathToExcelFile.replaceAll("\\\\", "/");
			InputStream file = null;
	        try {
	        	file = Utility.class.getResourceAsStream(sFilePath);
	        } 
	        catch (Exception e1) {
	        	throw new Exception("Invalid datafile name or path specified : " + sFilePath);        	
	        }
	        XSSFWorkbook workbook = null;
	        try
	        {
	        	workbook = new XSSFWorkbook(file);
	        } 
	        catch (Exception e1) {
	        	throw new Exception("Invalid workbook name or path specified : " + sFilePath + "\nException message: " + e1.getMessage());        	
	        }
	      
	        XSSFSheet sheet;
	        
	        if(sExcelSheetName.isEmpty())
	        	 sheet = workbook.getSheetAt(0); 
	        else
	        	 sheet = workbook.getSheet(sExcelSheetName);
	        
	        if(bReadDataRowWise){
	        	nCountRows = sheet.getPhysicalNumberOfRows();
		        nCountColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		        listNames = new ArrayList <String> ();
		        Iterator<Cell> cellIterator = sheet.getRow(0).cellIterator();
		        while (cellIterator.hasNext()){
		        	String strName = GetCellData( cellIterator.next() );
		        	listNames.add(strName);
		        }	        
		        
		        listListValues = new ArrayList<ArrayList <String>> ();
		        for(int nRow=1; nRow<nCountRows; nRow++){
	        		ArrayList <String> listValues = new ArrayList <String>();
	        		Row oRow = sheet.getRow(nRow);
	        		if (oRow!=null){
		        		for(int nCol=0; nCol<nCountColumns; nCol++){
		        			listValues.add(GetCellData(oRow.getCell(nCol,HSSFRow.RETURN_BLANK_AS_NULL)));
		        		}
		        		listListValues.add(listValues);
	        		}
	        	}
	        }
	        else{
	        	nCountRows = sheet.getPhysicalNumberOfRows();
	           	listNames = new ArrayList <String> ();
	        	for(int nRow=0; nRow<nCountRows; nRow++){
	        		Row oRow = sheet.getRow(nRow);
	        		if (oRow!=null){
	        			if(nCountColumns<sheet.getRow(0).getPhysicalNumberOfCells())
	        				nCountColumns = sheet.getRow(0).getPhysicalNumberOfCells();
	        			listNames.add(GetCellData(oRow.getCell(0,HSSFRow.RETURN_BLANK_AS_NULL)));
	        		}
	        	}
	        	listListValues = new ArrayList<ArrayList <String>> ();
	        	for(int nCol=1; nCol<nCountColumns; nCol++){
	        		ArrayList <String> listValues = new ArrayList <String>();
	        		
	        		for(int nRow=0; nRow<nCountRows; nRow++){
	        			Row oRow = sheet.getRow(nRow);
		        		if (oRow!=null){
		        			listValues.add(GetCellData(oRow.getCell(nCol,HSSFRow.RETURN_BLANK_AS_NULL)));
		        		}
	        		}
		        	listListValues.add(listValues);
	        	}
	        }
	        
	        try {
	        	file.close();	        	
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
		}
	}
	
	public static class JsonObj {	
		public static JSONObject Obj;
		public static void JsonArray(String JsonValues) throws JSONException{			
		    final String[] Jsonarr=JsonValues.split(",");
			 
		    for (int i = 0; i < Jsonarr.length; i++) {
			   if (Jsonarr[i].contains("\"")){
				   Jsonarr[i] = Jsonarr[i].replace("\"", "");
			   }
		    }					
			String Key=null;
			String Value=null;
		    Obj = new JSONObject();  
			for(int i=0;i<Jsonarr.length;i++){
				Key=Jsonarr[i].split(":")[0];
				Value=Jsonarr[i].substring(Key.length()+1, Jsonarr[i].length());
				Obj.put(Key, Value);
			}
		}
		
		public static void JsonFormat(String Jsonvalues) throws JSONException{
			Obj = new JSONObject(Jsonvalues);
		}
		public static int Getlength() throws JSONException{
			return Obj.length();
		}
		public static String Get(String sKey) throws JSONException{
			return (String)Obj.get(sKey);
		}
		public static void Remove(String sKey) throws JSONException{
			Obj.remove(sKey);	
		}				
	}

	public static String QueryFromXML(String strXML, String strXPath){
		try 
        {  	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        	DocumentBuilder builder = factory.newDocumentBuilder();  
        	XPathFactory xpathFactory = XPathFactory.newInstance();
        	XPath xpath = xpathFactory.newXPath();    		
    		return xpath.evaluate(strXPath, builder.parse(new InputSource(new StringReader(strXML))));
        } catch (Exception e) {  
            e.printStackTrace();  
            return ""; //Error or empty string, both considered same way
        }        
	}

	public static void sendMail(String from, String to, String subject, String body, String pathAttachment) throws IOException 
	{	
		String strPathTempExecuter = "c:\\temp\\SendEmail.vbs";
		PrintWriter writer = new PrintWriter(strPathTempExecuter, "UTF-8");
		writer.println("Set objEmail = CreateObject(\"CDO.Message\")");
		writer.println("objEmail.From = \""+ from + "\"");
		writer.println("objEmail.To = \""+ to + "\"");
		writer.println("objEmail.Subject = \""+ subject + "\"");
		writer.println("objEmail.Textbody = \""+ body + "\"");
		writer.println("objEmail.AddAttachment \"" + pathAttachment + "\"");
		writer.println("objEmail.Configuration.Fields.Item (\"http://schemas.microsoft.com/cdo/configuration/sendusing\") = 2");
		writer.println("objEmail.Configuration.Fields.Item (\"http://schemas.microsoft.com/cdo/configuration/smtpserver\") = \"mailrelay.hrblock.net\""); 
		writer.println("objEmail.Configuration.Fields.Update");
		writer.println("objEmail.Send");
		writer.close();
		Runtime.getRuntime().exec("wscript \""+ strPathTempExecuter + "\"");		
	}
	
	public static String ScaleDownImageFile (String strImageFilePath, float fPercentage) throws IOException, BadElementException {
		if(fPercentage<0 || fPercentage >100){
			return strImageFilePath;
		}
		java.awt.Image image = javax.imageio.ImageIO.read(new File(strImageFilePath));
		int nWidth = (int) (image.getWidth(null)*fPercentage/100);
		int nHeight = (int) (image.getHeight(null)*fPercentage/100);		
        BufferedImage bufferedImage = new BufferedImage(nWidth, nHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        //Below three lines are for RenderingHints for better image quality, at cost of higher processing time
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, nWidth, nHeight, null);
        graphics2D.dispose();
        //The file format specifier "png" was finalized after verifying png, jpg, gif. 
        //GIF offered better quality for smaller size due to loseless pixel compression. The 256 color palette reduction was unnoticable.
        final String strFormat = "gif"; 
        strImageFilePath = strImageFilePath+".scaled."+strFormat;
        javax.imageio.ImageIO.write(bufferedImage, strFormat, new File(strImageFilePath));
        bufferedImage = null;
        return strImageFilePath;
    }
	
	public static boolean RunShellCommand(String sCommand) throws IOException, InterruptedException{
		Runtime objRun = Runtime.getRuntime();
		System.out.println("Going to run shell command " + sCommand);
		Process objProcess = objRun.exec(sCommand);
		objProcess.waitFor();
		BufferedReader objBuf = new BufferedReader(new InputStreamReader(objProcess.getInputStream()));
		String sLine = "";
		while ((sLine=objBuf.readLine())!=null) {
			System.out.println(sLine);
		}
		return true;
	}
	
	//Return the given resource path
	public static String GetResourcePath(String sResource) {
		try {
			return URLDecoder.decode(Utility.class.getResource(sResource).getPath(), "UTF-8");
		}
		catch (Exception e) {
			return "";
		}
	}
	
	/* Canadian SIN validation
	 * https://en.wikipedia.org/wiki/Social_Insurance_Number
	 * Social Insurance Numbers are validated via a simple checksum process.

       046 454 286  <  Sample SIN

       046 454 286  \  Multiply each top number
       121 212 121  /  by the number below it..
       -----------
       086 858 276  <  and get this.
             ^
             Notice here that 8*2=16, add 1 and
             6 together and get 7. If you get a
             2 digit # add the digits together.

       Add all of these digits together.
	
       0+8+6+8+5+8+2+7+6=50
	                  /\
	                If the SIN is valid this # will
	                be evenly divisible by 10. This
	                is a 'valid' SIN.
       Apart from the above logic, SIN starting with 8 is cosidered as an invalid sin
       Sin starting with digit 8 is used exclusively for the BN (Business Number) assigned to business owners and corporations
	*/
	
	public static boolean fnIsValidSIN(String sSin)
    {
		sSin=sSin.trim();
        if (sSin.length() != 9)
            return false;
        
        int[] sin=new int[sSin.length()];
        
        for(int i=0;i<sSin.length();i++)
        	sin[i]=Integer.parseInt(String.valueOf(sSin.charAt(i)));
        int checkSum = 0;
        if (sin[0]==8) return false; // Starting with 8 is BIN
        for (int i = 0; i < sin.length; i++)
        {
            int m = (i % 2) + 1;
            int v = sin[i] * m;
            if (v >= 10)
                checkSum += 1 + (v - 10);
            else
                checkSum += v;
        }

        return checkSum % 10 == 0;
    }
    //Generate a valid 'fake' SIN 
    public static String fnGenerateSIN(){
    	String sSIN;
    	do{
	    	sSIN=Integer.toString(GetRandomNumber(100, 999));
	    	sSIN+=Integer.toString(GetRandomNumber(100, 999));
	    	sSIN+=Integer.toString(GetRandomNumber(100, 999));
    	}
    	while(!fnIsValidSIN(sSIN));
		return sSIN;
    }
	
}

////// Old code copied below - will be removed soon



/*public void Log (String sStepName, String sStepDesc, String sPathIMG) throws Exception{	
	if(fnRemoveFormatParamsFromLogItem(sStepName).equals(sStepDesc)){
		sStepName = Utility.RegExpExtract(sStepDesc, "^((?:\\S+\\s+){3}\\S+).*");
		if(sStepName.length() < sStepDesc.length()){
			sStepName = sStepName + "...";
		}
	}
	
	PdfPTable objTable = new PdfPTable(1); 
	objTable.setSplitLate(false);
	objTable.setSplitRows(false);  

	objTable.setKeepTogether(true);
    objTable.getDefaultCell().setPadding(nTableCellPadding);
	objTable.addCell(Bookmark(sStepName));
	objTable.getRow(0).getCells()[0].setBackgroundColor(colorTheme);
	
	
	String strColor="None";
	
	//Extract text color from format string
	Matcher objFontMatcher = Pattern.compile("\\[COLOR:(.*?)\\]").matcher(sStepDesc);
	if(objFontMatcher.find()){
		strColor = objFontMatcher.group(1);				
		sStepDesc = objFontMatcher.replaceAll("");
	}
	
	// No color 
    // objTable.addCell(sStepDesc); 
	
	Font font=new Font();
	switch(strColor.trim().toUpperCase()){
    	case "RED":
    		font.setColor(BaseColor.RED);
    		break;
    	case "GREEN":
    		font.setColor(BaseColor.GREEN);
    		break;
    	case "BLUE":
    		font.setColor(BaseColor.BLUE);
    		break;
    }
	//Remove format strings from log descr before writing
	sStepDesc=fnRemoveFormatParamsFromLogItem(sStepDesc);
	objTable.addCell(new Phrase(sStepDesc,font));
	
    if(sPathIMG!=null){
        File file = new File(sPathIMG);
        int nTimeCheck = 0; //milliseconds
        while(!file.exists()&&((nTimeCheck+=500) < nTimeoutImageFile)){	        	
        	Thread.sleep(500);
        }
        if(file.exists()){
        	if(nImageScalePercentage<0 || nImageScalePercentage >100){ //No scaling or compression
        		objTable.addCell(Image.getInstance(sPathIMG));
        	}
        	else{ //Scale the image and also convert to compressed format
        		try{
	        		sPathIMG = ScaleDownImageFile(sPathIMG, nImageScalePercentage);
	        		PdfPCell oCell = new PdfPCell();
	        		Image objImage = Image.getInstance(sPathIMG);
	        		objImage.scalePercent(nImageScalePercentage);
	        		
	        		objImage.setScaleToFitHeight(false);
	        		objImage.setAlignment(Element.ALIGN_CENTER);
	        		oCell.addElement(objImage);		        		
		        	oCell.setPadding(nTableCellPadding);
		        	oCell.setGrayFill(0.5f);
		        	objTable.addCell(oCell);
		        	objImage = null;
		        	oCell = null;
		        	new File(sPathIMG).delete();
        		}
        		catch(Exception e){
        			objTable.addCell("Unable to add Image");
        			System.out.println("Error while adding image to pdf, Exception caught : " + e.getMessage());
        		} 
	        	        	
	  	    }	        	
        	if(boolDeletePNGs){
	        	file.delete();
	        }
        }
        else {	
        	objTable.addCell("Image missing: " + sPathIMG + " [Time of wait: " + nTimeCheck + "ms]");
        }
    }
    else{
    	//objTable.addCell(" ");
    	//objTable.getRow(2).getCells()[0].setGrayFill(90f); //f for float. 0=black 100=white
    }
    document.add(objTable);
    //document.newPage();
    //document.add(new Paragraph("\n"));	        
}

private Paragraph Bookmark(String strTitle) throws Exception {
	HashMap<String, Object> bookmarkitem = new HashMap<String, Object>();
	String strFont = "Normal";
	String strColor="Black";
	Matcher objFontMatcher = Pattern.compile("\\[FONT:(.*?)\\]").matcher(strTitle);
	if(objFontMatcher.find()){
		strFont = objFontMatcher.group(1);				
		strTitle = objFontMatcher.replaceAll("");
	}
	
	objFontMatcher = Pattern.compile("\\[COLOR:(.*?)\\]").matcher(strTitle);
	if(objFontMatcher.find()){
		strColor = objFontMatcher.group(1);				
		strTitle = objFontMatcher.replaceAll("");
	}
	
	//Limit bookmar length to 15 characters
	//strTitle= strTitle.length()>15? strTitle.substring(0, 15)+"...":strTitle;

    Anchor anchorTarget = new Anchor(strTitle);
    anchorTarget.setName("Bookmark"+nIndexBookmark);
    Paragraph paragraph = new Paragraph();
    paragraph.add(anchorTarget);
    bookmarkitem.put("Title", strTitle);
    bookmarkitem.put("Action", "GoTo");
    bookmarkitem.put("Style", strFont);
    switch(strColor.trim().toUpperCase()){
    	case "RED":
    		bookmarkitem.put("Color", "1 0 0");
    		break;
    	case "GREEN":
    		bookmarkitem.put("Color", "0 1 0");
    		break;
    	case "BLUE":
    		bookmarkitem.put("Color", "0 0 1");
    		break;
    }
    
    bookmarkitem.put("Named", "Bookmark"+nIndexBookmark);
    bookmark.add(bookmarkitem);
    nIndexBookmark++;
    return paragraph;
}
//Remove format parameters from the given string
private String fnRemoveFormatParamsFromLogItem(String strTitle){
	Matcher objFontMatcher = Pattern.compile("\\[FONT:(.*?)\\]").matcher(strTitle);
	if(objFontMatcher.find()){
		strTitle = objFontMatcher.replaceAll("");
	}
	objFontMatcher = Pattern.compile("\\[COLOR:(.*?)\\]").matcher(strTitle);
	if(objFontMatcher.find()){
		strTitle = objFontMatcher.replaceAll("");
	}
	return strTitle;
}
*/
/*public void Finalize() throws Exception{
	if(!document.isOpen()){
		return; //Calling Finalize() multiple times yields no effect
	}
    
	writer.setOutlines(bookmark);
	writer.setViewerPreferences(PdfWriter.PageModeUseOutlines);
	writer.setViewerPreferences(PdfWriter.PageModeFullScreen|PdfWriter.PageLayoutOneColumn ); //|PdfWriter.PageLayoutSinglePage

	document.close();	
	writer.close();
	//PieChart(nCountSuccess, nCountFailure);
	sPathPDF = sPathPDF.substring(0, sPathPDF.indexOf(".pdf")) + "["+ (nCountFailure>0?"FAIL":"PASS") +"]" +".pdf";
	
	nCountFailed=nCountFailure;  //Added by Abhi...........11/15/2016................
	nCountPassed=nCountSuccess;
	sCurrPdfPath=sPathPDF;
	
	ResultHash.put(nCountFailed+","+nCountPassed,sCurrPdfPath);
	
	reader = new PdfReader(sPathPDFTemp);	    
    stamper = new PdfStamper(reader, new FileOutputStream(sPathPDF));	
    
	PdfPTable objTable = new PdfPTable(2);
	objTable.setKeepTogether(true);
    objTable.getDefaultCell().setPadding(nTableCellPadding);
    
    Font font=new Font();
    font.setStyle(Font.BOLD);
    if(nCountFailure>0){
    	font.setColor(BaseColor.RED);
    	objTable.addCell(new Phrase("Overall Status:",font));
    	objTable.addCell(new Phrase("FAIL",font));
    }
    else{
    	font.setColor(BaseColor.BLUE);
    	objTable.addCell(new Phrase("Overall Status:",font));
    	objTable.addCell(new Phrase("PASS",font));
    }

    font=new Font(); //Create new font, else last font setting will be applied to all
    font.setStyle(Font.BOLD);
    font.setColor(BaseColor.BLACK);
    objTable.addCell(new Phrase("Total Validations:",font));
	objTable.addCell(new Phrase((nCountSuccess+nCountFailure)+"",font));

	font=new Font();
    font.setStyle(Font.BOLD);
	font.setColor(BaseColor.BLUE);
	objTable.addCell(new Phrase("Pass:",font));
	objTable.addCell(new Phrase(nCountSuccess+"",font));
	
	font=new Font();
    font.setStyle(Font.BOLD);
    if (nCountFailure>0)
    	font.setColor(BaseColor.RED);
    else
    	font.setColor(BaseColor.BLACK);
    
	objTable.addCell(new Phrase("Fail:",font));
	objTable.addCell(new Phrase((nCountFailure)+"",font));
	String GraphResult=PieChart(nCountSuccess, nCountFailure);
	if(GraphResult.equals("Grapgview is Empty")){
	}else{
	
	objTable.addCell(new Phrase("Graph View:",font));
    objTable.addCell(Image.getInstance(GraphResult));
	}
	

    //For displayin execution time
    Date date1 = new Date();
    lEndTime=date1.getTime();
   
    long diffMs = lEndTime-lStartTime; 
    long diffSec = diffMs / 1000;
    long min = diffSec / 60;
    long sec = diffSec % 60;

    font=new Font(); //Create new font, else last font setting will be applied to all
    font.setStyle(Font.BOLD);
    font.setColor(BaseColor.BLACK);
    
    //objTable.addCell(new Phrase("Execution Time : ",font));
	//objTable.addCell(new Phrase(min +" mints and "+sec+" secs",font));
	
    AddToSummary("Execution Time", min +" mins and "+sec+" secs");
    
	
    //objTable.addCell("Overall Status:");
    //objTable.addCell(nCountFailure>0?"FAIL":"PASS"); 
    //objTable.addCell("Total Validations:");
    //objTable.addCell((nCountSuccess+nCountFailure)+"");
    //objTable.addCell("Pass:");
    //objTable.addCell(nCountSuccess+"");  
    //objTable.addCell("Fail:");
    //objTable.addCell(nCountFailure+"");
    
    
    
    objTable.setTotalWidth(nPageWidth);
    objTable.writeSelectedRows(0, objTable.getRows().size(), nLeftMargin, nPositionSummaryTable, stamper.getUnderContent(1));
    nPositionSummaryTable = nPositionSummaryTable - objTable.getTotalHeight() - 10;
    objTable = null;
    
    AddToMetadata("Overall Status", nCountFailure>0?"FAIL":"PASS");
    AddToMetadata("Total Validations", (nCountSuccess+nCountFailure)+"");
    AddToMetadata("Pass", nCountSuccess+"");
    AddToMetadata("Fail", nCountFailure+"");
    
   
    
    if(!summaryItems.isEmpty()){		        
        objTable = new PdfPTable(2);
		objTable.setKeepTogether(true);
        objTable.getDefaultCell().setPadding(nTableCellPadding);
        for (String sNameItem:summaryItems.keySet()){	        	
        	objTable.addCell(sNameItem + ":");
	        objTable.addCell(summaryItems.get(sNameItem));
        }	        
        objTable.setTotalWidth(nPageWidth);
        objTable.writeSelectedRows(0, objTable.getRows().size(), nLeftMargin, nPositionSummaryTable, stamper.getUnderContent(1));
        nPositionSummaryTable = nPositionSummaryTable - objTable.getTotalHeight() - 10;
        objTable = null;
    }
    
    stamper.close();
    reader.close();	        
    File file = new File(sPathPDFTemp);	 
    file.delete();
    
	Path path = new File(sPathPDF).toPath();
    for (String sNameItem:listMetadata.keySet()){	        	
    	try
        {
        	Files.setAttribute(path, sNameItem, listMetadata.get(sNameItem).getBytes(StandardCharsets.UTF_8));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    Packaging.BatchRunner.listBatchTestReportsPath.add(sPathPDF);
    PrintFileMetadata(sPathPDF);
    //CompressPDFFile(sPathPDF); //The iText based PDF compression didn't yield a lot of value.
    //Deleting the Created PieChart Image
    new File(GraphResult).delete();   
}
*/