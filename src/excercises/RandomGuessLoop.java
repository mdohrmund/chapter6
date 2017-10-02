package excercises;
import javax.swing.JOptionPane;
public class RandomGuessLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int guess;
		int result;
		String resultString;
		String msg;
		
		int low = 1;
		int high = 100;
		
		int score = 10;
		
		result = low + (int)(Math.random() * high);
	do {
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between " +
		low + " and " + high);
		guess = Integer.parseInt(resultString);
		score--;
		if(guess==result)
		{
			msg = "You win";
		}
		
		else
			if(guess<result)
		{
			msg = "Too low";
			
		}
		
			else
			
				msg = "Too high";
				
		JOptionPane.showMessageDialog(null, msg + ". Your score was " + score);		
    //JOptionPane.showInputDialog(null, "Would you like to try again?");
	}while(result != guess || score == 0);
}
}