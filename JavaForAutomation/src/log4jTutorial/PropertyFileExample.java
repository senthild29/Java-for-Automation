package log4jTutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating object for Logger class using Factory Design Pattern(without using new Keyword)
		Logger logdata = Logger.getLogger(PropertyFileExample.class);

		//Configure log4j class "PropertyConfigurator" in order to refer to our file(FileLog.properties)
		PropertyConfigurator.configure("FileLog.properties");	
		
		logdata.debug("This is a Debug Log");
		logdata.info("This  is an Info Log");
		logdata.warn("This is a Warning Log");
		logdata.error("This is an Error Log");
		logdata.fatal("This is a Fatal Log");

	}

}
