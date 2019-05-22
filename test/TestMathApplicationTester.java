import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Assert;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class TestMathApplicationTester {
	
 
    //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;
   
   //@Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

   @Test
   public void testAddd(){
    java.util.List<String> mockList = mock(java.util.List.class);
    mockList.add("First");
    when(mockList.get(0)).thenReturn("Mockito");
    when(mockList.get(1)).thenReturn("JCG");
    assertEquals("Mockito", mockList.get(0));
    assertEquals("JCG", mockList.get(1));
   }
   
   @Test
   public void testCalc(){
    //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
   }
}