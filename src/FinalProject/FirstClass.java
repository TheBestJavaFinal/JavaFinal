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
		int Cancel = 1;
		int victim;
		int victim2;
		int victim3;
		int victim4;
		int victim5;
		int victim6;
		int victim7;
		int victim8;
		int killer;
		int response;
		
		
		 response = Integer.parseInt(JOptionPane.showInputDialog(null,"Would you like to play the game? "));
		
		do	{
			DialogClass.prologue();
			}while(response != Cancel);
			
			Profiles();
			Object[] People = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7", "Person 8", "Person 9", "Person 10", "Person 11", "Person 12",  "Move On" };
			int n = JOptionPane.showOptionDialog(null, "Which person would you like to know about?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
	}

	private static void Profiles() 
	{
		//This is where the program tells you to pick a person you would like to know more about.
		{
		Object[] People = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7", "Person 8", "Person 9", "Person 10", "Person 11", "Person 12",  "Move On" };
		int n = JOptionPane.showOptionDialog(null, "Which person would you like to know about?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
		
		//This part tells you the different options and what happens when you press each option.
		switch(n)
			 {
		//This tells you about everyone.
				case 0:
	
				 JOptionPane.showMessageDialog(null, " That’s just John. He is a huge pain in the… "
				 + "\nwait I forgot you are a new classmate. He is the teacher, BUT…. he  is so annoying. "
				 + "\nHe keeps messing with my projects and distracting me! So good luck trying to get anything done around him… "
				 + "\nGood teacher though and he knows his stuff.");
				 break;
				 
				//This tells you about The teacher.
				case 1:
				JOptionPane.showMessageDialog(null,"That’s Ress…. I cannot pronounce her last name… Anyway actually now that you mention her, "
				+ "\nI don’t know much about her. She seems nice, but then again not everyone who seems nice is…");
				break;
			
				//This tells you about my partner.
				case 2:
				JOptionPane.showMessageDialog(null,"That’s Tatyana. She knows everything, so if you have any questions, "
				+ "\nshe’s the person to ask… although… she is a little bit mysterious so no one really approaches her. "
				+ "\nShe seems scary so do not ask me to approach her…");
				break;
			
				//This tells you about myself, and so on with the rest of the cases.
			case 3:
				JOptionPane.showMessageDialog(null,"Well duh, you already know my name! Were you not listening to me before? Well I’m Charles! "
				+ "\nI have had 3 classes with Mr. Brosius so if you need anything, you can ask me… I know just about everything, except github. "
				+ "\nDO NOT ASK ME ABOUT GITHUB! ");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"That’s Kassie she gets straight A’s and is very smart. In fact a little too smart… "
				+ "\nSome say she hacked into some bank accounts and that is how she gets her money");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Who are you talking…. WOW! He is actually here today!!! Usually he NEVER shows up! "
				+ "\nThere must be a special reason that he is here today… hmm… I don’t know. Anyway that’s Nick, why he is still trying to"
				+ "\n take the class I don’t know.");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Oh that is Sebastian. He is the teacher’s pet. You can count on him to be on his side. "
				+ "\nHe agrees with everything he says..");
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"That is Zach. Him, Mason, and Chase are all close friends with each other.");
				break;
			case 8:
				JOptionPane.showMessageDialog(null,"That is Chase. Him, Mason, and Zach are all close friends with each other.");
			break;
			case 9:
				JOptionPane.showMessageDialog(null,"That is Isaiah. He complains about everything!!! But then he never does any work.");
			break;
			case 10:
				JOptionPane.showMessageDialog(null, "That is Mason. Him, Zach and Chase, are all close friends with each other.");
			break;
			case 11:
				JOptionPane.showMessageDialog(null, "That is Andrew, my best friend. He is my partner in crime if you know what I mean… "
						+ "in case you don’t I am referring to assignments and stuff.");
			break;
			case 12: 
				JOptionPane.showMessageDialog(null, "Now that you have gotten to know some people, you slowly ease into your homework assignments.");
			break;
			default:
			JOptionPane.showMessageDialog(null, "Now that you have gotten to know some people, you slowly ease into your homework assignments.");
			
			}
		}
	}
}
