package etc;

import java.io.Console;

public class ConsoleRun {

	public static void main(String[] args) {
	      
	      Console cons = System.console();
	      

	      if (cons != null) {
	         try {
	            System.out.println("name : ");
	            String name = cons.readLine();
	            System.out.println("name = " + name);
	            
	         } catch (Exception e) {
	            System.out.println("Exception event : " + e.getMessage());
	         }
	      } else {
	         System.out.println("Console not use");
	      }
	   }
}
