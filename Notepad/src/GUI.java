
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI {
	JFrame window;
	JTextArea text;
	public static void main(String[] args)
	{
		new GUI();
	}

	public GUI()
	{
		creatWindow();
		window.setVisible(true);
	}

	public void creatWindow()
	{
		window = new JFrame("Notepad");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
