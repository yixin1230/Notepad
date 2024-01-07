import java.awt.*;

public class Function_format {
	GUI gui;
	Font arial, comicSansMS, timesNewRoman;

	Function_format(GUI gui)
	{
		this.gui = gui;
	}

	public void wordWrap()
	{
		if (!gui.wordWrapOn)
		{
			gui.wordWrapOn = true;
			gui.textArea.setLineWrap(true);
			gui.textArea.setLineWrap(true);
			gui.iWrap.setText("Word Wrap: on");
		}
		else
		{
			gui.wordWrapOn = false;
			gui.textArea.setLineWrap(false);
			gui.textArea.setLineWrap(false);
			gui.iWrap.setText("Word Wrap: off");
		}
	}

	public void createFont(int fontSize)
	{
		arial = new Font("Arial", Font.PLAIN, fontSize);
		comicSansMS = new Font("comic Sans MS", Font.PLAIN, fontSize);
		timesNewRoman = new Font("Time New Roman", Font.PLAIN, fontSize);
	}
}
