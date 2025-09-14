## Project Title
A Word-Guess game with a GUI.
- Like a hang man game but without the man.

## Features
- Generate random word from adjustable text file.
- Save and load the game progress.
- Point and hint based game.
- Let users pick a color theme out of 5 options.

## Technologies Used
- Language: Java
- GUI Library: JavaFX, SceneBuilder
- IDE: IntelliJ IDEA

## How To Run
### Option 1: Run from source code
1. Clone the repository.
2. Open the folder in your IDE.
3. Run the 'MainApplication.java' file.

### Option 2: Run JAR file
1. Download the 'wordGuess.jar' file.
2. Open terminal and go to the folder where the jar file is saved (using terminal commands)
3. Run it with the below command (replace your path in):

java --module-path "C:(where SDK is saved)\lib" --add-modules javafx.controls,javafx.fxml -jar wordGuess.jar

- For example my command is:
java --module-path "C:\Users\AnhNg\IdeaProjects\openjfx-24_windows-x64_bin-sdk\javafx-sdk-24\lib" --add-modules javafx.controls,javafx.fxml -jar wordGuess.jar

## What I Learned / Why I Made This
- Practice GUI layout with buttons and colors.
- Figure out how a word guess game works (with GUI).
- Practice with load/save file and get data through text file.

## License
This project is for learning purposes only.