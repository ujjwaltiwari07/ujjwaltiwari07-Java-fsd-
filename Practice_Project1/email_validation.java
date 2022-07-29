import java.util.ArrayList;
import java.util.List;
import org.apache.commons.validator.routines.EmailValidator;

 class email_validation{
   public static boolean isValidEmail(String email) {
       
	   email_validation validator = email_validation.getInstance();

       
       return validator.isValid(email);
   }

   public static void main(String[] args) {
       List<String> emails = new ArrayList<String>();       emails.add("alice@example.com");
       emails.add("alice.bob@example.com");
       emails.add("alice@example.me.org");
       
       emails.add("alice.example.com");
       emails.add("alice..bob@example.com");
       emails.add("alice@.example.com");

       for (String value : emails) {
           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
       }
   }
}