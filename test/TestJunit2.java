import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   // Any method name we can use if we use @Test Annotation and not implimented the Test Case Class
   @Test
   public void anyMethodNameSalutationMessageFail() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
   
   
   // Any method name we can use if we use @Test Annotation and not implimented the Test Case Class
   @Test
   public void anyMethodNameSalutationMessagePass() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}