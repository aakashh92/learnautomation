package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config {
	Properties pro;

	public Config() throws Exception {
		// TODO Auto-generated constructor stub
		
	File src=new File("./Configdatadriven/Config1.property");
	FileInputStream fis=new FileInputStream(src);
	 pro=new Properties();
	pro.load(fis);
	
	}
	
	public String FireFoxPath() {
		String path=pro.getProperty("FirefoxDriver");
		return path;
		
	}
	public String URL() {
		String link=pro.getProperty("URL");
		return link;
		
	}
	

}
