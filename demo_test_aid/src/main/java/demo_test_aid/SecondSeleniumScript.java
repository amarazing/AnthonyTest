package demo_test_aid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondSeleniumScript {

	final static String VALUE = "f776338";

	public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.newtours.demoaut.com/");

           WebElement register = driver.findElement(By.linkText("REGISTER"));
           register.click();

           (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
               public Boolean apply(WebDriver d) {
                   return d.getTitle().toUpperCase().contains("REGISTER");
               }
           });

           WebElement firstName = driver.findElement(By.name("firstName"));
           WebElement lastName = driver.findElement(By.name("lastName"));
           WebElement phone = driver.findElement(By.name("phone"));
           WebElement email = driver.findElement(By.name("userName"));
           WebElement address = driver.findElement(By.name("address1"));
           WebElement city = driver.findElement(By.name("city"));
           WebElement state = driver.findElement(By.name("state"));
           WebElement postalCode = driver.findElement(By.name("postalCode"));
           Select country = new Select(driver.findElement(By.name("country")));
           WebElement userName = driver.findElement(By.name("email"));
           WebElement password = driver.findElement(By.name("password"));
           WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));

           firstName.sendKeys(VALUE);
           lastName.sendKeys(VALUE);
           phone.sendKeys(VALUE);
           email.sendKeys(VALUE);
           address.sendKeys(VALUE);
           city.sendKeys(VALUE);
           state.sendKeys(VALUE);
           postalCode.sendKeys(VALUE);
           country.selectByValue("4");
           userName.sendKeys(VALUE);
           password.sendKeys(VALUE);
           confirmPassword.sendKeys(VALUE);

           WebElement submit = driver.findElement(By.name("register"));
           submit.click();

           (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Thank you for registering')]")));

           WebElement signIn = driver.findElement(By.linkText("sign-in"));
           signIn.click();

           System.out.println("REGISTRATION SUCCESSFUL");

           (new WebDriverWait(driver,10)).until(new ExpectedCondition <Boolean>(){
        	   public Boolean apply(WebDriver d){
        		   return d.getTitle().contains("Sign-on");
        	   }
           });

           WebElement userName1 = driver.findElement(By.name("userName"));
           WebElement password1 = driver.findElement(By.name("password"));
           WebElement submit1 = driver.findElement(By.name("login"));

           userName1.sendKeys(VALUE);
           password1.sendKeys(VALUE);
           submit1.click();

           (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
        	   public Boolean apply(WebDriver d){
        		   return d.getTitle().contains("Find a Flight");
        	   }
           });

           System.out.println("LOGIN SUCCESSFUL");


           driver.quit();
	}
}