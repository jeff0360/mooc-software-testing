package tudelft.gettingstarted;

import org.jetbrains.annotations.TestOnly;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }
    @TestOnly
    public void addFiveToTwenty(){
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
        }

        @TestOnly
// Add the correct numbers
    public void addFiveToZero() {
        int result = new GettingStarted().addFive();
        Assertions.assertEquals();
    }

    @TestOnly
// Add the correct numbers
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @TestOnly
// Write this test
    public void addFiveToMinusTwenty() {

    }

    @TestOnly
// Write this test
    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);
    }

    @TestOnly
// Write this test
    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }

}