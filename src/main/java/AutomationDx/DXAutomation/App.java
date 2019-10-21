package AutomationDx.DXAutomation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class App  
	{
		WebDriver driver;
		
	    public static void main( String[] args)
	    {
	       App ap = new App();
	       ap.launchBrowser();
	       ap.clickjsalert();
	       ap.clickjsconfirm();
	       ap.handlealert();
	       ap.validateresult();
	       ap.closeBrowser();
	     }
	        public void launchBrowser() 
	        {
	       	driver = new ChromeDriver();
	    	driver.get("http://the-internet.herokuapp.com/");
	    	driver.manage().window().maximize();
	     	 }
	        
	public void clickjsalert() {
	       	       	driver.findElement(By.xpath("//li/a[text()='JavaScript Alerts']")).click();
	    	        	    
	}

	public void clickjsconfirm() {
		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	}

	public void handlealert() {
		driver.switchTo().alert().accept();
	}

	public void validateresult() {
		WebElement result = driver.findElement(By.id("result"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(result));
		try
		{
			System.out.println("Element is present");
		}
		catch(Exception e)
		{
			System.out.println("Element is NOT Present");
		}
	}
		public void closeBrowser()
		{
			driver.quit();
		}

		
		
	}

