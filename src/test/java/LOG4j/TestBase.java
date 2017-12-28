package LOG4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static final Logger logger = Logger.getLogger(TestBase.class.getName());
	
	@BeforeTest
	public void log4j() {
		String log4jpath=System.getProperty("user.dir")+"src/test/java/LOG4j/Log4j.properties";
		PropertyConfigurator.configure(log4jpath);
		
		
		
		
	}

}
