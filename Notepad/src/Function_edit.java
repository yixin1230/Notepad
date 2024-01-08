public class Function_edit {
	GUI gui;

	Function_edit(GUI gui)
	{
		this.gui = gui;
	}
	public void undo()
	{
		gui.un.undo();
	}
	public void redo()
	{
		gui.un.redo();
	}
}
