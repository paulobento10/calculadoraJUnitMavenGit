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
		//logger.info("Logging an INFO-level message");
		add(1,1);
		sub(1,1);
		mul(1,1);
		div(1,1);
	}

	// String concatenation method example
	String concat(String s1, String s2) {
		return s1 + s2;
	}

	public static void add(int v1, int v2) {
		//logger.info(v1 +" + "+" = "+v1+v2);
		System.out.println(v1+" + "+v2+" = "+(v1+v2));
	}
	
	public static void sub(int v1, int v2) {
		/*int v3=v1-v2;
		logger.info(""+v3);*/
		System.out.println(v1+" - "+v2+" = "+(v1-v2));
	}
	
	public static void mul(int v1, int v2) {
		//logger.info(v1 +" * "+" = "+v1*v2);
		System.out.println(v1+" * "+v2+" = "+(v1*v2));
	}
	
	public static void div(int v1, int v2) {
		if(v2!=0) System.out.println(v1+" / "+v2+" = "+(v1/v2));
			//logger.info(v1 +" / "+" = "+v1/v2);
	}

	
}
