package base;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PwBase {

	public  void invokeApp(String url, String Description) {
		
		Playwright playwright = Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));	
		BrowserContext browsercontext=browser.newContext();
		Page page = browsercontext.newPage();
		page.navigate(url);
	
		System.out.println("The Page Title is : "+page.title());
		
		// TODO Auto-generated method stub

		page.close();
		browsercontext.close();
		browser.close();
		playwright.close();
	}

}
