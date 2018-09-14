package pa.app;

import java.util.logging.Logger;

/**
 * Maven JUnit 5 - Hello world!
 * 
 * @author Paulo Araújo
 * @version 1.0
 *
 */

public class App {


	private static final Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		logger.info("Logging an INFO-level message");
	}

	// String concatenation method example
	String concat(String s1, String s2) {
		return s1 + s2;
	}
	
	public void add(int v1, int v2) {
		logger.info(v1 +" + "+" = "+v1+v2);
	}
	
	public void sub(int v1, int v2) {
		logger.info(v1 +" - "+" = "+v1-v2);
	}
	
	public void mul(int v1, int v2) {
		logger.info(v1 +" * "+" = "+v1*v2);
	}
	
	public void div(int v1, int v2) {
		if(v2!=0)
			logger.info(v1 +" / "+" = "+v1/v2);
	}
}
