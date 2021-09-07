package log4jTutorial;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigExample {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating object for Logger class using Factory Design Pattern(without using new Keyword)
		// Like we did for PageFactory.initElement() in Page Object Model tutorial
		//getLogger() will create a object for Logger and store it in logfile variable
		Logger logfile = Logger.getLogger(BasicConfigExample.class); //Factory Design Pattern
		
		//Configure log4j class "BasicConfigurator" to print the message in console
		BasicConfigurator.configure();
		
		//Using Logger variable "logfile" input the required log message 
		
		logfile.debug("This is a Debug Log");
		logfile.info("This is a Information Log");
		logfile.warn("This is a Wraning Log");
		logfile.error("This is an error Log");
		logfile.fatal("This is an Fatal Log");
	}

}
