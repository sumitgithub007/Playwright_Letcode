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

public class slider {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser =playwright.chromium().launch(lp);
		BrowserContext context = browser.newContext();
		context.setDefaultTimeout(180000);
		Page page = context.newPage();
	
		 page.navigate("https://jqueryui.com/slider/");
		FrameLocator locator_frame = page.frameLocator(".demo-frame");
		Locator box_new = locator_frame.locator("//div[@id='slider']/span");
		Thread.sleep(2000);
		BoundingBox box= box_new.boundingBox();
 	    page.mouse().move(box.x + box.width/2 ,box.y );

		page.mouse().down();

		  page.mouse().move(box.x + 50 + box.width/2 , box.y);

  	page.mouse().down();

        // Mouse down to start dragging
        page.mouse().down();

      
     //   page.mouse().up();
	   	
	  
}
	
}