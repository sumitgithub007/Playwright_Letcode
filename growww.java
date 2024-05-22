package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Mouse.MoveOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class growww {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser =playwright.chromium().launch(lp);
		BrowserContext context = browser.newContext();
		context.setDefaultTimeout(180000);
		Page page = context.newPage();
	
		 page.navigate("https://groww.in/calculators/sip-calculator");
	 
		Locator box_new = page.locator("//div[@aria-orientation='horizontal']").first();
		Thread.sleep(2000);
		
		while(!page.locator("#MONTHLY_INVESTMENT").getAttribute("value").equals("77500"))
		{
	    		BoundingBox box= box_new.boundingBox();
    	 	    page.mouse().move(box.x + box.width/2 ,box.y );

	    		page.mouse().down();
 
    		    page.mouse().move(box.x - 2 + box.width/2 , box.y);
 
     	    	page.mouse().down();
     	    //	Thread.sleep(4000);
	        // Mouse down to start dragging
	            page.mouse().up();
	
		}
		
      
     //   page.mouse().up();
	   	
	  
}
	
}