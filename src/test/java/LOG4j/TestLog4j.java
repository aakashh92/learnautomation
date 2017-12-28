package LOG4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestLog4j extends TestBase {
	
	public static final Logger logger = Logger.getLogger(TestLog4j.class.getName());
	
	@Test
	public void start()
	{
		logger.info("start login test");
		logger.info("click on sign button");
		logger.info("enter username");
		logger.info("enter password");
		logger.info("click on submit butto");
	}
	

}
