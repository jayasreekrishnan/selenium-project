package junitframework;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class errorcollector {
	
	
	@Rule
    public ErrorCollector collector = new ErrorCollector();
	
	
	@Test
    public void testMultipleFailures() {
        int actualValue = 10;
        
        collector.checkThat("First assertion failed", actualValue, is(5));  // Fails but continues
        collector.checkThat("Second assertion failed", actualValue, is(10)); // Passes
        collector.checkThat("Third assertion failed", actualValue, is(15)); // Fails but continues

        System.out.println("Test continues despite assertion failures!");
    }

}
