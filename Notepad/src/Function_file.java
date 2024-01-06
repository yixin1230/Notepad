import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Function_file
{
	GUI gui;
	String fileName;
	String fileAddress;

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

		if (fd.getFile() != null)
		{
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName);
		}
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));// need the address to read a file
			gui.textArea.setText("");
			String line = br.readLine(); //br:Line break element
			while (line != null)
			{
				line = br.readLine();
				gui.textArea.append(line + "/n");
			}
			br.close();

		}
		catch(Exception e)
		{
			System.out.println("File can not open!");
		}
	}
	public void save()
	{

	}
	public void saveAs()
	{
		FileDialog fd = new FileDialog(gui.window,"Save", FileDialog.SAVE);
		fd.setVisible(true);

		if (fd.getFile() != null)
		{
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName);
		}
		try
		{
			FileWriter fw = new FileWriter( fileAddress + fileName );
			fw.write(gui.textArea.getText());
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("File can not save");
		}
	}
}
