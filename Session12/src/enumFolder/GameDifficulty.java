package enumFolder;

public enum GameDifficulty {
    FATAL("غیرقابل عبور", 30),
    VERY_HARD("خیلی سخت", 10),
    HARD("سخت", 7),
    MEDIUM("متوسط", 5),
    EASY("ساده", 3),
    VERY_EASY("خیلی ساده", 1);

    private String description;
    private int number;

    GameDifficulty(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }
}
