package junitframework;

import static org.junit.Assert.*;  // Import assertion methods
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//1. Use @RunWith to enable parameterized testing
@RunWith(Parameterized.class)
public class parameterizedtest {
	
	     private int num1;
	     private int num2;
	     private int expectedSum;

	       // 2. Constructor to assign values from the test data
	        public parameterizedtest(int num1, int num2, int expectedSum) {
	        this.num1 = num1;
	        this.num2 = num2;
	        this.expectedSum = expectedSum;
	        
	        }
	        
	     // 3. Define test data using @Parameterized.Parameters
	        @Parameterized.Parameters
	        public static Collection<Object[]> data() {
	            return Arrays.asList(new Object[][]{
	            	
	                {1, 2, 3},  
	                {5, 5, 10},  
	                {10, 20, 30},  
	                {7, 3, 10}  
	            });
	        }
	        
	     // 4. Test method using parameterized values
	        @Test
	        public void testAddition() {
	            assertEquals(expectedSum, num1 + num2);
	        }

}


