package sel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Fill {
	public static void main(String[] args) throws InterruptedException {
	

        WebDriver ob = new ChromeDriver();

        ob.manage().window().maximize();
        ob.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement inputBox = ob.findElement(By.xpath("//input[@name='my-text']"));

        WebElement pass = ob.findElement(By.xpath("//*[@name='my-password']"));
        WebElement text = ob.findElement(By.xpath("//*[@name='my-textarea']"));

        inputBox.clear();
        inputBox.sendKeys("Binit Bhushan ");
        pass.clear();
        pass.sendKeys("12004");
        text.clear();
        text.sendKeys("Testing automate");

      
        WebElement dropdown = ob.findElement(By.xpath("//*[@name='my-select']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Two");

        WebElement dropdown2 = ob.findElement(By.xpath("//*[@name='my-datalist']"));
        dropdown2.clear();
        dropdown2.sendKeys("India");

        WebElement color = ob.findElement(By.xpath("//*[@name='my-colors']"));
        color.clear();
        color.sendKeys("#000000");

    

        WebElement fileInput = ob.findElement(By.xpath("//*[@name='my-file']"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ob;
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys("E:\\tetst.txt");

        WebElement slide = ob.findElement(By.xpath("//*[@name='my-range']"));
        
        Point point =slide.getLocation();
        
        int x = point.getX();
        int y = point.getY();
        int value =5;
        
        int total =value+y;
        
        
        Actions action = new Actions(ob);
        Thread.sleep(1000);
        action.dragAndDropBy(slide,200,0).perform();    
        
        
        
        WebElement datePicker = ob.findElement(By.xpath("//*[@name='my-date']"));
        datePicker.click();
        datePicker.sendKeys("04/06/2004");
        datePicker.sendKeys(Keys.ENTER);
        
        WebElement submit = ob.findElement(By.xpath("//*[@class='btn btn-outline-primary mt-3']"));
 
		    }
		}

