import org.testng.annotations.Test;

public class TEST_001 extends PwBase {

	@Test
	void OpenGooglePage() {
		
		invokeApp("https://google.com", "Test Case 001");
		
		
	}

}
