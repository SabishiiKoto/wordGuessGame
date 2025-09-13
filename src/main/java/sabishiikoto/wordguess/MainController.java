package sabishiikoto.wordguess;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class MainController {
    private Game game;
    private Word word;
    public ArrayList<Word> wordList;
    private StringBuilder wordBuild = new StringBuilder();
    private int turn;
    public static int winTimes;
    public static int loseTimes;


    @FXML
    private Button buttonNext;
    @FXML
    private Button buttonForA;

    @FXML
    private Button buttonForB;

    @FXML
    private Button buttonForC;

    @FXML
    private Button buttonForD;

    @FXML
    private Button buttonForE;

    @FXML
    private Button buttonForF;

    @FXML
    private Button buttonForG;

    @FXML
    private Button buttonForH;

    @FXML
    private Button buttonForI;

    @FXML
    private Button buttonForJ;

    @FXML
    private Button buttonForK;

    @FXML
    private Button buttonForL;

    @FXML
    private Button buttonForM;

    @FXML
    private Button buttonForN;

    @FXML
    private Button buttonForO;

    @FXML
    private Button buttonForP;

    @FXML
    private Button buttonForQ;

    @FXML
    private Button buttonForR;

    @FXML
    private Button buttonForS;

    @FXML
    private Button buttonForT;

    @FXML
    private Button buttonForU;

    @FXML
    private Button buttonForV;

    @FXML
    private Button buttonForW;

    @FXML
    private Button buttonForX;

    @FXML
    private Button buttonForY;

    @FXML
    private Button buttonForZ;

    @FXML
    private Button buttonHint;

    @FXML
    private Label labelForGuessNumber;

    @FXML
    private Label labelForError;
    @FXML
    private Label labelForLevel;

    @FXML
    private Label labelForScore;

    @FXML
    private Label labelForWord;

    @FXML
    void aboutTrigger(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About This Word Guess Game!");
        alert.setHeaderText("Information and Contact");
        alert.setContentText("Please notice me if there is any error.\nFor contact, check out my GitHub:\nhttps://github.com/SabishiiKoto");
        alert.showAndWait();
    }

    @FXML
    void buttonA(ActionEvent event) {
        setLabelForGuessedChar('A');
        buttonForA.setDisable(true);
    }

    @FXML
    void buttonB(ActionEvent event) {
        setLabelForGuessedChar('B');
        buttonForB.setDisable(true);
    }

    @FXML
    void buttonC(ActionEvent event) {
        setLabelForGuessedChar('C');
        buttonForC.setDisable(true);
    }

    @FXML
    void buttonD(ActionEvent event) {
        setLabelForGuessedChar('D');
        buttonForD.setDisable(true);
    }

    @FXML
    void buttonE(ActionEvent event) {
        setLabelForGuessedChar('E');
        buttonForE.setDisable(true);
    }

    @FXML
    void buttonF(ActionEvent event) {
        setLabelForGuessedChar('F');
        buttonForF.setDisable(true);
    }

    @FXML
    void buttonG(ActionEvent event) {
        setLabelForGuessedChar('G');
        buttonForG.setDisable(true);
    }

    @FXML
    void buttonH(ActionEvent event) {
        setLabelForGuessedChar('H');
        buttonForH.setDisable(true);
    }

    @FXML
    void buttonI(ActionEvent event) {
        setLabelForGuessedChar('I');
        buttonForI.setDisable(true);
    }

    @FXML
    void buttonJ(ActionEvent event) {
        setLabelForGuessedChar('J');
        buttonForJ.setDisable(true);
    }

    @FXML
    void buttonK(ActionEvent event) {
        setLabelForGuessedChar('K');
        buttonForK.setDisable(true);
    }

    @FXML
    void buttonL(ActionEvent event) {
        setLabelForGuessedChar('L');
        buttonForL.setDisable(true);
    }

    @FXML
    void buttonM(ActionEvent event) {
        setLabelForGuessedChar('M');
        buttonForM.setDisable(true);
    }

    @FXML
    void buttonN(ActionEvent event) {
        setLabelForGuessedChar('N');
        buttonForN.setDisable(true);
    }

    @FXML
    void buttonO(ActionEvent event) {
        setLabelForGuessedChar('O');
        buttonForO.setDisable(true);
    }

    @FXML
    void buttonP(ActionEvent event) {
        setLabelForGuessedChar('P');
        buttonForP.setDisable(true);
    }

    @FXML
    void buttonQ(ActionEvent event) {
        setLabelForGuessedChar('Q');
        buttonForQ.setDisable(true);
    }

    @FXML
    void buttonR(ActionEvent event) {
        setLabelForGuessedChar('R');
        buttonForR.setDisable(true);
    }

    @FXML
    void buttonS(ActionEvent event) {
        setLabelForGuessedChar('S');
        buttonForS.setDisable(true);
    }

    @FXML
    void buttonT(ActionEvent event) {
        setLabelForGuessedChar('T');
        buttonForT.setDisable(true);
    }

    @FXML
    void buttonU(ActionEvent event) {
        setLabelForGuessedChar('U');
        buttonForU.setDisable(true);
    }

    @FXML
    void buttonV(ActionEvent event) {
        setLabelForGuessedChar('V');
        buttonForV.setDisable(true);
    }

    @FXML
    void buttonW(ActionEvent event) {
        setLabelForGuessedChar('W');
        buttonForW.setDisable(true);
    }

    @FXML
    void buttonX(ActionEvent event) {
        setLabelForGuessedChar('X');
        buttonForX.setDisable(true);
    }

    @FXML
    void buttonY(ActionEvent event) {
        setLabelForGuessedChar('Y');
        buttonForY.setDisable(true);
    }

    @FXML
    void buttonZ(ActionEvent event) {
        setLabelForGuessedChar('Z');
        buttonForZ.setDisable(true);
    }


    public void setLabelForGuessedChar(char letter){
        labelForError.setText("");
        String indexString = word.wordCheck(letter);
        if (!indexString.isEmpty()) {
            String[] indexList = indexString.split(",");
            for (String item : indexList){
                int index = Integer.parseInt(item) * 2;
                wordBuild.replace(index,index + 1, Character.toString(letter));
            }
            labelForWord.setText(wordBuild.toString());
            win(wordBuild);
        }
        else{
            turn--;
            outOfAttempt(turn);
        }

    }
    @FXML
    void buttonForNext(ActionEvent event){
        labelForError.setText("");
        buttonNext.setDisable(true);
        // Figure out how scoring works.
        word = Function.wordPick(wordList);
        if (word == null){
            labelForError.setTextFill(Color.GREEN);
            labelForError.setText("There is no more word!");
        }
        else {
            normalState();
        }
    }

    @FXML
    void hintTrigger(){
        labelForError.setText("");
        if (game.getScore() > 0){
            game.hintUsed();
            wordBuild = Function.hintIndex(wordBuild,word.getWord());
            labelForWord.setText(wordBuild.toString());
            labelForGuessNumber.setText(Integer.toString(turn));
            labelForScore.setText(Integer.toString(game.getScore()));
            win(wordBuild);
        }
        else{
            labelForError.setTextFill(Color.RED);
            labelForError.setText("Not enough point to use hint!");
        }
    }
    @FXML
    void saveGameTrigger(ActionEvent event) {
        labelForError.setText("");
        boolean succeeded = Data.Writer(game, wordList);
        if (succeeded){
            labelForError.setTextFill(Color.GREEN);
            labelForError.setText("Game is saved!");
        }
        else{
            labelForError.setTextFill(Color.RED);
            labelForError.setText("Game is unable to save!");
        }
    }

    @FXML
    void loadGameTrigger(ActionEvent even){
        labelForError.setText("");
        buttonNext.setDisable(true);
        buttonHint.setDisable(false);
        wordBuild.delete(0,wordBuild.length());
        game = Data.progressReader();
        if (game != null) {
            labelForError.setTextFill(Color.GREEN);
            labelForError.setText("Game is loaded successfully!");
            wordList = Data.getSavedWordList();
            word = Function.wordPick(wordList);
            normalState();
        }
        else{
            labelForError.setTextFill(Color.RED);
            labelForError.setText("Game is unable to load");
        }
    }
    // Win state
    public void win(StringBuilder wordBuild){
        labelForError.setText("");
        int indexOfWord = Function.getIndexOfWord();
        wordList.remove(indexOfWord);
        String wordString = wordBuild.toString();
        if (!wordString.contains("_")){
            winTimes++;
            buttonHint.setDisable(true);
            buttonNext.setDisable(false);
            buttonForA.setDisable(true);
            buttonForB.setDisable(true);
            buttonForC.setDisable(true);
            buttonForD.setDisable(true);
            buttonForE.setDisable(true);
            buttonForF.setDisable(true);
            buttonForG.setDisable(true);
            buttonForH.setDisable(true);
            buttonForI.setDisable(true);
            buttonForJ.setDisable(true);
            buttonForK.setDisable(true);
            buttonForL.setDisable(true);
            buttonForM.setDisable(true);
            buttonForN.setDisable(true);
            buttonForO.setDisable(true);
            buttonForP.setDisable(true);
            buttonForQ.setDisable(true);
            buttonForR.setDisable(true);
            buttonForS.setDisable(true);
            buttonForT.setDisable(true);
            buttonForU.setDisable(true);
            buttonForV.setDisable(true);
            buttonForW.setDisable(true);
            buttonForX.setDisable(true);
            buttonForY.setDisable(true);
            buttonForZ.setDisable(true);
            labelForError.setTextFill(Color.GREEN);
            game.setScore(2);
            game.setLevel();
            labelForError.setText("You guessed it right!");
        }
    }
    // Normal state = playing
    public void normalState(){
        if (word.getWordLength() >= 7){
            turn = 7;
        }
        else {
            turn = word.getWordLength() + 2;
        }
        labelForLevel.setText(Integer.toString(game.getLevel()));
        labelForScore.setText(Integer.toString(game.getScore()));
        labelForGuessNumber.setTextFill(Color.BLACK);
        labelForGuessNumber.setText(Integer.toString(turn));
        wordBuild.delete(0, wordBuild.length());
        for (int i = 0; i < word.getWordLength(); i++) {
            wordBuild.append("_ ");
        }
        labelForWord.setText(wordBuild.toString());
        buttonHint.setDisable(false);
        buttonForA.setDisable(false);
        buttonForB.setDisable(false);
        buttonForC.setDisable(false);
        buttonForD.setDisable(false);
        buttonForE.setDisable(false);
        buttonForF.setDisable(false);
        buttonForG.setDisable(false);
        buttonForH.setDisable(false);
        buttonForI.setDisable(false);
        buttonForJ.setDisable(false);
        buttonForK.setDisable(false);
        buttonForL.setDisable(false);
        buttonForM.setDisable(false);
        buttonForN.setDisable(false);
        buttonForO.setDisable(false);
        buttonForP.setDisable(false);
        buttonForQ.setDisable(false);
        buttonForR.setDisable(false);
        buttonForS.setDisable(false);
        buttonForT.setDisable(false);
        buttonForU.setDisable(false);
        buttonForV.setDisable(false);
        buttonForW.setDisable(false);
        buttonForX.setDisable(false);
        buttonForY.setDisable(false);
        buttonForZ.setDisable(false);
    }

    // Check the attempt
    public void outOfAttempt(int attempt){
        if (attempt == 0){
            loseTimes++;
            labelForGuessNumber.setTextFill(Color.RED);
            labelForGuessNumber.setText(Integer.toString(turn));
            labelForError.setTextFill(Color.RED);
            labelForError.setText("Out of Attempt!");
            buttonHint.setDisable(true);
            buttonNext.setDisable(false);
            buttonForA.setDisable(true);
            buttonForB.setDisable(true);
            buttonForC.setDisable(true);
            buttonForD.setDisable(true);
            buttonForE.setDisable(true);
            buttonForF.setDisable(true);
            buttonForG.setDisable(true);
            buttonForH.setDisable(true);
            buttonForI.setDisable(true);
            buttonForJ.setDisable(true);
            buttonForK.setDisable(true);
            buttonForL.setDisable(true);
            buttonForM.setDisable(true);
            buttonForN.setDisable(true);
            buttonForO.setDisable(true);
            buttonForP.setDisable(true);
            buttonForQ.setDisable(true);
            buttonForR.setDisable(true);
            buttonForS.setDisable(true);
            buttonForT.setDisable(true);
            buttonForU.setDisable(true);
            buttonForV.setDisable(true);
            buttonForW.setDisable(true);
            buttonForX.setDisable(true);
            buttonForY.setDisable(true);
            buttonForZ.setDisable(true);
            labelForError.setTextFill(Color.RED);
            labelForError.setText("Out of attempt, try harder next time!");
        }
        else{
            labelForGuessNumber.setTextFill(Color.BLACK);
            labelForGuessNumber.setText(Integer.toString(turn));
        }
    }

    @FXML
    public void initialize(){
        // Set the game
        game = new Game(0,0);
        buttonNext.setDisable(true);
        buttonHint.setDisable(false);
        labelForGuessNumber.setText(Integer.toString(turn));
        labelForLevel.setText(Integer.toString(game.getLevel()));
        labelForScore.setText(Integer.toString(game.getScore()));
        // Read the word.txt file
        wordList = Data.Reader();
        // Pick a random word
        if (wordList != null) {
            word = Function.wordPick(wordList);
            int wordLength = word.getWordLength();
            if (wordLength >= 7){
                turn = 7;
            }
            else {
                turn = wordLength + 2;
            }
            labelForGuessNumber.setText(Integer.toString(turn));
            for (int i = 0; i < wordLength; i++) {
                wordBuild.append("_ ");
            }
            labelForWord.setText(wordBuild.toString());
        }
        else{
            labelForError.setTextFill(Color.RED);
            labelForError.setText("wordList is null!");
        }
    }
}
