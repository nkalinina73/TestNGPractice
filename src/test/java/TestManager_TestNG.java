import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestManager_TestNG {
    Manager m;

    //setup
    @BeforeClass
    public void setUp(){
        System.out.println("In setUp Method");

          //  m  = new Manager("John”, 23, 2000);
        }
    //test
    @Test
    public void testGetBonus(){
        System.out.println("In test 1");

        //set the experience for John
        m.setExp(11);
        //compute actual bonus you are expecting
        double actualBonus = m.getSalary() * .15;

        //validation
        int experience = m.getExp();
        //double bonus = m.getBonus(experience);

        //int equal = Double.compare(actualBonus, bonus);

       // Assert.assertEquals(equal,0, "Validation failed for getBonus method”);

    }

    @Test
    public void test2(){
        System.out.println("In test 2");

    }
    //cleanup
    @AfterClass
    public void tearDown(){
        System.out.println("In tear down");

    }
}
