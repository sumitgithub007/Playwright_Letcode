package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class PlaywrightCodegen {

	public static void main(String[] args) {
		
	  //server start 
	  Playwright playwright =   Playwright.create();	
	  
 	  LaunchOptions lp = new LaunchOptions();
      lp.setChannel("chrome");
	  lp.setHeadless(false);
  
	  Browser  browser = playwright.chromium().launch(lp);
	  BrowserContext context_1 = browser.newContext();
      Page page =   context_1.newPage();
	  page.navigate("https://www.cricbuzz.com/");
	  page.pause();
	  
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Schedule").setExact(true)).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Archives")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Live Scores")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Domestic")).click();
	      page.locator("nav").filter(new Locator.FilterOptions().setHasText("Match Facts News")).getByTitle("News").click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Scorecard")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Highlights")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Categories")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("All Videos")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Playlists")).click();
	  
	// playwright.close();
	 
	  
	 
	 
		
		
		
	}
	
}
