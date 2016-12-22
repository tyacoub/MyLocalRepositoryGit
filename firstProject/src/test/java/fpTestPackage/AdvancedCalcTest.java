package fpTestPackage;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.Assert;

@RunWith(JUnit4.class)
public class AdvancedCalcTest {

	private static AdavnceCalc adavnceCalc;
	
	@BeforeClass
	public static void init(){
		adavnceCalc = new AdavnceCalc();
	}
	
	@Test
	public void testFactor(){
		
		final int in1 = 3;
		final int res = 6;
		
		Assert.assertEquals(res, adavnceCalc.getFactory(in1));
	}
}