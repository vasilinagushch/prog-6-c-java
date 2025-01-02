// advancedPlayer.java

/**
 * Производный класс, представляющий продвинутого игрока с рангом.
 */
public class AdvancedPlayer extends Player {
    private String rank;  // Ранг игрока

    public AdvancedPlayer() {
        super();  // Вызов конструктора базового класса
        this.rank = "Beginner";
    }

    public AdvancedPlayer(String name, String rank) {
        super(name);  // Вызов конструктора базового класса с параметром
        this.rank = rank;
    }

    protected void increaseScore(int points) {
        this.score += points;  // Используем защищенное поле базового класса для увеличения очков
    }

    @Override
    public void incrementScore() {
        increaseScore(2);  // Увеличение очков на 2 вместо 1
    }

    public void incrementScore(boolean doublePoints) {
        if (doublePoints) {
            super.incrementScore();  // Вызов метода базового класса
            super.incrementScore();
        } else {
            incrementScore();
        }
    }

    @Override
    public String toString() {
        return "AdvancedPlayer{name='" + getName() + "', score=" + getScore() + ", rank='" + rank + "'}";
    }
}
