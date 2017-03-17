/**
 * 
 */
package FinalProject;

/**
 * @author ra316282
 *
 */
public class MainGameClass {

	//This is all of the classes put together. The reason that there is only a few is because there are three or four different classes in each one.
	public static void main(String[] args) 
	{
		//This is the first part of the story line.
		DialogClass.prologue();
		//This is where it will ask you who is the murderer and what happens...
		LoopingClass.LoopingClass();
		//These are the ending results.
		Decision.Decision(); 
	}

}
