package testCase;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.MouseButton;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class RightClick {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext(new Browser.NewContextOptions()
				  .setGeolocation(41.890221, 12.492348)
				  .setPermissions(Arrays.asList("geolocation")));
		Page page =context.newPage();
		page.navigate("https://demo.guru99.com/test/simple_context_menu.html");
		 
		
		page.locator(".context-menu-one.btn.btn-neutral").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
}
