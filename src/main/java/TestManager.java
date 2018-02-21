public class TestManager {
    public static void main(String[] args) {

        Manager mJohn = new Manager("John", 30, 2000,8);
        Manager mNata = new Manager("Nata", 35, 3000,12);


        //test code starts here
    mJohn.setExp(15);

    //compute actual bonus you are expecting
        double actualBonus = mJohn.getBonus();
        int experience = mJohn.getExp();
        double bonus = mJohn.getBonus();

        System.out.println(bonus);

        if(Double.compare(actualBonus, bonus)== 0){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
}
}