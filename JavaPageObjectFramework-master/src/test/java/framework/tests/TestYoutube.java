package framework.tests;

import framework.pages.TrainingPage;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

public class TestYoutube extends BaseTest{

@Test public void TestForFun() throws InterruptedException
{
    TrainingPage trainingPuslapis = new TrainingPage(driver);

    driver.navigate().to("https://www.aliexpress.com/");
    palauktiElemento(trainingPuslapis.paieska);

    trainingPuslapis.paieska.sendKeys("Looking for a job because I wanna buy a");
    Thread.sleep(1000);

    try {trainingPuslapis.xbutton.click();}
    catch (Exception e){Thread.sleep(500);
    }

    trainingPuslapis.paieska.sendKeys((Keys.chord(Keys.CONTROL, "a")));
    trainingPuslapis.paieska.sendKeys("sports car");
    trainingPuslapis.paieska.sendKeys(Keys.ENTER);


    Thread.sleep(1000);
    try {trainingPuslapis.xbutton.click();}
    catch (Exception e){Thread.sleep(500);
    }
    trainingPuslapis.minimalus.sendKeys("100000");
    trainingPuslapis.maksimalus.sendKeys("20000");
    trainingPuslapis.maksimalus.sendKeys(Keys.ENTER);

    try {trainingPuslapis.xbutton.click();}
    catch (Exception e){Thread.sleep(500);}

    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0, 2000);");
    Thread.sleep(2000);

    try {
        String pageUrl = "https://www.google.com";
        this.driver.get(pageUrl);

        JavascriptExecutor jsExecutor = (JavascriptExecutor)this.driver;
        String jsOpenNewWindow = "window.open('"+pageUrl+"');";
        for(int i=0;i<6;i++)
        {
            jsExecutor.executeScript(jsOpenNewWindow);
            Thread.sleep(1000);
            System.out.println((i+1)+" opened.");
        }
        Set<String> windowHandleSet = this.driver.getWindowHandles();
        if(windowHandleSet!=null)
        {
            Iterator<String> it = windowHandleSet.iterator();
            int i = 0;
            while(it.hasNext())
            {
                String windowHandleStr = it.next();
                System.out.println("WindowHandler String : " + windowHandleStr);

                if(i==2)
                {
                    this.driver.switchTo().window(windowHandleStr);
                    this.driver.get("http://www.ebay.co.uk");
                    System.out.println("Switch Window " + windowHandleStr + " to http://www.google.com");
                    trainingPuslapis.ebaysearch.sendKeys("lotus car");
                    trainingPuslapis.ebaysearch.sendKeys(Keys.ENTER);
                    palauktiElemento(trainingPuslapis.ebay2019);
                    trainingPuslapis.ebay2019.click();
                    Thread.sleep(1000);
                    try {
                        File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                        FileUtils.copyFile(srcFile, new File("C:/selenium/Mywish.jpeg"));}
                    catch (Exception e){
                        Thread.sleep(1000);}
                }
                i++;

                if(i==1)
                {
                    this.driver.switchTo().window(windowHandleStr);
                    this.driver.close();
                    System.out.println("Close " + windowHandleStr);
                    Thread.sleep(2000);
                }
            }
        }
    }

    catch (Exception e){};

    driver.get("C:\\Selenium\\Mywish.jpeg");
    Thread.sleep(5000);

    driver.manage().window().setSize(new Dimension(1920,1080));
    Thread.sleep(300);
    driver.manage().window().setSize(new Dimension(1366,768));
    Thread.sleep(300);
    driver.manage().window().setSize(new Dimension(1280,720));
    Thread.sleep(300);
    driver.manage().window().setSize(new Dimension(1024,768));
    Thread.sleep(300);
    driver.manage().window().setSize(new Dimension(360,640));
    Thread.sleep(300);
    driver.manage().window().setPosition(new Point(800,00));
    Thread.sleep(1000);

    driver.manage().window().maximize();

    driver.get("https://youtu.be/nwTTRy4O-iU?t=11");
    Thread.sleep(6000);

    try {trainingPuslapis.skip.click();
        Thread.sleep(11500);}
    catch (Exception e){
        Thread.sleep(4500);
    }
    trainingPuslapis.searchLaukas.sendKeys("I will tell you how I feel");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(3000);

    driver.get("https://youtu.be/DGIgXP9SvB8?t=86");
    trainingPuslapis.searchLaukas.sendKeys("Who cares what the haters say");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(6000);
    try {
        trainingPuslapis.skip.click();
        Thread.sleep(8000);}
    catch (Exception e){
        Thread.sleep(1000);
    }
    Thread.sleep(11000);

    driver.get("https://youtu.be/DGIgXP9SvB8?t=150");
    Thread.sleep(6000);
    try {
        trainingPuslapis.skip.click();
        Thread.sleep(20000);}
    catch (Exception e){
        Thread.sleep(13000);}
    trainingPuslapis.searchLaukas.sendKeys("I'll be that number one");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(61000);

    driver.get("https://youtu.be/ASO_zypdnsQ?t=46");
    trainingPuslapis.searchLaukas.sendKeys("How do I test?");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(6000);
    try {trainingPuslapis.skip.isDisplayed();
        trainingPuslapis.skip.click();
        Thread.sleep(7010);}
    catch (Exception e){
        Thread.sleep(10);
    }
    trainingPuslapis.searchLaukas.sendKeys((Keys.chord(Keys.CONTROL, "a")));
    trainingPuslapis.searchLaukas.sendKeys("Like a gentleman");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(3500);

    driver.get("https://youtu.be/ftgmdRlDkko?t=117");
    trainingPuslapis.searchLaukas.sendKeys("How I see DEVs and the system");
    Thread.sleep(6000);
    try {trainingPuslapis.skip.isDisplayed();
        trainingPuslapis.skip.click();
        Thread.sleep(7010);}
    catch (Exception e){
        Thread.sleep(10);}
    Thread.sleep(160000);

    driver.get("https://youtu.be/YBHQbu5rbdQ?t=67");
    trainingPuslapis.searchLaukas.sendKeys("And about the job in your company");
    trainingPuslapis.searchLaukas.sendKeys(Keys.ESCAPE);
    Thread.sleep(6000);
    try {trainingPuslapis.skip.isDisplayed();
        trainingPuslapis.skip.click();
        Thread.sleep(7010);}
    catch (Exception e){
        Thread.sleep(10);}
    trainingPuslapis.like.click();
    Thread.sleep(26500);

}}
