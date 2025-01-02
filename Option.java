// option.java

/**
 * Класс, представляющий вариант ответа в загадке.
 */
public class Option {
    private String text;  // Текст варианта ответа

    public Option(String text) {
        this.text = text;
    }

    public String getText() {
        return text;  // Возвращает текст варианта ответа
    }

    @Override
    public String toString() {
        return "Option{text='" + text + "'}";
    }
}


