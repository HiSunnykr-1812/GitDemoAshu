import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ChromeOption =new ChromeOptions();
		ChromeOption.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(ChromeOption);
		//NotFoundException
		try {
		driver.get("https://the-internet.herokuapp.com/tinymce");//launch of browser
        driver.switchTo().frame("mce_0_ifr");//frame
        driver.findElement(By.id("tinymce")).sendKeys("ggggg");//sendkeys
        driver.findElement(By.id("tinymce")).clear();
	    }
		catch(NotFoundException e){
			System.out.println("NOT FOUND");
			System.out.println("NOT FOUND");
			e.printStackTrace();
			
		}
		try {
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert=	driver.switchTo().alert();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert");
			e.printStackTrace();
		}
		
		}}
