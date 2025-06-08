package sabishiikoto.wordguess;

public class Game {
    private int level;
    private int score;
    public Game(int level, int score){
        this.level = level;
        this.score = score;
    }
    public void setLevel(){
        this.level += 1;
    }

    public void setScore(int score){
        this.score += score;
    }
    public int getLevel(){
        return this.level;
    }
    public int getScore(){
        return this.score;
    }

    public void hintUsed(){
        this.score -= 1;
    }
}
