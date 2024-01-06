
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
	//open window
	JFrame window;

	//text
	JTextArea textArea;
	JScrollPane scrollPane;

	//top menu bar
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuCol;

	//file menu
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

	//format menu
	JMenuItem wordWrap, font, fontSize;
	//font menu
	//fontSize menu


	Function_file file = new Function_file(this);
	Function_format forMat = new Function_format(this);

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
		createFormatMenu();
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
		iNew.setActionCommand("New");
		menuFile.add(iNew);

		iOpen = new JMenuItem("Open");
		iOpen.addActionListener(this);
		iOpen.setActionCommand("Open");
		menuFile.add(iOpen);

		iSave = new JMenuItem("Save");
		iSave.addActionListener(this);
		iSave.setActionCommand("Save");
		menuFile.add(iSave);

		iSaveAs = new JMenuItem("Save As");
		iSaveAs.addActionListener(this);
		iSaveAs.setActionCommand("SaveAs");
		menuFile.add(iSaveAs);

		iExit = new JMenuItem("Exit");
		iExit.addActionListener(this);
		iExit.setActionCommand("Exit");
		menuFile.add(iExit);
	}
	public void createFormatMenu()
	{
		wordWrap = new JMenuItem("Word Wrap");
		wordWrap.addActionListener(this);
		wordWrap.setActionCommand("WordWrap");
		menuFormat.add(wordWrap);

		font = new JMenuItem("Font");
		font.addActionListener(this);
		font.setActionCommand("Font");
		menuFormat.add(font);

		fontSize = new JMenuItem("Font Size");
		fontSize.addActionListener(this);
		fontSize.setActionCommand("FontSize");
		menuFormat.add(fontSize);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch(command)
		{
			case "New": file.newFile(); break;
			case "Open":file.open(); break;
			case "Save":file.save(); break;
			case "SaveAs":file.saveAs(); break;
			case "Exit":file.exit(); break;
		}
	}
}
