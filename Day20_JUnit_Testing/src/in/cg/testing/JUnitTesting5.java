package in.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "NETRANGI");
		Assumptions.assumeTrue("NETRANGI".equals(System.getProperty("1")));
	}
}