// pair.java

/**
 * Шаблонный класс, представляющий пару объектов.
 */
public class Pair<T, U> {
    private T first;  // Первый элемент пары
    private U second;  // Второй элемент пары

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;  // Возвращает первый элемент
    }

    public U getSecond() {
        return second;  // Возвращает второй элемент
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}
