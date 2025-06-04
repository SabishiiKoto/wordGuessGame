package sabishiikoto.wordguess;

public class Word {
    private final String word;
    private final int wordLength;
    private boolean status;
    public Word(String word){
        this.word = word;
        this.wordLength = wordLengthCount(word);
        this.status = false;

    }
    public static int wordLengthCount(String word){
        return word.length();
    }

    /**
     * Change status from false (never used) to true (used).
     */
    public void setStatus(){
        this.status = true;
    }

    public String getWord(){
        return this.word;
    }
    public int getWordLength(){
        return this.wordLength;
    }
    public boolean getStatus(){
        return this.status;
    }

    public String wordCheck(char letter){
        String string = "";
        for (int i = 0; i < this.wordLength; i++){
            if (this.word.charAt(i) == letter){
                string += i;
                string += ",";
            }
        }
        return string;
    }
}
