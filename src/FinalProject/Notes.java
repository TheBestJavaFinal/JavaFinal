/**
 * 
 */
package FinalProject;
import javax.swing.JOptionPane;
/**
 * @author ra316282
 *
 */
public class Notes
{
	//This class holds an array of notes that the killer left behind. This class also 
    public static void Notes()
    {
   	 message();
    }
    public static void message()
    {
    	String[] messageArray=new String[9];
    	messageArray[0]="Ha Ha! You will NEVER CATCH ME!!";
    	messageArray[1]="CATCH ME IF YOU CAN!!";
    	messageArray[2]="CATCH ME OR YOU’RE NEXT!!!!";
    	messageArray[3]="You better not look behind you...";
    	messageArray[4]="Let’s see who wins : ME or YOU!";
    	messageArray[5]="Don’t look in the closet if you want to live…";
    	messageArray[6]= "I’m coming for you all…";
    	messageArray[7]="The projector takes over the computers and creepy words end up on the screen. ";
    	messageArray[8]="I've got you all where I want you... Get ready for me…";
   	 
    	int randomM = (int) (Math.random() * 9) + 0;
    	JOptionPane.showMessageDialog(null, messageArray[randomM]);



    	}

    }
