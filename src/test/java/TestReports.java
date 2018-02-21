import org.testng.annotations.*;

public class TestReports {
    @AfterSuite
    public void suiteCleanup(){
        System.out.println("-- Suite cleanup--");

    }
    @BeforeSuite
    public void suiteSetup(){
        System.out.println("-- Suite Setnup--");

    }
    @BeforeClass
    public void classSetup(){
        System.out.println("**In class setup**");
    }
    @AfterMethod (alwaysRun = true)
    public void cleanupMethod(){
        System.out.println(".....Report Clean Method.....");
    }
    @BeforeMethod (alwaysRun = true)
    public void setupMethod(){
        System.out.println("....Report Setup Method.....");
    }
    @AfterGroups(groups = "smoke")
    public void setupGroup (){
        System.out.println("******Group closing******");
    }
    @BeforeGroups(groups = "smoke")
    public void cleanupGroup (){
        System.out.println("** Group setup **");
    }
    @Test
    public void test1(){
        System.out.println("Report test 1");
    }
    @Test (groups={"smoke"}, timeOut = 2000)
    public void test2() throws InterruptedException {
        System.out.println("Report test 2");
        //Thread.sleep(4000);
    }
    @Test (groups = {"smoke"}, invocationCount = 3)
    public void test3(){
        System.out.println("Report test 3");
    }
    @Test
    public void test4() {
        System.out.println("Report test 4");
        //in case if user makes wrong input
        //this test covers Stress testing
    }
    @Test
    public void test44() throws InterruptedException {
        System.out.println("Report test TimeOut");
        //in case if user makes wrong input

    }
    @AfterClass
    public void classCleanup(){
        System.out.println("**In class Cleanup**");
    }
}

