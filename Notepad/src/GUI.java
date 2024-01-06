
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPane;
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuCol;
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

	Function_file file = new Function_file(this);

	public static void main(String[] args)
	{
		new GUI();
	}

	public GUI()
	{
		createWindow();
		createTextArea();
		createMenuBar();
		createFileMenu();
		window.setVisible(true);
	}

	public void createWindow()
	{
		window = new JFrame("Notepad");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createTextArea()
	{
		textArea = new JTextArea();
		window.add(textArea);
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());//make border beautifuler.
		window.add(scrollPane);
	}

	public void createMenuBar()
	{
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);

		menuFile = new JMenu("File");
		menuBar.add(menuFile);

		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);

		menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);

		menuCol = new JMenu("Color");
		menuBar.add(menuCol);
	}

	public void createFileMenu()
	{
		iNew = new JMenuItem("New");
		iNew.addActionListener(this);
		iNew.setActionCommand("new");
		menuFile.add(iNew);

		iOpen = new JMenuItem("Open");
		menuFile.add(iOpen);

		iSave = new JMenuItem("Save");
		menuFile.add(iSave);

		iSaveAs = new JMenuItem("SaveAs");
		menuFile.add(iSaveAs);

		iExit = new JMenuItem("Exit");
		menuFile.add(iExit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch(command)
		{
			case "New":file.newFile(); break;
		}

	}
}
