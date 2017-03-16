/**
 * 
 */
package FinalProject;

import javax.swing.JOptionPane;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

    public class Decision
    {
    	public static void Decision()
    	{
   		 boolean playGame = true;
   		 int count = 12;
   		 
        	List<String> suspectList = new ArrayList <>(Arrays.asList("Brosius", "Ress", "Tatyana", "Charles", "Kassie", "Nick", "Andrew", "Sebastian", "Zach", "Chase", "Isaiah", "Mason"));
// DONT FORGET TO REMOVE THIS RESS!!
        	String comGuessKiller = suspectList.get(11);
        	do
        	{
        	Object guessKiller = JOptionPane.showInputDialog(null, "Who do you believe is the murderer?", "Choose a person", JOptionPane.QUESTION_MESSAGE, null, suspectList.toArray(), suspectList.get(0));
        	//System.out.println("Selected is " + guessKiller);
       	 
        	if (guessKiller == comGuessKiller)
        	{
            	JOptionPane.showMessageDialog(null, "Congratulations, You have chosen correctly! There have been no more killings.");
            	JOptionPane.showMessageDialog(null, guessKiller + " has been arrested and charged with murder...");
            	JOptionPane.showMessageDialog(null, "You leave the class realizing that programming is not your suit, but instead you go on to become a detective. You are now safe, for now...");
            	JOptionPane.showMessageDialog(null, "Meanwhile, " + comGuessKiller + " has escaped from prison, finds your picture and says, “I’m coming for you, detective… ");
            	JOptionPane.showMessageDialog(null, "To be continued...");
            	playGame = false;
        	}
        	else {
            	JOptionPane.showMessageDialog(null, "LIGHTS FLASH!!!! THUNDER SOUNDS!!! ");
            	JOptionPane.showMessageDialog(null, "You have chosen WRONG! " + guessKiller + " has been MURDERED!!! There is a note right by the body.");
           	 
            	Notes.message();
           	 
            	count --;

    // tagging the dead person. You can delete the person or disable him from menu
            	for (int i = suspectList.size() - 1; i >= 0; i--)
            	{
                	if (suspectList.get(i) == guessKiller)
                	{
               		 suspectList.remove(i);
                	}
            	}
        	}
        	}while (playGame == true && count > 2);
        	System.out.println(count);
        	if (count == 2)
        	{
       		 JOptionPane.showMessageDialog(null, "You are the worst investigator in the WORLD!!");
       		 JOptionPane.showMessageDialog(null, "The last person is now dead.");
       		 JOptionPane.showMessageDialog(null, "It's too late..");
       		 JOptionPane.showMessageDialog(null, "you're next.");
       		JOptionPane.showMessageDialog(null, "GAME OVER!!!");
        	}
        	
        	/*for (int d=0; d<array.length;d++){
            	System.out.println(array[d]);
        	}*/
    	}

    	public static int getRandom() {
        	int random = (int) (Math.random() * 11) + 0;
        	return random;
    	}
    }
