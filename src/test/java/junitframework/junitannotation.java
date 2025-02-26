package junitframework;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junitannotation {

	    @BeforeClass
	    public static void setUpBeforeClass()  
	    
	    {
	        System.out.println("BeforeClass: Runs once before all tests.");
	    }
	    
	    @Before
	    public void setUp() 
	    
	    {
	        System.out.println("Before: Runs before each test.");
	    }
	    
	    @Test
	    public void test1() 
	    
	    {
	        System.out.println("Test1: Running test case 1.");
	    }
	    
	    @Test
	    public void test2() {
	        System.out.println("Test2: Running test case 2.");
	    }
	    
	    
	    @After
	    public void tearDown() 
	    
	    {
	        System.out.println("After: Runs after each test.");
	    }
	    
	    @AfterClass
	    public static void tearDownAfterClass() 
	    
	    {
	        System.out.println("AfterClass: Runs once after all tests.");
	    }
	    
	    @Ignore("This test is ignored")
	    @Test
	    public void ignoredTest() {
	        System.out.println("IgnoredTest: This test will not run.");
	    }

}
