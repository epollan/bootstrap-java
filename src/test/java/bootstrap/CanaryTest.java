package bootstrap;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CanaryTest {

	@Test
	public void turnMeGreen() {
		assertTrue("It wasn't meant to be", false);
	}
}
