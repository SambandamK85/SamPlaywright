package com.test.my.sam;
import org.testng.annotations.Test;

import base.PwBase;

public class TEST_002 extends PwBase {
	
	
	@Test
	void OpenGooglePage() {
		
		invokeApp("https://apple.com", "Test Case 001");
		
		
	}

}
