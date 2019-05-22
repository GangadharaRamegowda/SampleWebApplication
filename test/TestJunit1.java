import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Robert";	
   private MessageUtil messageUtil = new MessageUtil(message);
   
   @Before 
   public void setUp() {
      System.out.println("*********TestJunit1 SetUp ****************");    
   }
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}