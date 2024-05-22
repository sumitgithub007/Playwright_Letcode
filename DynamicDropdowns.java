package testCase;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.WaitForSelectorOptions;
import com.microsoft.playwright.Playwright;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
			
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext(new Browser.NewContextOptions()
				  .setGeolocation(41.890221, 12.492348)
				  .setPermissions(Arrays.asList("geolocation")));
     	Page page =context.newPage();
     	page.setDefaultTimeout(60000);
	  page.navigate("https://amazon.in");
	  page.locator("#twotabsearchtextbox").fill("toys");
     	
	  
	  page.waitForSelector("(//div[@class='two-pane-results-container']//div[@class='s-suggestion-container'])[5]",new WaitForSelectorOptions().setTimeout(4000)); 
		
	  
	  
	  
	  Locator loc =page.locator("//div[@class='two-pane-results-container']//div[@class='s-suggestion-container']");
	  
	  
	  System.out.println(loc.count());
	  
	  for(int i=0;i<loc.count();++i)
	  {
		  String text =loc.nth(i).textContent();
		  System.out.println(text);
	  }
	  
	  
	  
	  
	  
	  
	  
     	
//     	
//     	
//     	
//     	
//     	
//     	
//     	
//     	page.navigate("https://www.firstcry.com/");
//	    page.locator("//input[@id='search_box']").click();
//	    page.locator("//input[@id='search_box']").pressSequentially("machine");
//	    
//	    page.locator("(//div[@id='searchlist']/ul/li/span[1])[3]").hover();
//	    
//	    Locator loc =page.locator("//div[@id='searchlist']/ul/li/span[1]");
//	    
//	    
//	    
//	    for(int i=0;i<loc.count();++i)
//	    {
//	    	String text =loc.nth(i).textContent();
//	    	if(text.equals("Printers"))
//	    	{
//	    		loc.nth(i).click();
//	    		break;
//	    	}
//	    	//System.out.println(text);
//	    }
//	    
//	    
//	    
	    
	    
//	    page.locator("input[role='combobox']").fill("mobile");
//	    page.locator("(//ul[@role='listbox']/li/span[1])[3]").hover();
//	    
//	    Locator loc =page.locator("//ul[@role='listbox']/li/span[1]");
//	    for(int i=0;i<loc.count();++i)
//	    {
//	    	
//	    	String text =loc.nth(i).textContent();
//	    	if(text.equals("mobile homes for rent"))
//	    	{
//	    		loc.nth(i).click();
//	    		break;
//	    	}
//	    	//System.out.println(text);
//	    }
//	    
//	    
//	    
//	    
//	    
//	    
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //	    page.locator("//*[text()='Select Title']").click();
//		
//	    
//	    page.locator("//*[text()='Prof.']").click();
//	    
//	    
//	    Locator locator = page.locator("//div[@class=' css-26l3qy-menu']//div[starts-with(@id,'react')]");
//	    int count = locator.count();
//	    
//	    
////	    for(int i=0;i<count;++i)
////	    {
////	    	String text =locator.nth(i).textContent();
////	        if(text.equals("Prof."))
////	        {
////	        	locator.nth(i).click();
////	        }
////	    	//System.out.println(text);
////	    }
////	    
//	    
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
}
