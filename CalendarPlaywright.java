package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CalendarPlaywright {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext();
		Page page =context.newPage();
		page.navigate("https://www.makemytrip.com/flights/");
		
		page.locator("//span[@data-cy='closeModal']").click();
	 
		page.locator("//p[@data-cy='departureDay']").click();
	    String text =page.locator("//div[@class='DayPicker-Caption']").last().textContent();
	    System.out.println(text);
		 
	    //May 2024
	
	    while(! (page.locator("//div[@class='DayPicker-Caption']").last().textContent().equals("May 2024")))
		{
		 
			page.locator("//span[@aria-label='Next Month']").click();
		}
		
	    Locator loc =page.locator("div[class='DayPicker-Month']:nth-of-type(2) div[class='dateInnerCell'] >p:nth-child(1)");
	    
	    for(int i=0;i<loc.count();++i)
	    {
	    	String text2 =loc.nth(i).textContent();
	    	System.out.println(text2);
	    	if(text2.equals("28"))
	    	{
	    		loc.nth(i).click();
	    		break;
	    	}
	    }
		
		
		
		
	}
	
	
	
	
}
