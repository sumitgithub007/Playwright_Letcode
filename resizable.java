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

public class resizable {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser =playwright.chromium().launch(lp);
		BrowserContext context = browser.newContext();
		context.setDefaultTimeout(1800000);
		Page page = context.newPage();
	
		// page.navigate("https://www.worldometers.info/coronavirus/worldwide-graphs/");
		 page.navigate("https://www.worldometers.info/coronavirus/country/india/");
		// Thread.sleep(10000);
		 page.locator("((//div[@class='highcharts-container '])[2] //*[name()='svg'] //*[local-name()='path'])[28]").dispatchEvent("click");
		 
		 Locator point = page.locator("((//div[@class='highcharts-container '])[2] //*[name()='svg'] //*[local-name()='path'])[37]");
		
		 
		 while(true)
		 {
			 BoundingBox srcBound = point.boundingBox();
		 page.mouse().move(srcBound.x+srcBound.width/2,srcBound.y+srcBound.height/2);
	       page.mouse().down();
	       
	     page.mouse().move(srcBound.x+29,srcBound.y+srcBound.height/2);
	     page.mouse().down();
	     
	    // String data =page.locator("((//div[@class='highcharts-container '])[2] //*[name()='svg'] //*[local-name()='text'])[40]").innerText();
	     //System.out.println(data);
	     page.mouse().up();
	     
		 } 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				 //		FrameLocator locator_frame = page.frameLocator(".demo-frame");
//		Locator box_new = locator_frame.locator("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");
//		//locator_frame.locator("//*[text()='Drag me around']").click();
//		
//		Thread.sleep(2000);
//		BoundingBox box= box_new.boundingBox();
// 	    page.mouse().move(box.x + box.width/2 ,box.y + box.height/2 );
//
//		page.mouse().down();
//
//		  page.mouse().move(box.x - 100 + box.width/2 , box.y + box.height/2  - 100);
//
//  	page.mouse().down();
//
//        // Mouse down to start dragging
//        page.mouse().down();
//
//      
//     //   page.mouse().up();
	   	
	  
}
	
}