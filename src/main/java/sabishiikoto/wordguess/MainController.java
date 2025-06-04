package sabishiikoto.wordguess;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class MainController {
    private Game game;
    private Word word;
    public ArrayList<Word> wordList;
    private StringBuilder wordBuild;

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
        alert.setTitle("About!");
        alert.setHeaderText("Information and Contact");
        alert.setContentText("This is a word guess game!");
    }

    @FXML
    void buttonA(ActionEvent event) {

    }

    @FXML
    void buttonB(ActionEvent event) {

    }

    @FXML
    void buttonC(ActionEvent event) {

    }

    @FXML
    void buttonD(ActionEvent event) {

    }

    @FXML
    void buttonE(ActionEvent event) {

    }

    @FXML
    void buttonF(ActionEvent event) {

    }

    @FXML
    void buttonG(ActionEvent event) {

    }

    @FXML
    void buttonH(ActionEvent event) {

    }

    @FXML
    void buttonI(ActionEvent event) {

    }

    @FXML
    void buttonJ(ActionEvent event) {

    }

    @FXML
    void buttonK(ActionEvent event) {

    }

    @FXML
    void buttonL(ActionEvent event) {

    }

    @FXML
    void buttonM(ActionEvent event) {

    }

    @FXML
    void buttonN(ActionEvent event) {

    }

    @FXML
    void buttonO(ActionEvent event) {

    }

    @FXML
    void buttonP(ActionEvent event) {

    }

    @FXML
    void buttonQ(ActionEvent event) {

    }

    @FXML
    void buttonR(ActionEvent event) {

    }

    @FXML
    void buttonS(ActionEvent event) {

    }

    @FXML
    void buttonT(ActionEvent event) {

    }

    @FXML
    void buttonU(ActionEvent event) {

    }

    @FXML
    void buttonV(ActionEvent event) {

    }

    @FXML
    void buttonW(ActionEvent event) {

    }

    @FXML
    void buttonX(ActionEvent event) {

    }

    @FXML
    void buttonY(ActionEvent event) {

    }

    @FXML
    void buttonZ(ActionEvent event) {

    }

    public void setLabelForGuessedChar(char letter){
        String indexString = word.wordCheck(letter);
        if (indexString != "") {
            String[] indexList = indexString.split(",");
            for (String item : indexList){
                int index = Integer.parseInt(item);
                wordBuild.replace(index,index + 1, Character.toString(letter));
            }
            labelForWord.setText(wordBuild.toString());
        }

    }
    @FXML
    void buttonForNext(ActionEvent event){
        game.setLevel();
        game.setScore(1); // Figure out how scoring works.
        word.setStatus();
        word = Function.wordPick(wordList);
        for (int i = 0; i < word.getWordLength(); i++){
            wordBuild.append("_");
        }
        labelForWord.setText(wordBuild.toString());
    }

    @FXML
    void saveGameTrigger(ActionEvent event) {
        Data.Writer(game);
    }

    @FXML
    void loadGameTrigger(ActionEvent even){
        Game game = Data.progressReader();
        int level = game.getLevel();
        int score = game.getScore();
        labelForLevel.setText(Integer.toString(level));
        labelForScore.setText(Integer.toString(score));
    }

    @FXML
    public void initialize(){
        Game game = new Game(1,0);
        wordList = Data.Reader();
        if (wordList != null) {
            word = Function.wordPick(wordList);
            int wordLength = word.getWordLength();
            for (int i = 0; i < wordLength; i++) {
                wordBuild.append("_");
            }
            labelForWord.setText(wordBuild.toString());
        }
        else{
            labelForError.setTextFill(Color.RED);
            labelForError.setText("wordList is null!");
        }
    }
}
