package mypi.data;

import mypi.CurrentTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author trav
 */
public class CurrentTimeTest {

    public CurrentTimeTest() {
    }

    @Test
    public void testGetTime() {
        CurrentTime theCurrentTimeNow = new CurrentTime();
        String theTimeAtTest = "5:25 PM";
        assertEquals("You will have to update <theTimeAtTest> when running", theTimeAtTest, theCurrentTimeNow.getTime());

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

