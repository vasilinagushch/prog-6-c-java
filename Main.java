// main.java
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Главный класс программы, который запускает игру.
 */
public class Main {
    public static void main(String[] args) {
        // Устанавливаем локаль на русскую
        Locale.setDefault(new Locale("ru", "RU"));
        // Инициализация генератора случайных чисел
        new Random().setSeed(System.currentTimeMillis());

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя (используя английские символы): ");
        String name = scanner.nextLine();
        game.setPlayerName(name);
        game.initializePuzzles();
        game.initializePhrases();
        game.startGame();

        // Демонстрация использования вспомогательного класса
        ScoreHelper scoreHelper = game.getPlayerScoreHelper();
        System.out.println("Очки игрока через вспомогательный класс: " + scoreHelper.getScore());

        // Демонстрация работы с массивом объектов
        System.out.println("Все загадки:");
        game.printAllPuzzles();

        // Демонстрация работы с двумерным массивом объектов
        System.out.println("Двумерный массив загадок:");
        game.demoTwoDimensionalArray();

        // Демонстрация обработки строк
        String phrase = "Пример строки";
        System.out.println("Длина строки: " + phrase.length());
        System.out.println("Строка в верхнем регистре: " + phrase.toUpperCase());

        scanner.close();
    }
}


