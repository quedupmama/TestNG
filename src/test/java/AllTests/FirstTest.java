package AllTests;


import org.testng.annotations.Test;

public class FirstTest {


    @Test(priority = 0) {
        void setUp()
        System.out.println("This is setup");

        @Test(priority = 3) {
            void testLogin()
            System.out.println("This is setup");

            @Test(priority = 2) {
                void tearDown()
                System.out.println("This is setup");
            }
        }
    }
}