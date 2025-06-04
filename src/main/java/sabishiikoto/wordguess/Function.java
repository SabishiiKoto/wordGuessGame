package sabishiikoto.wordguess;
import java.util.*;

public class Function {


    public static Word wordPick(ArrayList<Word> wordList){
        Random random = new Random();
        int randomNumber = random.nextInt(wordList.size() - 1);
        return wordList.get(randomNumber);
    }
    public static boolean win(StringBuilder wordBuild){
        // Check the guess attempt left
        String word = wordBuild.toString();
        if (word.contains("_")){
            return false;
        }
        return true;
    }
}
