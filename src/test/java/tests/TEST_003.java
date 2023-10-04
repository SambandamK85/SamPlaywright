package tests;
import org.testng.annotations.Test;

import base.PwBase;

public class TEST_003 extends PwBase{
	
	@Test
	void OpenGooglePage() {
		
		invokeApp("https://amazon.com", "Test Case 001");
		
		
	}

}
