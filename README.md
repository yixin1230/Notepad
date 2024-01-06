# :page_facing_up:Notepad
## Intro
![Screenshot 2024-01-06 at 15 06 15](https://github.com/yixin1230/Notepad/assets/100164159/dc0823e4-d4bc-4378-83f8-f220b33ab15e)
I developed a Notepad in java with the help of AWT/Swing with event handling to practice my Java programming skills<br>
<br>
I developed following function in this Notepad:
- Users can create new text files and note down the notes.
- Users can open the existing text files
- Users can save the text file on their machine
- Users can also format their test on different font-styles, font-size.

## Compile the project
```
cd src
javac *.java
```
## Run the project
```
java GUI
```
## Note for this project
<br>

```setDefaultCloseOperation(JFrane.EXIT_ON_CLOSE)``` :
- A method used to specify the default close operation for a JFrame.
- This method is typically used to define what happens when the user clocks the close button(the 'X' button) on the window's title bar.
<br>

```BufferedReader```:
- A class which reads text from a character-input stream
  <br>
- ```readLine()```: method of BufferedReader class in Java is used to read one line text at a time. The end of a line is to be understood by '\n' or '/r' or EOF. No parameter. Return a String
- 