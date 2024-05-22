package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class dragAndDrop {

	public static void main(String[] args) {
		
	  //server start 
	  Playwright playwright = Playwright.create();	
 	  LaunchOptions lp = new LaunchOptions();
      lp.setChannel("chrome");
	  lp.setHeadless(false);
	  Browser  browser = playwright.chromium().launch(lp);
	  BrowserContext context_1 = browser.newContext();
      Page page =   context_1.newPage(); 
     page.navigate("https://jqueryui.com/droppable/");
    FrameLocator locator_frame = page.frameLocator("//iframe[@class='demo-frame']");
     
   Locator draggable = page.locator("//*[text()='Drag me to my target']");
   Locator droppable = page.locator("//*[text()='Drop here']");
   
    locator_frame.locator(draggable).dragTo(locator_frame.locator(droppable));
     
    //System.out.println("hello");
     
	}
      
	}