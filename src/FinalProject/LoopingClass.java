/**
 * 
 */
package FinalProject;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class LoopingClass 
{

	/*This is part of the program where this will ask you if you want to know more about people. If the user selects yes then it will go
	 * through the loop. If the user selects no then it will go straight through the story.
	 */
	public static void main(String[] args) 
	{
		Object[] People = {"Yes", "No" };
		int n = JOptionPane.showOptionDialog(null, "Would you like to know more about your classmates?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
		
		do{
		switch(n)
			 {
				case 0:
	
				Profiles.Profiles();
			 }	
		n = JOptionPane.showOptionDialog(null, "Would you like to know more about your classmates?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
			 }while(n==0);
			 
			 
		if(n==1)
		{
			MurderMysteryStory.MurderMystery();		
		}
	
	}
}
	
	
