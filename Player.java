// player.java

/**
 * Класс, представляющий игрока в игре.
 */
public class Player {
    protected String name;  // Имя игрока
    protected int score;    // Очки игрока
    private static int playerCount = 0;  // Общее количество игроков

    public Player() {
        this.name = "";
        this.score = 0;
        playerCount++;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
        playerCount++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        this.score++;  // Увеличение очков на 1
    }

    public void resetScore() {
        this.score = 0;  // Сброс очков
    }

    public void setName(String name) {
        this.name = name;  // Установка имени
    }

    public static int getPlayerCount() {
        return playerCount;  // Возвращает количество игроков
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', score=" + score + "}";
    }
}
