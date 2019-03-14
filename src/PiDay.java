import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
public static void main(String[] args) {
	String pi = "3.141592653";
	String digit = "0";
	
// Print the first four digits of Pi using a for loop

	
	
// Ask the user for the next digit of Pi

	
// If they get it right, congratulate them 
	
	
// If it isn't right, tell them "No Pie for you!"

	
// Show them the Pi video at: www.youtube.com/watch?v=6TPjRoWm8Ck using the playVideo method below
	
}
	
	static void playVideo(String videoURL) {
	     try {
	          URI uri = new URI(videoURL);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
}
	}
}