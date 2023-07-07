package REVIEW;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotations_3 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before TEST");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("i am after TEST");
    }
}
