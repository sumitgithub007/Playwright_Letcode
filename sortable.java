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

public class sortable {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser =playwright.chromium().launch(lp);
		BrowserContext context = browser.newContext();
		context.setDefaultTimeout(20000);
		Page page = context.newPage();
	
		page.navigate("https://jqueryui.com/sortable/");
		FrameLocator loc_frame = page.frameLocator(".demo-frame");
		
		System.out.println(loc_frame.locator("//*[text()='Item 1']"));
		 Locator item1 = loc_frame.locator("//*[text()='Item 1']");
		 
		 Locator item2 = loc_frame.locator("//*[text()='Item 2']");
		 Locator item3 = loc_frame.locator("//*[text()='Item 3']");
		 Locator item4 = loc_frame.locator("//*[text()='Item 4']");
		 Locator item5 = loc_frame.locator("//*[text()='Item 5']");
		 Locator item6 = loc_frame.locator("//*[text()='Item 6']");
		 Locator item7 = loc_frame.locator("//*[text()='Item 7']");
		
		
		 loc_frame.locator(item7).dragTo(loc_frame.locator(item1));
		 loc_frame.locator(item6).dragTo(loc_frame.locator(item1));

		 loc_frame.locator(item5).dragTo(loc_frame.locator(item1));
		 loc_frame.locator(item4).dragTo(loc_frame.locator(item1));
		 loc_frame.locator(item3).dragTo(loc_frame.locator(item1));
		 loc_frame.locator(item2).dragTo(loc_frame.locator(item1));
		 loc_frame.locator(item1).dragTo(loc_frame.locator(item1));

		 
		
		
		
		
	}
	
}