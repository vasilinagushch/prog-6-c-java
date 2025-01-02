// puzzle.java

/**
 * Класс, представляющий загадку в игре.
 */
public class Puzzle extends GameItem implements Cloneable {
    private String question;  // Вопрос загадки
    private Option[] options;  // Варианты ответа
    private int correctAnswerIndex;  // Индекс правильного ответа
    private Hint[] hints;  // Подсказки
    private int attempts;  // Количество попыток

    public Puzzle(String question, int correctAnswerIndex, String hintText1, String hintText2, String hintText3, String option1, String option2, String option3) {
        super("Puzzle", question);  // Вызов конструктора базового класса
        this.correctAnswerIndex = correctAnswerIndex;
        this.attempts = 0;
        this.options = new Option[]{new Option(option1), new Option(option2), new Option(option3)};
        this.hints = new Hint[]{new Hint(hintText1), new Hint(hintText2), new Hint(hintText3)};
    }

    public String getQuestion() {
        return question;  // Возвращает вопрос
    }

    public String getOption(int index) {
        return options[index].getText();  // Возвращает текст варианта ответа
    }

    public String getHint(int index) {
        return hints[index].getText();  // Возвращает текст подсказки
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;  // Возвращает индекс правильного ответа
    }

    public int getAttempts() {
        return attempts;  // Возвращает количество попыток
    }

    public void incrementAttempts() {
        attempts++;  // Увеличивает количество попыток
    }

    public void resetAttempts() {
        attempts = 0;  // Сбрасывает количество попыток
    }

    @Override
    public void display() {
        System.out.println("Puzzle: " + question);  // Отображает вопрос загадки
    }

    @Override
    public String toString() {
        return "Puzzle{question='" + question + "'}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Мелкое клонирование
    }

    public Puzzle deepClone() {
        return new Puzzle(this.question, this.correctAnswerIndex, this.hints[0].getText(), this.hints[1].getText(), this.hints[2].getText(), this.options[0].getText(), this.options[1].getText(), this.options[2].getText());  // Глубокое клонирование
    }
}


