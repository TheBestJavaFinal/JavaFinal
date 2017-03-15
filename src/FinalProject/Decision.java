/**
 * 
 */
package FinalProject;
import javax.swing.JOptionPane;

public class Decision {

    public static void main(String[] args) {
        String[] array = {"Brosius", "Ress", "Tatyana", "Charles", "Kassie", "Nick", "Andrew", "Sebastian", "Zach", "Chase", "Isaiah", "Mason"};

        String comGuessKiller = array[getRandom()];

        Object guessKiller = JOptionPane.showInputDialog(null, "Who do you believe is the murderer?", "Choose a person", JOptionPane.QUESTION_MESSAGE, null, array, array[0]);
        System.out.println("Selected is " + guessKiller);

        if (guessKiller == comGuessKiller) {
            JOptionPane.showMessageDialog(null, "Congratulations, You have chosen correctly! There have been no more killings.");
            JOptionPane.showMessageDialog(null, guessKiller + " has been arrested and charged with murder...");
            JOptionPane.showMessageDialog(null, "You leave the class realizing that programming is not your suit, but instead you go on to become a detective. You are now safe, for now...");
            JOptionPane.showMessageDialog(null, "Meanwhile, " + comGuessKiller + " has escaped from prison, finds your picture and says, “I’m coming for you, detective… ");
            JOptionPane.showMessageDialog(null, "To be continued...");
        } else {
            JOptionPane.showMessageDialog(null, "LIGHTS FLASH!!!! THUNDER SOUNDS!!! ");
            JOptionPane.showMessageDialog(null, "You have chosen WRONG! " + guessKiller + "has been MURDERED!!! There is a note right by the body.");

// tagging the dead person. You can delete the person or disable him from menu
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == guessKiller) {
                    array[i] = guessKiller + " is Dead :(";

                }
            }
        }
        for (int d=0; d<array.length;d++){
            System.out.println(array[d]);
        }
    }

    public static int getRandom() {
        int random = (int) (Math.random() * 11) + 0;
        return random;
    }

}
