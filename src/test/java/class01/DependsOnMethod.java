package class01;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void Login() {
        System.out.println("Admin");
    }

    @Test(dependsOnMethods = {"Login"})
    public void TestTheDashBoard() {
        System.out.println("I am testing dashboard page");
    }
}
