package utitlities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class ReusableMethods {
	public WebDriver rmdriver;
	public static TakesScreenshot ts;
	public ReusableMethods(WebDriver driver)
	{
		this.rmdriver=driver;
	}
  
  public  void getPageScreenShot() throws Exception
  {
	  String ss = "ss";
	  int i=1;
	  	ts =((TakesScreenshot)rmdriver);
		
		File srcpath = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(" The source image file location path is :: "+srcpath);
		System.out.println(System.getProperty("user.dir")+"//Screenshots/"+ss+ i++ +".jpeg");
		
		//Copying the file from one location into other location				
		File despath = new File(System.getProperty("user.dir")+"//Screenshots/"+ss+ i++ +".jpeg");
		Files.copy(srcpath, despath);
		
  }
  
}