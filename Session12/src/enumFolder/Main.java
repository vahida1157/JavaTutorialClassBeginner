package enumFolder;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(GameDifficulty.FATAL);
//        switch (game.getDifficulty()) {
//            case VERY_HARD:
//                System.out.println("بازی " + game.getDifficulty().getDescription() + " است.");
//                break;
//            case HARD:
//                System.out.println("game is hard");
//                break;
//            case MEDIUM:
//                System.out.println("game is medium");
//                break;
//            case EASY:
//                System.out.println("game is easy");
//                break;
//            case VERY_EASY:
//                System.out.println("game is very easy");
//                break;
//        }

        System.out.println("بازی " + game.getDifficulty().getDescription() + " و از درجه " + game.getDifficulty().getNumber() + " است.");
    }
}
