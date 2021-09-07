package javaBasicsAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleSite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		//Created new object using FileInputSteam class to get the config properties file in our script
		FileInputStream getStream = new FileInputStream("config.properties");

		//Create new object using Properties class to perform actions with config file
		Properties getConfigFile = new Properties();

		//Using load function loading the content of config properties file
		getConfigFile.load(getStream);
		
		//Using getProperty function reading the content of config file
		String brow = getConfigFile.getProperty("Browser");
		String browLocation = getConfigFile.getProperty("BrowserLocation");
		
		
		if(brow.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", browLocation);
			driver= new ChromeDriver();
		}
		else if(brow.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", browLocation);
			driver= new FirefoxDriver();			
		}
		
		driver.navigate().to("https://www.google.co.in/");
		driver.quit();
	}

}
