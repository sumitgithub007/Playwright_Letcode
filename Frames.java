package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frames {

	public static void main(String[] args) {
		
	  //server start 
	  Playwright playwright = Playwright.create();	
 	  LaunchOptions lp = new LaunchOptions();
      lp.setChannel("chrome");
	  lp.setHeadless(false);
	  Browser  browser = playwright.chromium().launch(lp);
	  BrowserContext context_1 = browser.newContext();
      Page page =   context_1.newPage(); 
      page.navigate("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe"); 
     // page.locator("(//a[@title='CSS Tutorial'])[3]").click();
   
      FrameLocator frame1 =page.frameLocator("//iframe[@name='iframeResult']");
     FrameLocator frame2 =  frame1.frameLocator("//iframe[@title='W3Schools Free Online Web Tutorials']");
     
     frame2.locator("//a[@title='CSS Tutorial']").last().click();
     
     page.locator("//a[@id='getwebsitebtn']").click();
     
     
     
     
     
     
     
     
     
	}
      
	}