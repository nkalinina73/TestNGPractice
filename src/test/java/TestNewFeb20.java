import org.testng.annotations.*;

public class TestNewFeb20 {
    @BeforeClass
    public void classSetup(){
        System.out.println("In class setup");
    }
    @AfterMethod
    public void cleanupMethod(){
        System.out.println("Clean Method");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("Setup Method");

    }
    @Test
    public void test1(){
        System.out.println("In test 1");
    }
    @Test
    public void test2(){
        System.out.println("In test 2");
    }
    @AfterClass
    public void classCleanup(){
        System.out.println("In Cleanup");

    }
}
