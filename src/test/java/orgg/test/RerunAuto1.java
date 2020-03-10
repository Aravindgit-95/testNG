package orgg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunAuto1 {
	
	@Test
	public void tc1() {
		
		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer=Analyzer.class)
	public void tc2() {
		Assert.assertTrue(false);
		
	}

}
