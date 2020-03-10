package orgg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoRun2 {
	
	@Test
	public void tc1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	public void tc2() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
}
