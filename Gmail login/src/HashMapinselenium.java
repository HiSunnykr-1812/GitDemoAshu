import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HashMapinselenium {

	public static void main(String[] args) {
		ChromeOptions ChromeOption =new ChromeOptions();
		ChromeOption.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(ChromeOption);
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
		//String Credentials_user=getcredential().get("admin");
		
		driver.findElement(By.name("username")).sendKeys(getusername("Customer"));
		driver.findElement(By.name("password")).sendKeys(password("Customer"));
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		String text=driver.getTitle();
		System.out.println(text);
		driver.quit();

	}
	
	public static HashMap<String,String> getcredential() {
		HashMap<String,String> user=new HashMap<String,String>();
		user.put("Customer", "Ashutosh@123:Test@123");
		user.put("admin", "Admin@123:admin@123");
		
		return user;
	}
	public static String getusername(String role) {
		String Credential=getcredential().get(role);
		return Credential.split(":")[0];
		
	}
	public static String password(String role) {
		String Credential=getcredential().get(role);
		return Credential.split(":")[1];
	}
	
		
	

}
