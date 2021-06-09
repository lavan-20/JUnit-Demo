package test;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class JUnitTest2 {

	
	@Test
	  public void testAssertFalse() {
	    assertFalse("failure - should be false", true);
	    //Checks that a condition is false.
	  }
}
