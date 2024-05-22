package testCase;

import java.nio.file.Paths;
import java.util.HashMap;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
			
	
		
		HashMap<String,String> env  = new HashMap<>();
		
		env.put("PLAYWRIGHT_JAVA_SRC", "src/test/java");
		Playwright.CreateOptions options = new Playwright.CreateOptions().setEnv(env);
		
		
		Playwright playwright = Playwright.create(options);
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext();
     	
		context.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true)
				  .setTitle("Project Report"));

		
		Page page =context.newPage();
     	page.setDefaultTimeout(60000);
	    page.navigate("https://www.cricbuzz.com/");
	    
	    page.locator("//*[text()='Schedule']").click();
	  
	    page.locator("//*[text()='Teams']").first().click();
	    
	  Locator country =  page.locator("//div[@class='cb-col cb-col-100']//h2/a");
	    
	  for(int i=0;i<country.count();++i)
	  {
		  String name =country.nth(i).innerText();
		  System.out.println(name);
	  }
	  
	    
	    context.tracing().stop(new Tracing.StopOptions()
	    		  .setPath(Paths.get("Projecttrace.zip")));
	    
	    context.close();
	    playwright.close();
	    
	    
	}
	
}
