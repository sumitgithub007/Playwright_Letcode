package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightSelectors {

	public static void main(String[] args) {
		
	  //server start 
	  Playwright playwright = Playwright.create();	
 	  LaunchOptions lp = new LaunchOptions();
      lp.setChannel("chrome");
	  lp.setHeadless(false);
	  Browser  browser = playwright.chromium().launch(lp);
	  BrowserContext context_1 = browser.newContext();
      Page page =   context_1.newPage(); 
  //    page.setDefaultTimeout();//60 second
      page.navigate("https://www.cricbuzz.com/");
     // page.locator("id=cricbuzz-plus-main-menu").click();
   page.locator("text=' Cricbuzz Plus '").last().click();
      //	  page.locator("'Beaudty'").last().click(); // "text='Beauty'"
	  //1000 line of code
	  
	// playwright.close();
	 
	  
	 
	 
		
		
		
	}
	
}
