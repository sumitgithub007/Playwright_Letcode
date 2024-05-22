package testCase;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Mouse;
import com.microsoft.playwright.Mouse.MoveOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;
import com.microsoft.playwright.options.ViewportSize;

public class CalendarHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false).setChannel("chrome"));
		BrowserContext context  = browser.newContext();
		Page page =context.newPage();
		page.navigate("https://groww.in/calculators/sip-calculator");
		 
		Thread.sleep(10000);
		page.mouse().wheel(0, 1900);
		
		
//	  Locator circle = page.locator("//div[@aria-orientation='horizontal']").first();
//	  
//	//  BoundingBox circle_box = circle.boundingBox();
//	  
//		while(!page.locator("//input[@id='MONTHLY_INVESTMENT']").getAttribute("value").equals("4000"))
//		{
//			  BoundingBox circle_box = circle.boundingBox();
//			
//			page.mouse().move(circle_box.x + circle_box.height/2 , circle_box.y + circle_box.width/2);
//		page.mouse().down();
//		
//		
//		  page.mouse().move(circle_box.x - 2 +circle_box.height/2 , circle_box.y + circle_box.width/2);
//	    page.mouse().down();
//			page.mouse().up();
		}	
		
		
		
	
	
	 
 
		 
		
		
		
  
}
