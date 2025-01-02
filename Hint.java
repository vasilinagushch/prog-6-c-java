// hint.java

/**
 * Класс, представляющий подсказку в загадке.
 */
public class Hint {
    private String text;  // Текст подсказки

    public Hint(String text) {
        this.text = text;
    }

    public String getText() {
        return text;  // Возвращает текст подсказки
    }

    @Override
    public String toString() {
        return "Hint{text='" + text + "'}";
    }
}



