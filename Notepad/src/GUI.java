
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
	boolean wordWrapOn = false;
	//top menu bar
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuCol;

	//file menu
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

	//format menu
	JMenuItem iWrap, iFontArial, iFontCSMS, iFontTNR, iFontSize8, iFontSize12,iFontSize16,iFontSize20,iFontSize24,iFontSize28;
	JMenu font, fontSize;

	//Color menu
	JMenuItem iColor1, iColor2, iColor3;


	Function_file file = new Function_file(this);
	Function_format forMat = new Function_format(this);
	Function_color color = new Function_color(this);

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
		createColorMenu();
		forMat.selectedFont = "Arial";
		forMat.createFont(16);
		color.changeColor("black");
		forMat.wordWrap();
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
		iWrap = new JMenuItem("Word Wrap: off");
		iWrap.addActionListener(this);
		iWrap.setActionCommand("WordWrap");
		menuFormat.add(iWrap);

		font = new JMenu("Font");
		menuFormat.add(font);

		iFontArial = new JMenuItem("Arial");
		iFontArial.addActionListener(this);
		iFontArial.setActionCommand("Arial");
		font.add(iFontArial);

		iFontCSMS = new JMenuItem("Comic Sans MS");
		iFontCSMS.addActionListener(this);
		iFontCSMS.setActionCommand("Comic Sans MS");
		font.add(iFontCSMS);

		iFontTNR = new JMenuItem("Times New Roman");
		iFontTNR.addActionListener(this);
		iFontTNR.setActionCommand("Times New Roman");
		font.add(iFontTNR);

		fontSize = new JMenu("Font Size");
		menuFormat.add(fontSize);

		iFontSize8 = new JMenuItem("8");
		iFontSize8.addActionListener(this);
		iFontSize8.setActionCommand("size8");
		fontSize.add(iFontSize8);

		iFontSize12 = new JMenuItem("12");
		iFontSize12.addActionListener(this);
		iFontSize12.setActionCommand("size12");
		fontSize.add(iFontSize12);

		iFontSize16 = new JMenuItem("16");
		iFontSize16.addActionListener(this);
		iFontSize16.setActionCommand("size16");
		fontSize.add(iFontSize16);

		iFontSize20 = new JMenuItem("20");
		iFontSize20.addActionListener(this);
		iFontSize20.setActionCommand("size20");
		fontSize.add(iFontSize20);

		iFontSize24 = new JMenuItem("24");
		iFontSize24.addActionListener(this);
		iFontSize24.setActionCommand("size24");
		fontSize.add(iFontSize24);

		iFontSize28 = new JMenuItem("28");
		iFontSize28.addActionListener(this);
		iFontSize28.setActionCommand("size28");
		fontSize.add(iFontSize28);
	}

	public void createColorMenu()
	{
		iColor1 = new JMenuItem("White");
		iColor1.addActionListener(this);
		iColor1.setActionCommand("White");
		menuCol.add(iColor1);

		iColor2 = new JMenuItem("Black");
		iColor2.addActionListener(this);
		iColor2.setActionCommand("Black");
		menuCol.add(iColor2);

		iColor3 = new JMenuItem("Blue");
		iColor3.addActionListener(this);
		iColor3.setActionCommand("Blue");
		menuCol.add(iColor3);
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
			case "WordWrap": forMat.wordWrap(); break;
			case "Arial": forMat.setFont(command);break;
			case "Comic Sans MS": forMat.setFont("Comic Sans MS");break;
			case "Times New Roman": forMat.setFont("Times New Roman");break;
			case "size8": forMat.createFont(8); break;
			case "size12": forMat.createFont(12); break;
			case "size16": forMat.createFont(16); break;
			case "size20": forMat.createFont(20); break;
			case "size28": forMat.createFont(28); break;
			case "White" :color.changeColor("White"); break;
			case "Black":color.changeColor("Black");break;
			case "Blue":color.changeColor("Blue"); break;
		}
	}
}
