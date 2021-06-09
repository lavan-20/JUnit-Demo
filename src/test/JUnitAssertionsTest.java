package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class JUnitAssertionsTest {
	
	  @Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "test".getBytes();
	    byte[] actual = "test".getBytes();
	    assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }

	  @Test
	  public void testAssertEquals() {

	    assertNotEquals(new Object(), new Object());
	    //Checks that two primitives/objects are equal.
	  }

	  @Test
	  public void testAssertFalse() {
	    assertFalse("failure - should be false", false);
	    //Checks that a condition is false.
	  }

	  @Test
	  public void testAssertNotNull() {
	    assertNotNull("should not be null", new Object());
	    //Checks that an object isn't null.
	  }

	  @Test
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  public void testAssertNull() {
	    assertNull("should be null", null);
	    //Checks that an object is null.
	  }

	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(62);
	    Integer bNumber = Integer.valueOf(62);
	    
	    String a = "text";
	    String b = "text";

	    assertSame("should be same", a , b);
	  }


	  @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	    //Checks that a condition is true.
	  }
	
}
