package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uncheckAllcheckboxes1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="http://echoecho.com/htmlforms09.htm";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     WebElement mytab = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
	   // /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table
	     List<WebElement> rows = mytab.findElements(By.tagName("tr"));
	     //System.out.println(rows.size());
	     for(int i=0;i<rows.size();i++)
	     {
	       List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	       //System.out.println(cols.size());
	       for(int j=0;j<cols.size();j++)
	       {
	    	   List<WebElement> inputs = cols.get(j).findElements(By.tagName("input"));
	    	   //System.out.println(inputs.size());
	    	   for(int k=0;k<inputs.size();k++)
	    	   {
	    		  if(!inputs.get(k).isSelected())
	    		  {
	    		   inputs.get(k).click();
	    	      //String chknames = inputs.get(k).getAttribute("value");
	    	      //System.out.println(chknames);
	    		  }
	    	   }
	       }
	     }
	    /* List<WebElement> chk = mytab.findElements(By.tagName("input"));
	     for(int i=0;i<chk.size();i++)
	     {
	    	 if(!chk.get(i).isSelected())
	    	 {
	            chk.get(i).click();
	            Thread.sleep(2000);
	    	 }
	     }*/
	     
	}

}
