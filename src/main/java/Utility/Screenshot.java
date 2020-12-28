package Utility;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Screenshot { 
	    public static void Screenshots(WebDriver d,float i) throws IOException
	    {
	        File ss=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(ss,new File("./Screenshot/"+i+".jpg"));
	    }
}
