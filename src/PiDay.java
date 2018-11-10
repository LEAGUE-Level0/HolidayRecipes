import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = "3.1415926535";

		for (int i = 0; i < 4; i++)
			System.out.print(pi.charAt(i));

		for (int i = 4; i < pi.length(); i++) {
			String digitStr = JOptionPane.showInputDialog("What is next digit of pi?");
			if (Character.toString(pi.charAt(i)).equals(digitStr))
				System.out.print(digitStr);
			else
				System.exit(0);
		}
		//playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
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
