package testCase;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.ClickOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.WaitForSelectorOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.LocatorAssertions;

public class ToughCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext(new Browser.NewContextOptions()
				  .setGeolocation(41.890221, 12.492348)
				  .setPermissions(Arrays.asList("geolocation")));
		Page page =context.newPage();
		page.setDefaultTimeout(60000);
		//1963 ,1983 ,2003 ,2023	
		
		int year_select =200;
		int curr_year = 2023;
		page.navigate("https://demo.automationtesting.in/Datepicker.html");
		page.locator("//input[@id='datepicker2']").click();
		//page.pause();
       // page.locator("(//select[@class='datepick-month-year'])[2]").click();
		//		page.locator("//select[@class='datepick-month-year']").last().selectOption("2014");
		 
		Locator loc = page.locator("(//select[@class='datepick-month-year'])[2]/option[1]/following-sibling::option");
		//page.waitForSelector("(//div[@type='normal']/li//span[1])[1]",new WaitForSelectorOptions().setTimeout(3000));
	//	page.locator("//*[text()='Anki']").isVisible();
		 
		
		while(!(page.locator("//*[text()='"+year_select+"']").count()==1))
		{
		
			
			   if(year_select<curr_year)
			    {
			    	page.locator("(//select[@class='datepick-month-year'])[2]").click();
//			    	page.keyboard().down("PageUp");
//			    	page.keyboard().up("PageUp");
//			    	page.keyboard().down("Enter");
//			    	page.keyboard().up("Enter");
			    	page.locator("//select[@title='Change the year']/option[1]").click();
			    	//Thread.sleep(1200);
			    }
			    else {
			    	page.locator("(//select[@class='datepick-month-year'])[2]/option[last()]").click();
			    }
			
			 try {
				 page.waitForSelector("//*[text()='"+year_select+"']",new WaitForSelectorOptions().setTimeout(3000));
			 }
			 catch(Exception e)
			 {
				 
			 }
			
			
			
			
			
			
			
			
			
			
			
			
			//page.locator("(//select[@class='datepick-month-year'])[2]/option[1]").click();
		}
		
		
		
		
		
	}
	
}
