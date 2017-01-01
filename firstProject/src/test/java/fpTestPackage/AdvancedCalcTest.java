package fpTestPackage;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Assert;

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
	
	@Test
	public void testGCD(){
		
		final int a = 54;
		final int b = 24;
		final int res = 6;
		
		Assert.assertEquals(res, adavnceCalc.getGCD(a,b));
	}
	
	@Test
	public void testQuadEquRoots(){
		final int a = 1;
		final int b = -1;
		final int c = -2;
		final int[] res = {2,-1};
		
		final double[] actRes = adavnceCalc.getQuadEquRoots(a, b, c);
		
		if(actRes == null)
			Assert.fail("");
		
		Assert.assertEquals(res.length, actRes.length);
		
		for(int i = 0; i < res.length; i++)
			Assert.assertEquals(res[i],(int)actRes[i]);
		
		
		
	}
	
	@Test
	public void testBigger(){
		final int a = 4;
		final int b = 9;
		final int res = 9;
		
		Assert.assertEquals(res, adavnceCalc.getBigger(a, b));
	}
}
