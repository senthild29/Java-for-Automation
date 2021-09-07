package log4jTutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLFileConfigExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Logger logdata = Logger.getLogger(XMLFileConfigExample.class);
		
		DOMConfigurator.configure("XMLLogFile.xml");
		
		logdata.info("This is an Info Log");
		logdata.warn("This is a Warning Log");

	}

}
