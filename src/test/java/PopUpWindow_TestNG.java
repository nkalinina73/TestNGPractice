import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class PopUpWindow_TestNG {
    WebDriver ch = new ChromeDriver();
    @BeforeClass
    public void preconditionsMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        //WebDriver ch = new ChromeDriver();
        ch.get("http://fits.qauber.com/#/page/login");
    }
    @BeforeMethod
    public void settingupMethod() throws InterruptedException {
        Thread.sleep(2000);
        ch.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("nkalinina73@live.com");
        ch.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("qwe123");
        Thread.sleep(3000);
        ch.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();
    }
   @AfterMethod
    public void cleaningupMethod()throws InterruptedException {
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/header/nav/div[2]/ul[2]/li/a/span")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/aside[2]/nav/div/div/div[1]/div/div/div[4]/button")).click();
    }

    @Test  //PopUp window
    public void testing1() throws InterruptedException {
        Thread.sleep(3000);
        ch.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[1]/div/div[1]/a")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/h3/button")).click();

        //varify that popup window is open
        String compare = "Add";
        Assert.assertTrue(ch.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]")).getText().contains(compare));
        System.out.println("Comparison successfull!");
        System.out.println("Known string: " + compare);
        System.out.println("Element returns: " + ch.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]")).getText().contains(compare));

        //Type department name.
        Thread.sleep(2000);
        //ch.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[1]/form/div[1]/input")).sendKeys("Production");
        ch.findElement(By.xpath("//div/input[@org-id='$depCtrl.parent.orgId']")).sendKeys("Production");
        Thread.sleep(2000);
        ch.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[1]/form/div[2]/button")).click();

        //Delete department
        Thread.sleep(3000);
        //ch.findElement(By.className("fa fa-trash")).click();
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[7]/td[2]/button[4]/em")).click();
        Thread.sleep(3000);
        ch.findElement(By.xpath("//*[@id=\"ngdialog2\"]/div[2]/div/button[1]")).click();
        Thread.sleep(3000);
        ch.navigate().back();
    }
    @Test (dependsOnMethods = "testing1", alwaysRun = true, enabled = true)
        public void testing2() throws InterruptedException {
        //click on Entity
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
        Thread.sleep(4000);
        //click on Edit
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[4]/button[2]")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/div[1]/div/input")).clear();

        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/div[1]/div/input")).sendKeys("Kiev");
        //click Update
        Thread.sleep(4000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button")).click();
        Thread.sleep(4000);
        ch.navigate().back();


    }

    @AfterClass
    public void tearDownFinal() throws InterruptedException{

        Thread.sleep(4000);
        ch.close();

    }
}
