package useful.view;

import javax.swing.JOptionPane;

/**
 * The popup display class for Ctec
 * @author mmce2349
 *
 */
public class PopupDisplay 
{
	//Display text via popup. 
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Displays the supplied question in a popup and returns the answer as a String. 
	 * @param fromQuestion The question to ask the user.
	 * @return The String Answer
	 */
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
				
	}
}
