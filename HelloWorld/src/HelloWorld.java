import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		try (Scanner scanner = new Scanner(System.in)) {
			HelloUser user = new HelloUser();
			user.setUserName(scanner.nextLine());
			user.greetUser();
		} catch (Exception e) {
			System.out.println("Couldn't get the username from the keyboard.");
		}
	}

}
