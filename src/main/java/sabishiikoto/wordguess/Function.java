package sabishiikoto.wordguess;
import java.util.*;

public class Function {
    public static int indexOfWord;
    public static Word wordPick(ArrayList<Word> wordList){
        Word word;
        int loop = 0;
        Random random = new Random();
        indexOfWord = random.nextInt(0,wordList.size());
        word = wordList.get(indexOfWord);
        while (word.getStatus()){
            indexOfWord = random.nextInt(0,wordList.size());
            word = wordList.get(indexOfWord);
            loop++;
//            if (loop == 5){
//                break;
//            }
        }
        if (loop == 5){
            return null;
        }
        return wordList.get(indexOfWord);
    }


    public static StringBuilder hintIndex(StringBuilder word, String actualWord){
        String indexString = "";
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == '_'){
                indexString += i;
                indexString += ",";
            }
        }
        String[] indexList = indexString.split(",");
        Random random = new Random();
        int index = random.nextInt(0,indexList.length);
        int indexInWord = Integer.parseInt(indexList[index]);
        int indexInActualWord = indexInWord/2;
        char letter = actualWord.charAt(indexInActualWord);
        word.replace(indexInWord,indexInWord + 1, Character.toString(letter));
        return word;
    }
    public static int getIndexOfWord(){
        return indexOfWord;
    }
}
