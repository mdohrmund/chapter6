package gameZone;

import javax.swing.JOptionPane;

public class randomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int guess;
			int result;
			String resultString;
			String message;
			
			int low = 1;
			int high = 10;
			int score = 10;
			
			result = low + (int)(Math.random() * high);
			do {
			resultString = JOptionPane.showInputDialog(null, "Try to guess my number between " + low + " and " + high);
			guess = Integer.parseInt(resultString);
			score--;
			if(guess==result)
			{
				message = "You Win!";
			}
			else 
				if(guess<result)
				{
					message = "Your guess was too low!";
				}
			else 
					message = "Your guess was too high";
			
			JOptionPane.showMessageDialog(null, message + " Your score is " + score);
			
			}while(result != guess || score==0);
			
		}

	}

}
