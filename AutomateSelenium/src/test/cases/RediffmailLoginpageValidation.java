package test.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import object.repository.Rediffloginpage;
import object.repository.rediffHomepage;

public class RediffmailLoginpageValidation {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=null;
		String url="https://www.rediff.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		rediffHomepage rf = PageFactory.initElements(driver, rediffHomepage.class);
		Rediffloginpage lrf = PageFactory.initElements(driver, Rediffloginpage.class);
		rf.signIn(driver).click();
		FileInputStream file = new FileInputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/pomreaddata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("sheet1");
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
		Row r = ws.getRow(i);
		lrf.logIn(driver).clear();
		lrf.logIn(driver).sendKeys(r.getCell(0).getStringCellValue());
		lrf.password(driver).clear();
		lrf.password(driver).sendKeys(r.getCell(1).getStringCellValue());
		lrf.go(driver).click();
		String title = driver.getTitle();
		System.out.println(title);
		//driver.navigate().back();
		try
		{
		    if(title.contains("Rediff"))
		     {
		    	r.createCell(2).setCellValue("Login sucessfull");
			   System.out.println("Login sucessfull");
		     }
		    else
		     {
			    throw new Exception();
			 }
		 }
		catch(Exception e)
		{
			 r.createCell(2).setCellValue("Login unsucessfull");
			  System.out.println("Login unsucessfull");
			  Date dt = new Date();
			  System.out.println(dt);
			  DateFormat df = new SimpleDateFormat("YYYY/MM/DD HH/MM/SS");
			  
			System.out.println(df.format(dt));
			  File fo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(fo, new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/POMDefectScreen/"+df.format(dt)+".png"));
		}
		FileOutputStream writefile = new FileOutputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/pomreaddata.xlsx");
		wb.write(writefile);
		driver.navigate().back();
		}
	} 	
}
