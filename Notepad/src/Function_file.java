import java.awt.*;

public class Function_file {
	GUI gui;
	public Function_file(GUI gui)
	{
		this.gui = gui;
	}

	public void newFile()
	{
		gui.textArea.setText("");
		gui.window.setTitle("New");
	}

	public void open()
	{
		FileDialog fd = new FileDialog(gui.window,"Open", FileDialog.LOAD);
		fd.setVisible(true);
	}
}
