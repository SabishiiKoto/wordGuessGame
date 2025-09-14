package sabishiikoto.wordguess;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
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
    private AnchorPane anchorPane;

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
    private Button buttonNext;

    @FXML
    private Label labelForAttempt;

    @FXML
    private Label labelForError;

    @FXML
    private Label labelForGuessNumber;

    @FXML
    private Label labelForLevel;

    @FXML
    private Label labelForPassedRound;

    @FXML
    private Label labelForScore;

    @FXML
    private Label labelForTitle;

    @FXML
    private Label labelForTotalPoint;

    @FXML
    private Label labelForWord;

    @FXML
    private MenuBar menuBar;

    @FXML
    void aboutTrigger(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About This Word Guess Game!");
        alert.setHeaderText("Information and Contact");
        alert.setContentText("Please notice me if there is any error.\nFor contact, check out my GitHub:\nhttps://github.com/SabishiiKoto");
        alert.showAndWait();
    }

    @FXML
    void blueTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #48b5d6;");

        anchorPane.setStyle("-fx-background-color: #E8F9FD;");

        String style = "-fx-text-fill: #083346;";
        labelForTitle.setStyle(style);
        labelForGuessNumber.setStyle(style);
        labelForAttempt.setStyle(style);
        labelForPassedRound.setStyle(style);
        labelForLevel.setStyle(style);
        labelForTotalPoint.setStyle(style);
        labelForScore.setStyle(style);
        labelForError.setStyle(style);
        labelForWord.setStyle("-fx-background-color: #E8F9FD; -fx-text-fill: #046C95;");

        style = "-fx-background-color: #B3E0EE; -fx-text-fill: #046C95;";
        buttonForA.setStyle(style);
        buttonForB.setStyle(style);
        buttonForC.setStyle(style);
        buttonForD.setStyle(style);
        buttonForE.setStyle(style);
        buttonForF.setStyle(style);
        buttonForG.setStyle(style);
        buttonForH.setStyle(style);
        buttonForI.setStyle(style);
        buttonForJ.setStyle(style);
        buttonForK.setStyle(style);
        buttonForL.setStyle(style);
        buttonForM.setStyle(style);
        buttonForN.setStyle(style);
        buttonForO.setStyle(style);
        buttonForP.setStyle(style);
        buttonForQ.setStyle(style);
        buttonForR.setStyle(style);
        buttonForS.setStyle(style);
        buttonForT.setStyle(style);
        buttonForU.setStyle(style);
        buttonForV.setStyle(style);
        buttonForW.setStyle(style);
        buttonForX.setStyle(style);
        buttonForY.setStyle(style);
        buttonForZ.setStyle(style);

        buttonHint.setStyle("-fx-background-color: #48b5d6; -fx-text-fill: #E8F9FD;");
        buttonNext.setStyle("-fx-background-color: #48b5d6; -fx-text-fill: #E8F9FD;");

    }
    @FXML
    void pinkTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #EABEC3;");

        anchorPane.setStyle("-fx-background-color: #FFF0F3;");

        String style = "-fx-text-fill: #D0637C;";
        labelForTitle.setStyle(style);
        labelForGuessNumber.setStyle(style);
        labelForAttempt.setStyle(style);
        labelForPassedRound.setStyle(style);
        labelForLevel.setStyle(style);
        labelForTotalPoint.setStyle(style);
        labelForScore.setStyle(style);
        labelForError.setStyle(style);
        labelForWord.setStyle("-fx-background-color: #FFF0F3; -fx-text-fill: #DD868C;");

        style = "-fx-background-color: #F5DDE0  ; -fx-text-fill: #DD868C ;";
        buttonForA.setStyle(style);
        buttonForB.setStyle(style);
        buttonForC.setStyle(style);
        buttonForD.setStyle(style);
        buttonForE.setStyle(style);
        buttonForF.setStyle(style);
        buttonForG.setStyle(style);
        buttonForH.setStyle(style);
        buttonForI.setStyle(style);
        buttonForJ.setStyle(style);
        buttonForK.setStyle(style);
        buttonForL.setStyle(style);
        buttonForM.setStyle(style);
        buttonForN.setStyle(style);
        buttonForO.setStyle(style);
        buttonForP.setStyle(style);
        buttonForQ.setStyle(style);
        buttonForR.setStyle(style);
        buttonForS.setStyle(style);
        buttonForT.setStyle(style);
        buttonForU.setStyle(style);
        buttonForV.setStyle(style);
        buttonForW.setStyle(style);
        buttonForX.setStyle(style);
        buttonForY.setStyle(style);
        buttonForZ.setStyle(style);

        buttonHint.setStyle("-fx-background-color: #EABEC3 ; -fx-text-fill: #FFF0F3 ;");
        buttonNext.setStyle("-fx-background-color: #EABEC3 ; -fx-text-fill: #FFF0F3 ;");
    }
    @FXML
    void greenTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #549895;");

        anchorPane.setStyle("-fx-background-color: #D6F5E9 ;");

        String style = "-fx-text-fill: #245254;";
        labelForTitle.setStyle(style);
        labelForGuessNumber.setStyle(style);
        labelForAttempt.setStyle(style);
        labelForPassedRound.setStyle(style);
        labelForLevel.setStyle(style);
        labelForTotalPoint.setStyle(style);
        labelForScore.setStyle(style);
        labelForError.setStyle(style);
        labelForWord.setStyle("-fx-background-color: #D6F5E9 ; -fx-text-fill: #387271;");

        style = "-fx-background-color: #8EBCB1; -fx-text-fill: #387271 ;";
        buttonForA.setStyle(style);
        buttonForB.setStyle(style);
        buttonForC.setStyle(style);
        buttonForD.setStyle(style);
        buttonForE.setStyle(style);
        buttonForF.setStyle(style);
        buttonForG.setStyle(style);
        buttonForH.setStyle(style);
        buttonForI.setStyle(style);
        buttonForJ.setStyle(style);
        buttonForK.setStyle(style);
        buttonForL.setStyle(style);
        buttonForM.setStyle(style);
        buttonForN.setStyle(style);
        buttonForO.setStyle(style);
        buttonForP.setStyle(style);
        buttonForQ.setStyle(style);
        buttonForR.setStyle(style);
        buttonForS.setStyle(style);
        buttonForT.setStyle(style);
        buttonForU.setStyle(style);
        buttonForV.setStyle(style);
        buttonForW.setStyle(style);
        buttonForX.setStyle(style);
        buttonForY.setStyle(style);
        buttonForZ.setStyle(style);

        buttonHint.setStyle("-fx-background-color: #549895; -fx-text-fill: #D6F5E9;");
        buttonNext.setStyle("-fx-background-color: #549895; -fx-text-fill: #D6F5E9;");
    }
    @FXML
    void vintageTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #F6BD60;");

        anchorPane.setStyle("-fx-background-color: #F7EDE2;");

        String style = "-fx-text-fill: #F28482;";
        labelForTitle.setStyle(style);
        labelForGuessNumber.setStyle(style);
        labelForAttempt.setStyle(style);
        labelForPassedRound.setStyle(style);
        labelForLevel.setStyle(style);
        labelForTotalPoint.setStyle(style);
        labelForScore.setStyle(style);
        labelForError.setStyle(style);
        labelForWord.setStyle("-fx-background-color: #F7EDE2; -fx-text-fill: #F6BD60;");

        style = "-fx-background-color: #84A59D; -fx-text-fill: #F7EDE2;";
        buttonForA.setStyle(style);
        buttonForB.setStyle(style);
        buttonForC.setStyle(style);
        buttonForD.setStyle(style);
        buttonForE.setStyle(style);
        buttonForF.setStyle(style);
        buttonForG.setStyle(style);
        buttonForH.setStyle(style);
        buttonForI.setStyle(style);
        buttonForJ.setStyle(style);
        buttonForK.setStyle(style);
        buttonForL.setStyle(style);
        buttonForM.setStyle(style);
        buttonForN.setStyle(style);
        buttonForO.setStyle(style);
        buttonForP.setStyle(style);
        buttonForQ.setStyle(style);
        buttonForR.setStyle(style);
        buttonForS.setStyle(style);
        buttonForT.setStyle(style);
        buttonForU.setStyle(style);
        buttonForV.setStyle(style);
        buttonForW.setStyle(style);
        buttonForX.setStyle(style);
        buttonForY.setStyle(style);
        buttonForZ.setStyle(style);

        buttonHint.setStyle("-fx-background-color: #F28482 ; -fx-text-fill: #F7EDE2;");
        buttonNext.setStyle("-fx-background-color: #F28482 ; -fx-text-fill: #F7EDE2;");
    }
    @FXML
    void darkTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #2B2F6C;");

        anchorPane.setStyle("-fx-background-color: #564779;");

        String style = "-fx-text-fill: #DE978F;";
        labelForTitle.setStyle(style);
        labelForGuessNumber.setStyle(style);
        labelForAttempt.setStyle(style);
        labelForPassedRound.setStyle(style);
        labelForLevel.setStyle(style);
        labelForTotalPoint.setStyle(style);
        labelForScore.setStyle(style);
        labelForError.setStyle(style);
        labelForWord.setStyle("-fx-background-color: #564779; -fx-text-fill: #DE978F;");

        style = "-fx-background-color: #2B2F6C; -fx-text-fill: #DE978F;";
        buttonForA.setStyle(style);
        buttonForB.setStyle(style);
        buttonForC.setStyle(style);
        buttonForD.setStyle(style);
        buttonForE.setStyle(style);
        buttonForF.setStyle(style);
        buttonForG.setStyle(style);
        buttonForH.setStyle(style);
        buttonForI.setStyle(style);
        buttonForJ.setStyle(style);
        buttonForK.setStyle(style);
        buttonForL.setStyle(style);
        buttonForM.setStyle(style);
        buttonForN.setStyle(style);
        buttonForO.setStyle(style);
        buttonForP.setStyle(style);
        buttonForQ.setStyle(style);
        buttonForR.setStyle(style);
        buttonForS.setStyle(style);
        buttonForT.setStyle(style);
        buttonForU.setStyle(style);
        buttonForV.setStyle(style);
        buttonForW.setStyle(style);
        buttonForX.setStyle(style);
        buttonForY.setStyle(style);
        buttonForZ.setStyle(style);

        buttonHint.setStyle("-fx-background-color: #000c43 ; -fx-text-fill: #DE978F;");
        buttonNext.setStyle("-fx-background-color: #000c43 ; -fx-text-fill: #DE978F;");

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
            labelForError.setText("Not enough point to use hint!");
        }
    }
    @FXML
    void saveGameTrigger(ActionEvent event) {
        labelForError.setText("");
        boolean succeeded = Data.Writer(game, wordList);
        if (succeeded){
            labelForError.setText("Game is saved!");
        }
        else{
            labelForError.setText("Game is unable to save!");
        }
    }
    @FXML
    void saveExitTrigger(ActionEvent event) {
        labelForError.setText("");
        boolean succeeded = Data.Writer(game, wordList);
        if (succeeded){
            Platform.exit();
        }
        else{
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
            labelForError.setText("Game is loaded successfully!");
            wordList = Data.getSavedWordList();
            word = Function.wordPick(wordList);
            normalState();
        }
        else{
            labelForError.setText("Game is unable to load");
        }
    }
    // Win state
    public void win(StringBuilder wordBuild){
        labelForError.setText("");
        int indexOfWord = Function.getIndexOfWord();
        String wordString = wordBuild.toString();
        if (!wordString.contains("_")){
            winTimes++;
            wordList.remove(indexOfWord);
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
            labelForGuessNumber.setText(Integer.toString(turn));
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
            labelForError.setText("Out of attempt, try harder next time!");
        }
        else{
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
            labelForError.setText("wordList is null!");
        }
    }
}
