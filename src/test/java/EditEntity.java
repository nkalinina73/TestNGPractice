import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditEntity {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver ch = new ChromeDriver();
        ch.get("http://fits.qauber.com/#/page/login");

        Thread.sleep(2000);
        ch.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("nkalinina73@live.com");
        ch.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("qwe123");
        Thread.sleep(3000);
        ch.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();

        //click on Entity
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();Thread.sleep(4000);
        //click on Edit
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[4]/button[2]/em")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/div[1]/div/input")).clear();

        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/div[1]/div/input")).sendKeys("Odessa");
        //click Update
        Thread.sleep(2000);
        ch.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button")).click();

    }
}
