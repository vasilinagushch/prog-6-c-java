// phrase.java

/**
 * Класс, представляющий фразу, используемую в игре.
 */
public class Phrase {
    private String text;  // Текст фразы

    public Phrase(String text) {
        this.text = text;
    }

    public String getText() {
        return text;  // Возвращает текст фразы
    }

    @Override
    public String toString() {
        return "Phrase{text='" + text + "'}";
    }
}


