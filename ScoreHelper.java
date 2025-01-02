// scoreHelper.java

/**
 * Класс вспомогательных методов для работы с очками игрока.
 */
public class ScoreHelper {
    private int score;  // Очки

    public ScoreHelper(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;  // Возвращает количество очков
    }

    @Override
    public String toString() {
        return "ScoreHelper{score=" + score + "}";
    }
}
