package Mypack;
import org.openqa.selenium.*;
public class Fill {
	public static void main(String[] args) {
	
        WebDriver driver = (WebDriver) new ChromeDriver();

		        System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver-win64\\chromedriver.exe");


		        driver.get("https://www.selenium.dev/selenium/web/web-form.html#");

		        WebElement textInput = driver.findElement(By.name("textInput"));
		        textInput.sendKeys("Text Input Value");

		        WebElement passwordInput = driver.findElement(By.id("password"));
		        passwordInput.sendKeys("Password123");

		        WebElement textarea = driver.findElement(By.id("textarea"));
		        textarea.sendKeys("Textarea Value");

		        WebElement returnToIndex = driver.findElement(By.linkText("Return to index"));
		        returnToIndex.click();

		        WebElement dropdownSelect = driver.findElement(By.id("select"));
		        dropdownSelect.sendKeys("Option 2");

		        WebElement dropdownDatalist = driver.findElement(By.id("datalist"));
		        dropdownDatalist.sendKeys("Option 2");

		        WebElement fileInput = driver.findElement(By.id("file"));
		        fileInput.sendKeys("path_to_file");

		        WebElement checkbox = driver.findElement(By.id("checkbox"));
		        checkbox.click();

		        WebElement radio = driver.findElement(By.id("radio"));
		        radio.click();

		        WebElement colorPicker = driver.findElement(By.id("color"));
		        colorPicker.sendKeys("#ff0000");

		        WebElement datePicker = driver.findElement(By.id("date"));
		        datePicker.sendKeys("2024-02-07");

		        WebElement rangeInput = driver.findElement(By.id("range"));
		        rangeInput.sendKeys("50");

		        driver.quit();
		    }
		}
