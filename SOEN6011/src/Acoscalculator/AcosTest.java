package Acoscalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * The Class AcosTest.
 */
class AcosTest {

	/**
	 * @author Kiranmayie
	 * Test acoscalculator.
	 */
	@Test
	public void testAcoscalculator() {
		Acos test=new Acos();
		
		Assert.assertEquals(1.23,Acos.acoscalculator(0.33),Math.abs(1.23));
		Assert.assertEquals(1, Acos.acoscalculator(1), Math.abs(1));
		Assert.assertEquals(-1, Acos.acoscalculator(-1), Math.abs(1));
		Assert.assertEquals(2, Acos.acoscalculator(2), Math.abs(2));
		
	}

	
}

