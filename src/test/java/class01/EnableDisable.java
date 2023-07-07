package class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false)
    public void A_test() {
        System.out.println("i am test A");
    }

    @Test
    public void B_test() {
        System.out.println("i am test B");
    }

    @Test(enabled = false)
    public void C_test() {
        System.out.println("i am test C");
    }
}

