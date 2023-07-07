package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 4, groups = "smoke")
    public void A_test() {

        System.out.println("i am A test");
    }

    @Test(priority = 3)
    public void B_test() {

        System.out.println("i am B test");
    }

    @Test(priority = 2)
    public void C_test() {

        System.out.println("i am C test");
    }

    @Test(priority = 1)
    public void D_test() {

        System.out.println("i am D test");
    }

    @Test
    public void AB_test() {
        System.out.println("i am test AB");
    }
//    names with no priority beside them are the highest priority
}