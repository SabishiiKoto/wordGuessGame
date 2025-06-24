package sabishiikoto.wordguess;

import java.io.*;
import java.util.ArrayList;

public class Data {
    private static ArrayList<Word> wordArrayList = new ArrayList<>();
    public static ArrayList<Word> Reader(){
        String fileName = "word.txt";
        File file = new File(fileName);
        ArrayList<Word> wordList = new ArrayList<>();
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file.getAbsolutePath())) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                while (line != null) {
                    line = line.replaceAll("\\n$","");
                    String[] stringList = line.split(" ");
                    for (String item : stringList) {
                        Word word = new Word(item.toUpperCase());
                        wordList.add(word);
                    }
                    line = bufferedReader.readLine();
                }
                return wordList;
            }
            catch(IOException e){

            }
        }
        else{
            System.out.println("File can't read");
        }
        return null;
    }
    public static Game progressReader(){
        wordArrayList.clear();
        File file = new File("savedProgress.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
            int level = Integer.parseInt(line);
            line = bufferedReader.readLine();
            int score = Integer.parseInt(line);
            Game game = new Game(level, score);
            line = bufferedReader.readLine();
            while (line != null){
                line.trim();
                String[] wordStringList = line.split(" ");
                for (String wordString : wordStringList){
                    Word word = new Word(wordString);
                    wordArrayList.add(word);
                }
                line = bufferedReader.readLine();
            }
            return game;
        }
        catch (IOException e){

        }
        return null;
    }
    public static boolean Writer(Game game, ArrayList<Word> wordList){
        File file = new File("savedProgress.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(game.getLevel() + "\n");
            bufferedWriter.write(game.getScore() + "\n");
            for (Word word : wordList){
                bufferedWriter.write(word.getWord() + " ");
            }
            bufferedWriter.flush();
            return true;
        }
        catch (IOException e){

        }
        return false;
    }

    public static ArrayList<Word> getSavedWordList(){
        return wordArrayList;
    }
}
