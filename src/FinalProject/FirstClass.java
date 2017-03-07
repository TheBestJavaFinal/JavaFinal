/**
 * 
 */
package FinalProject;
import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String userName, userAge, userHomeLand, userFavFood, userPurpose;
		
		userName = JOptionPane.showInputDialog(null, "What is your name?");
		userAge = JOptionPane.showInputDialog(null, "What is your age?");
		userHomeLand = JOptionPane.showInputDialog(null, "Where are you from? ");
		userFavFood = JOptionPane.showInputDialog(null, "What is your favorite food? ");
		userPurpose = JOptionPane.showInputDialog(null, "Why did you join this class? ");
		
		JOptionPane.showMessageDialog(null, "Your name is " + userName + " , you are " + userAge + " years old, " 
				+ "\nyou are from " + userHomeLand + " your favorite food is " + userFavFood + " "
				+ "\nand you decided to join my class because you said " + userPurpose + ". "
				+ "\nUmm Interesting… Well the class has already started on their first assignment. "
				+ "\nHere’s your book, there is your seat, and get to work. NOW!");

	}

}
