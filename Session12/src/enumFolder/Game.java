package enumFolder;

public class Game {
    private GameDifficulty difficulty;

    public Game(GameDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public GameDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(GameDifficulty difficulty) {
        this.difficulty = difficulty;
    }
}
