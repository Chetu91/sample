
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commondatautil.Propertyutilfile;

public class vtigertest1 {

	
	
	public static void main(String[] args) throws Throwable {
		
		Propertyutilfile plib = new Propertyutilfile();
		//String USERNAME = plib.readDataFromPropertyFfile("username");
		//String PASSWORD = plib.readDataFromPropertyFfile("password");
		String URL = plib.readDataFromPropertyFfile("url");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("submitButton")).click();

	}

}