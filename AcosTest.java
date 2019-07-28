import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AcosTest {

	@Test
	public void testAcoscalculator() {
		Acos test=new Acos();
		
		Assert.assertEquals(1.23,Acos.acoscalculator(0.33),Math.abs(1.23));
		Assert.assertEquals(1, Acos.acoscalculator(1), Math.abs(1));
		Assert.assertEquals(-1, Acos.acoscalculator(-1), Math.abs(1));
		Assert.assertEquals(2, Acos.acoscalculator(2), Math.abs(2));
		
	}

	
}
