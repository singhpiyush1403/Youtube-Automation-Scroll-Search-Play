import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScroll {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://Google.com");
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("Aajtak News",Keys.ENTER);
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1900)");
	
	driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img")).click();
	
	try {
		Thread.sleep(4000);
	}
	catch(InterruptedException r) {
		r.printStackTrace();	
	}
	
	System.out.println("Programm Successfully Execute");

	
	driver.close();

	}

}
