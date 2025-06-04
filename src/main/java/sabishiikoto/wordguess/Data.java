package sabishiikoto.wordguess;

import java.io.*;
import java.util.ArrayList;

public class Data {
    public static ArrayList<Word> Reader(){
        String fileName = "word.csv";
        File file = new File(fileName);
        System.out.println("hello");
        ArrayList<Word> wordList = new ArrayList<>();
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file.getAbsolutePath())) {
                System.out.println("Hello");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                System.out.println(line);
                while (line != null) {
                    String[] stringList = line.split(",");
                    for (String item : stringList) {
                        Word word = new Word(item);
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
        File file = new File("savedProgress.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
            int level = Integer.parseInt(line);
            line = bufferedReader.readLine();
            int score = Integer.parseInt(line);
            Game game = new Game(level, score);
            return game;
        }
        catch (IOException e){

        }
        return null;
    }
    public static void Writer(Game game){
        File file = new File("savedProgress.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(game.getLevel());
            bufferedWriter.write(game.getScore());
            bufferedWriter.flush();
        }
        catch (IOException e){

        }
    }

}
