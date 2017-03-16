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

	/**
	 * @param args
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
	
	
