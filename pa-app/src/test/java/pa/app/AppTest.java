package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */
public class AppTest 
{
	private static final Logger logger = Logger.getLogger( AppTest.class.getName() );
	
	@BeforeEach 
	public void init() {
		logger.info("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
	}
    
    @DisplayName("Second Test - main")
	@Test
	void testMain() {
		App.main(null);
		assertTrue(true);
	}
    
    @DisplayName("Third Test - add")
	@Test
	void testAdd() {
    	App ap = new App();
    	ap.add(1,1);
		assertTrue(true);
	}
    
    @DisplayName("Fourth Test - sub")
	@Test
	void testSub() {
    	App ap = new App();
    	ap.sub(1,1);
		assertTrue(true);
	}
    
    @DisplayName("Fifth Test - mul")
	@Test
	void testMul() {
    	App ap = new App();
    	ap.mul(1,1);
		assertTrue(true);
	}
    
    @DisplayName("Sixth Test - div")
	@Test
	void testDiv() {
    	App ap = new App();
    	ap.div(1,1);
		assertTrue(true);
	}
}
